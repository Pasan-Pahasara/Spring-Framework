package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.service.CustomerService;
import lk.ijse.spring.util.ResponseUtil;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
    @Autowired
    private CustomerService service;
    /**
     * @RequestParam (query string, x - www - form - url - encoded) (not required) important(query String)
     * @ModelAttribute (query string, x - www - form - url - encoded) (not required) important(x-www-form-url-encoded මේකටම formData කියනවා.)
     * @RequestBody (State that the parameter is going to inject values from JSON object) (required annotation)
     */

    @PostMapping
    public ResponseUtil saveCustomer(@ModelAttribute CustomerDTO customerDTO) {
        service.saveCustomer(customerDTO);
        return new ResponseUtil("OK", "Successfully Registered..!", null);
    }

    @DeleteMapping(params = {"id"})
    public ResponseUtil deleteCustomer(@RequestParam String id) {
        service.deleteCustomer(id);
        return new ResponseUtil("OK", "Successfully Deleted..! : " + id, null);
    }

    @PutMapping
    public ResponseUtil updateCustomer(@RequestBody CustomerDTO customerDTO) {
        service.updateCustomer(customerDTO);
        return new ResponseUtil("OK", "Successfully Updated..! : " + customerDTO.getId(), null);
    }

    @GetMapping(path = "/{name}")
    public ResponseUtil searchCustomerByName(@PathVariable String name) {
        return new ResponseUtil("OK", "Successfully Searched By Name..!", service.searchCustomerWithName(name));//Query Methods වලන් අපිට ඕන query එකක් generate කරගන්න පුලුවන්.
    }
}
