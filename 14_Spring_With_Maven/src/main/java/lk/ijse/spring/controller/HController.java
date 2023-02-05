package lk.ijse.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : ShEnUx
 * @time : 09:37 AM
 * @date : 3/2/2023
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("/eight")
public class HController {
    //How many parts are there in an HTTP request.?
    //There are two parts
    //Headers (MetaData) "Content-Type=application/json"
    //Body (Context)

    //We can narrow down a request using the content type
    //Of its body using headers
    //Consume = (this method expect content-type header with the request)

//        @GetMapping(consumes = {"application/json"})//consume එකේදි කියන්නේ අපිට පුලුවන් කවුරු හරි request එකක් මේකට එවනකොට content type කියන header එක use කරලා use කරන්නේ මොකක්ද කියලා define කරලා තියන්න.
    @GetMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})//alternative
    public String testOne(){
        return "Method One Invoked";
    }

    @GetMapping(consumes = {MediaType.TEXT_HTML_VALUE})
    public String testTwo(){
        return "Method Two Invoked";
    }
}
