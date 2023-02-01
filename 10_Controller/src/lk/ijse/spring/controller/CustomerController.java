package lk.ijse.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author : ShEnUx
 * @time : 2:29 PM
 * @date : 2/1/2023
 * @since : 0.1.0
 **/
@Controller
@RequestMapping("/customer")
public class CustomerController {
    public CustomerController() {
        System.out.println("CustomerController");
    }

    @GetMapping
    public ModelAndView test(){
        return new ModelAndView("/customer");
    }
}
