package lk.ijse.spring.controller;

import lk.ijse.spring.dto.OrdersDTO;
import lk.ijse.spring.util.ResponseUtil;
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
    @PostMapping
    public ResponseUtil purchaseOrder(@RequestBody OrdersDTO ordersDTO){
        System.out.println(ordersDTO.toString());
        return new ResponseUtil("OK","Purchased Successfully ..!",null);
    }
}
