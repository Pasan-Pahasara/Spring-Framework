package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author : ShEnUx
 * @time : 5:45 PM
 * @date : 2/1/2023
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("/one")
public class OneController {
    @GetMapping
    public String testOne1(){
        return "Get Method Invoked";
    }
/**
 * Class එකක් ඇතුලේ එක වගේ Method දෙකක් තියන්න බෑ Ambiguous Mapping කියලා Error එකක් එනවා.
 * */
//    @GetMapping
//    public String testOne2(){
//        return "Get Method Invoked";
//    }

    @PostMapping
    public String testTwo(){
        return "Post Method Invoked";
    }

    @PutMapping
    public String testThree(){
        return "Put Method Invoked";
    }

    @DeleteMapping
    public String testFour(){
        return "Delete Method Invoked";
    }
}
