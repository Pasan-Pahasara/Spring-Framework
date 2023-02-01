package lk.ijse.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author : ShEnUx
 * @time : 4:41 PM
 * @date : 2/1/2023
 * @since : 0.1.0
 **/
@Controller
@RequestMapping("/item")
public class ItemController {
    public ItemController() {
        System.out.println("ItemController");
    }
    @GetMapping
    public ModelAndView test(){
        return new ModelAndView("/item");
    }
}
