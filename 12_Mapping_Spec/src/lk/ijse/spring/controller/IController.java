package lk.ijse.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : ShEnUx
 * @time : 03:37 AM
 * @date : 3/2/2023
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("/nine")
public class IController {
    //How many parts are there in an HTTP request.?
    //There are two parts
    //Headers (MetaData) "Content-Type=application/json"
    //Body (Context)

    //consume = Content-Type=application/json
    //produce = Accept

    //Request Headers
    //Content-Type = Define what is the content type of the request body
    //Accept => what we want from the response body
    //Accept is a default header and always set this header to *\* (all) which means anything will be accepted from the server as the response
    //request එක යනකොට request එකේ body එකේ යන්නේ මොනවද කියලත් කියන්න පුලුවන් request එක ගිහිල්ලා server එකෙන් එවන්න ඕන මොනවද කියලා කියන්නත් පුලුවන්.ඒක කියන්න තමයි Accept header එක තීන්නේ.


    //consume = Content-Type header එක
    //produce = Accept header එක


    //Request headers that we want to set if we want to invoke this method
    //Content-Type = consume header එක නැති නිසා ඕන්නෑ.
    //Accept = application/json
    //produces එකෙන් කරන්නේ මෙතන method එකෙන් return කරන්න response එකේ තියෙන content type එක මොකක්ද කියලා specify කරන එක.
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})//මෙ method එක කවුරු හරි invoked කරොත් මෙතනින් produces කරන්නේ මේ MediaType.APPLICATION_JSON_VALUE type එකේ content එකක් කියලා.
    public String testOne() {
        return "Method One Invoked";
    }


    //Request headers that we want to set if we want to invoke this method
    //Content-Type = application/json
    //Accept = text/html
    @GetMapping(produces = {MediaType.TEXT_HTML_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public String testTwo() {
        return "Method Two Invoked";
    }
}
