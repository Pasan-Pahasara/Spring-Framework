package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : ShEnUx
 * @time : 7:01 PM
 * @date : 2/1/2023
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("/two")
public class TwoController {
    /**
     * Mapping Methods කියනවා ඒකටම තව Handler Methods කියනවා.
     * /b/c -> මේවට path segments කියනවා
     * */
    @GetMapping//Path එකක් දීලා නැත්තම් එක default call කරාම එන්නේ.
    public String defaultMethod(){
        return "Default Get Method Invoked";
    }
/**
 * Class එකක් ඇතුලේ එක වගේ Method දෙකක් තියන්න බෑ Ambiguous Mapping කියලා Error එකක් එනවා.
 * ඒක නිසා එක වගේ Mapping දෙකක් තිබුනොත් path variable එක දාලා narrow-down කරන්න.
 * */
    @GetMapping(path = "/a")//Ambiguous Mapping case එකක් ආවහම. ඒ එන Mapping එකෙන් එකක් අල්ලලා path එක ටිකක් extend කරලා දෙන්න පුලුවන්.
    public String testOne1(){
        return "Get Method Invoked 1";
    }

    @GetMapping(path = "/b")
    public String testOne2(){
        return "Get Method Invoked 2b";
    }

    @GetMapping(path = "/b/c")//Path එකට එකකට වඩා දෙන්නත් පුලුවන්.
    public String testOne3(){
        return "Get Method Invoked 2bc";
    }
}
