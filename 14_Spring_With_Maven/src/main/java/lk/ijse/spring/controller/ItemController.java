package lk.ijse.spring.controller;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.util.ResponseUtil;
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
    /**
     * @RequestParam (query string,x-www-form-url-encoded) (not required) important(query String)
     * @ModelAttribute (query string,x-www-form-url-encoded) (not required) important(x-www-form-url-encoded මේකටම formData කියනවා.)
     * @RequestBody (State that the parameter is going to inject values from JSON object) (required annotation)
     */

    @PostMapping
    public ResponseUtil saveItem(@ModelAttribute ItemDTO itemDTO){
        System.out.println("Save Item Invoked"+itemDTO.toString());
        return new ResponseUtil("OK","Successfully Registered..!",null);
    }

    @DeleteMapping(params = {"code"})
    public ResponseUtil deleteItem(@RequestParam String code){
        return new ResponseUtil("OK","Successfully Deleted..! : "+code,null);
    }

    @PutMapping
    public ResponseUtil updateItem(@RequestBody ItemDTO itemDTO){
        return new ResponseUtil("OK","Successfully Updated..! : "+itemDTO.getCode(),null);
    }

    @GetMapping
    public ResponseUtil getAllItems(){
        ArrayList<ItemDTO> arrayList = new ArrayList<>();
        arrayList.add(new ItemDTO("I00-001","Lux",55,150));
        arrayList.add(new ItemDTO("I00-002","Signal",15,180));
        arrayList.add(new ItemDTO("I00-003","Clougard",25,250));
        arrayList.add(new ItemDTO("I00-004","SupiriWiki",99,200));
        arrayList.add(new ItemDTO("I00-005","Siddalepa",85,480));

        return new ResponseUtil("OK","Successfully Loaded..!",null);
    }
}
