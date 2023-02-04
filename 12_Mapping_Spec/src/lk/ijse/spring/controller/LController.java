package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

/**
 * @author : ShEnUx
 * @time : 11:15 AM
 * @date : 4/2/2023
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("/customer")
@CrossOrigin
public class LController {
    //@RequestParam (query string,x-www-form-url-encoded) (not required)
    //@ModelAttribute (query string,x-www-form-url-encoded) (not required)
    //RequestBody (State that the parameter is going to inject values from JSON object) (required annotation)
    /**
     * @RequestBody annotation එකෙන් තමයි කියන්නේ inject කරන්නේ JSON object කියලා. හැබැයි මේ වැඩේ spring වලට තනියම කරගෙන යන්න බෑ, ඒකට ඕන කවුරුහරි third party Vendor කෙනෙක්.
     * Spring ට වැඩ කරගෙන යන්න පුලුවන් Vendors ල 3 තියෙනවා
     * 1. Jackson
     * 2. Gson (google එකෙන් හදලා තීන්නේ)
     * 3. J Processing
     * */


    //Let's Handle a JSON request with Spring
    @PutMapping
    public void updateCustomer(@RequestBody CustomerDTO dto){
        System.out.println(dto.toString());
    }
}
