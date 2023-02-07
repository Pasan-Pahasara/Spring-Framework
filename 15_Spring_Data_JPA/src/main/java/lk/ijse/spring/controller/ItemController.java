package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.entity.Item;
import lk.ijse.spring.repo.ItemRepo;
import lk.ijse.spring.service.ItemService;
import lk.ijse.spring.util.ResponseUtil;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @author : ShEnUx
 * @time : 12:40 PM
 * @date : 2/5/2023
 * @since : 0.1.0
 **/
@RestController
@CrossOrigin
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService service;
    /**
     * @RequestParam (query string,x-www-form-url-encoded) (not required) important(query String)
     * @ModelAttribute (query string,x-www-form-url-encoded) (not required) important(x-www-form-url-encoded මේකටම formData කියනවා.)
     * @RequestBody (State that the parameter is going to inject values from JSON object) (required annotation)
     */

    @ResponseStatus(HttpStatus.CREATED)//ResponseStatus එකක් අපිට දෙන්න පුලුවන් වෙනම.
    @PostMapping
    public ResponseUtil saveItem(@ModelAttribute ItemDTO itemDTO){
        service.saveItem(itemDTO);
        return new ResponseUtil("OK","Successfully Registered..!",null);//Object return කරන්න නම් අනිවාර්‍යෙන්ම Jackson හරි මොකක්ම හරි converter එක දාලා තියන්න ඕන. නැත්තම් error එන්නේ.
    }

    @DeleteMapping(params = {"code"})
    public ResponseUtil deleteItem(@RequestParam String code){
        service.deleteItem(code);
        return new ResponseUtil("OK","Successfully Deleted..! : "+code,null);
    }

    @PutMapping
    public ResponseUtil updateItem(@RequestBody ItemDTO itemDTO){
        service.saveItem(itemDTO);
        return new ResponseUtil("OK","Successfully Updated..! : "+itemDTO.getCode(),null);
    }

    @GetMapping
    public ResponseUtil getAllItems(){
        return new ResponseUtil("OK","Successfully Loaded..!",service.getAllItems());
    }
}
