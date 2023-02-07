package lk.ijse.spring.controller;

import lk.ijse.spring.dto.OrdersDTO;
import lk.ijse.spring.entity.Item;
import lk.ijse.spring.entity.OrderDetails;
import lk.ijse.spring.entity.Orders;
import lk.ijse.spring.repo.ItemRepo;
import lk.ijse.spring.repo.OrdersRepo;
import lk.ijse.spring.util.ResponseUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author : ShEnUx
 * @time : 10:05 AM
 * @date : 2/7/2023
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("/purchase")
@CrossOrigin
public class PurchaseOrderController {
    @Autowired
    private OrdersRepo repo;
    @Autowired
    private ModelMapper mapper;
    @Autowired
    private ItemRepo itemRepo;

    @PostMapping
    public ResponseUtil purchaseOrder(@RequestBody OrdersDTO ordersDTO){
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

        return new ResponseUtil("OK","Successfully Purchased..!",null);
    }
}
