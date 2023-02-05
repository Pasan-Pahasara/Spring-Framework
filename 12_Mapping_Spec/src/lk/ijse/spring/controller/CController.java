package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : ShEnUx
 * @time : 7:01 PM
 * @date : 2/1/2023
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("/three")
public class CController {
    //http://localhost:8080/mapping/three/id/C001/Dasun

    /**
     * Mapping Methods කියනවා ඒකටම තව Handler Methods කියනවා.
     * /b/c -> මේවට path segments කියනවා
     */

    /**
     * Class එකක් ඇතුලේ එක වගේ Method දෙකක් තියන්න බෑ Ambiguous Mapping කියලා Error එකක් එනවා.
     * ඒක නිසා එක වගේ Mapping දෙකක් තිබුනොත් path variable එක දාලා narrow-down කරන්න.
     */
//    @GetMapping(path = "/id/{C001}/{Dasun}")//Class variable විදිහට දුන්නම මේකම ඕන වෙනස් වෙන්න පුලුවන්.
//    // මෙහෙම දැම්මොත් වරහන් දෙක ඇතුලේ තීන ඒවට ඕන value එකක් එන්න පුලුවන්.
//    //Ambiguous Mapping case එකක් ආවහම. ඒ එන Mapping එකෙන් එකක් අල්ලලා path එක ටිකක් extend කරලා දෙන්න පුලුවන්.

    /**
     * @PathVariable annotation එකෙන් කරන්නේ runtime path එකකින් දෙන value එකක් අරගෙන parameters වලට inject කරන්න.
     */
//    public String testOne1(@PathVariable("C001") String id, @PathVariable("Dasun") String name) {
//        System.out.println(id + " " + name);
//        return "Get Method Invoked 1";
//    }

    //http://localhost:8080/mapping/three/id/name/ijse
    @GetMapping(path = "/id/name/ijse")//Class segment විදිහට දුන්නම මේකම ඕන වෙනස් වෙන්න බෑ.
    public String testOne2() {
        return "Get Method Invoked 2";
    }

//    @GetMapping(path = "/id/{id}/{name}")
    /**
     * Parameter එකේ name එකයි path variable එකේ name එක අසමානනම් විතරයි parameter එකට value එකක් දාන්නේ.
     * මේවට various කියලා කියන්නේ. EXAMPLE :- @PathVariable("C001")
     * */
//    public String testOne3(@PathVariable String id, @PathVariable String name) {
//        return "Get Method Invoked 3 " + id + " " + name;
//    }

    /**
     * furthermore if we want we can validate the path variables as
     * we wanted
     * {id : [a-z]{2}} -> validate with reg ex
     * */

    //http://localhost:8080/mapping/three/id/C002/Uvindu //Ok
    //http://localhost:8080/mapping/three/id/CKK2/U38383 //Wrong
    @GetMapping(path = "/id/{id:[C]{1}[0-9]{3}}/{name:[A-Z]{4}}")//Class variable විදිහට දෙනකොට අපිට පුලුවන් validate කරලා දෙන්න.(reg ex වලින්)
    public String testOne4(@PathVariable String id, @PathVariable String name) {
        return "Get Method 1 Invoked " + id + " " + name;
    }

    @GetMapping(path = "/id/{id:[C]{2}[0-9]{3}}/{name:[a-z]{5}}") //()
    public  String testOne221(@PathVariable String id,@PathVariable String name){
        return "Get Method 2 Invoked "+id+" "+name;
    }
}
