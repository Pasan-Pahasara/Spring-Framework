package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : ShEnUx
 * @time : 12:36 AM
 * @date : 2/2/2023
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("/seven")
public class GController {
    //Narrow down request with query String Parameters
    //http://localhost:8080/mapping/seven?id=C001&name=IJSE

    //Query String Parameters වලිනුත් request එකක් run කරන්න පුලුවන්.

    /**
     * How to use query params for request narrow down
     * */
    @GetMapping(params = {"id","name"})
    public String testOne(){
        return "Method One Invoked ";
    }

    /**
     * How to get the values of query params in Java EE way
     * */
//    @GetMapping(params = {"address","salary"})
//    public String testTwo(HttpServletRequest request){
//        String address = request.getParameter("address");
//        return "Method Two Invoked "+address;
//    }

    /**
     * How to get the values of query params in Spring way
     * */
    //@RequestParam annotation එක required annotation එකක් නෙමෙයි. ඒක නැතුවත් වැඩ කරනවෑ.
    //Query Parameter එකයි method එකේ හදල තියෙන Parameter එකයි අසමානනම් තමයි @RequestParam use කරන්න ඕන.
    @GetMapping(params = {"address","salary"})
    public String testTwo(@RequestParam String address,@RequestParam String salary){
        return "Method Two Invoked "+address+" "+salary;
    }

    //Example of using @RequestParam annotation
    @GetMapping(params = {"myName","myAge"})
    public String testThree(@RequestParam("myName") String name,@RequestParam("myAge") String age){
        return "Method Three Invoked "+name+" "+age;
    }
}
