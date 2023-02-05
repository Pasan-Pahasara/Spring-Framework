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
@CrossOrigin//මේ annotation එකන් මේකේ ඇතුලේ තියෙන හැම method එකකටම headers ටික දාගන්නවා.
//Allow CrossOrigin access for this controller
//No need to set Access-Control-Headers anymore
public class KController {
    //Query String
    //X-www-form-url-encoded මේ දෙවදිහටම එන data පහත ආකාරයට ගන්න පුලුවන්.

    //First way
//    @PostMapping
//    public void saveCustomer(String id,String name,String address,Double salary){
//       System.out.println("Wade Goda"+id+" "+name+" "+address+" "+salary);
//
//   }

   //Second way
    //What if we use encapsulation to catch above details.
    //Which came here with x-www-form-url-encoded format
    //Query String also can be fetched by dto
    //DTO එකකට Query String,X-www-form-url-encoded මේ විදි දෙකටම data යවන්න පුලුවන්.
    //@ModelAttribute annotation එකට අල්ලගන්න පුලවන් data codes තමයි Query String,X-www-form-url-encoded.
    @PostMapping
    public void saveCustomer(@ModelAttribute CustomerDTO dto){
        System.out.println(dto.toString());
    }
    //@RequestParam (query string,x-www-form-url-encoded) (not required)
    //@ModelAttribute (query string,x-www-form-url-encoded) (not required)
}
