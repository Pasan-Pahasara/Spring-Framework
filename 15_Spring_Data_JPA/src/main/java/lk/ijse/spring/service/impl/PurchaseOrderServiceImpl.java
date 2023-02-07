package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.OrdersDTO;
import lk.ijse.spring.entity.Item;
import lk.ijse.spring.entity.OrderDetails;
import lk.ijse.spring.entity.Orders;
import lk.ijse.spring.repo.ItemRepo;
import lk.ijse.spring.repo.OrdersRepo;
import lk.ijse.spring.service.PurchaseOrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author : ShEnUx
 * @time : 1:31 PM
 * @date : 2/7/2023
 * @since : 0.1.0
 **/
@Service
@Transactional
public class PurchaseOrderServiceImpl implements PurchaseOrderService {
    @Autowired
    private OrdersRepo repo;
    @Autowired
    private ModelMapper mapper;
    @Autowired
    private ItemRepo itemRepo;
    @Override
    public void purchaseOrder(OrdersDTO ordersDTO) {
        if (repo.existsById(ordersDTO.getOid())) {
            throw new RuntimeException("Order"+ordersDTO.getOid()+" Already Exist..!");
        }
        Orders orders = mapper.map(ordersDTO, Orders.class);
        repo.save(orders);

        //Update Item Qty
        for (OrderDetails orderDetail : orders.getOrderDetails()) {
            Item item = itemRepo.findById(orderDetail.getItemCode()).get();
            item.setQtyOnHand(item.getQtyOnHand()-orderDetail.getQty());
            itemRepo.save(item);
        }

    }
}
