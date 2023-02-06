package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
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
@RequestMapping("/customer")
public class CustomerController {
    /**
     * @RequestParam (query string,x-www-form-url-encoded) (not required) important(query String)
     * @ModelAttribute (query string,x-www-form-url-encoded) (not required) important(x-www-form-url-encoded මේකටම formData කියනවා.)
     * @RequestBody (State that the parameter is going to inject values from JSON object) (required annotation)
     */

    @PostMapping
    public ResponseUtil saveCustomer(@ModelAttribute CustomerDTO customerDTO){
        System.out.println("Save Customer Invoked"+customerDTO.toString());
        if (customerDTO.getId().equals("C00-001")){
            throw new RuntimeException("Customer Already Exist. Please enter another id..!");
        }
        return new ResponseUtil("OK","Successfully Registered..!",null);
    }

//    @DeleteMapping
//    public ResponseUtil deleteCustomer(String id){
//        return new ResponseUtil("OK","Successfully Deleted..! : "+id,null);
//    }
    @DeleteMapping(params = {"id"})
    public ResponseUtil deleteCustomer(@RequestParam String id){
        if (id.equals("C00-001")){
            throw new RuntimeException("Wrong ID..Please enter valid id..!");
        }
        return new ResponseUtil("OK","Successfully Deleted..! : "+id,null);
    }

    @PutMapping
    public ResponseUtil updateCustomer(@RequestBody CustomerDTO customerDTO){
        if (customerDTO.getId().equals("C00-001")){
            throw new RuntimeException("Wrong ID..No Such a Customer to Update..!");
        }
        return new ResponseUtil("OK","Successfully Updated..! : "+customerDTO.getId(),null);
    }

    @GetMapping
    public ResponseUtil getAllCustomers(){
        ArrayList<CustomerDTO> arrayList = new ArrayList<>();
        arrayList.add(new CustomerDTO("C00-001","Ushan","Mathara",10000.00));
        arrayList.add(new CustomerDTO("C00-002","Ashan","Panadura",18000.00));
        arrayList.add(new CustomerDTO("C00-003","Nimesh","Colombo",25000.00));
        arrayList.add(new CustomerDTO("C00-004","Maneesha","Galle",50000.00));
        arrayList.add(new CustomerDTO("C00-005","Sadun","Panadura",48000.00));

        return new ResponseUtil("OK","Successfully Loaded..!",null);
    }
}
