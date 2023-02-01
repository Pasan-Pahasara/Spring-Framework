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
@RequestMapping("/six")
public class FController {
    //Duel Wild Card Mapping

    /**
     * 0 or more inside a segment or more segments
     * http://localhost:8080/mapping/six/path//A/B
     * http://localhost:8080/mapping/six/path/aaaaa/A/B
     * http://localhost:8080/mapping/six/path/aaaaa/aaaaa/aaaaa/A/B
     * */

    //** තියෙනවනම් එතනට මොකුත් නොදා තියන්නත් පුලුවන් නැත්නම් ඕන තරම් path segments දාන්නත් පුලුවන්.
    @GetMapping(path = "/path/**/A/B")
    public String testOne(){
        return "Method One Invoked";
    }

    @GetMapping(path = "/**/myPath/A/C")
    public String testTwo(){
        return "Method Two Invoked";
    }
}
