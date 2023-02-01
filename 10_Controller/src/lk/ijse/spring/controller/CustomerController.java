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
    public ModelAndView test(){//Model And View එකක් response එකක් විදිහට dispatcher servlet එකට ආවට පස්සේ viewResolver Object එකක් container එක ඇතුලේ ඉන්නවද කියලා බලලා ඒකට දෙනවා.
        return new ModelAndView("/customer");
    }
}
