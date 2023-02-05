package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : ShEnUx
 * @time : 11:54 PM
 * @date : 2/1/2023
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("/four")
public class DController {
    //Character Mapping
    //http://localhost:8080/mapping/four/C1DEF

    /**
     * If you want to narrow down request using path segments
     * You can use character mapping
     * http://localhost:8080/mapping/four/C1DEF
     * If we have a doubt in exact mapping
     * We can use ? for that character
     */

    //Path segment එකේ ? එක තියෙන එක වෙනුවට ඕනම character එකක් replace කරන්න පුලුවන්.
    //? count එක අනුව replace කරන්න පුලුවන් character ගාන depend වෙනවා.
    @GetMapping(path = "/C?1DEF")
    public String testOne() {
        return "Method One Invoked";
    }

    @GetMapping(path = "/C??1DEF")
    public String testTwo() {
        return "Method Two Invoked";
    }
}
