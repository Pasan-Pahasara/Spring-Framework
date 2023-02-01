package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : ShEnUx
 * @time : 1:07 PM
 * @date : 2/1/2023
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("/customer")
public class CustomerController {
    public CustomerController() {
        System.out.println("CustomerController");
    }

    @GetMapping
    public void callMe(){
        System.out.println("Call Me Method Invoked By the Web Browser");
    }
}
