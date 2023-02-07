package lk.ijse.spring.service;

import lk.ijse.spring.dto.OrdersDTO;

/**
 * @author : ShEnUx
 * @time : 1:29 PM
 * @date : 2/7/2023
 * @since : 0.1.0
 **/
public interface PurchaseOrderService {
    void purchaseOrder(OrdersDTO ordersDTO);
}
