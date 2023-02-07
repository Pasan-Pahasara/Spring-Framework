package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.util.ResponseUtil;
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
    private CustomerRepo repo;

    /**
     * @RequestParam (query string, x - www - form - url - encoded) (not required) important(query String)
     * @ModelAttribute (query string, x - www - form - url - encoded) (not required) important(x-www-form-url-encoded මේකටම formData කියනවා.)
     * @RequestBody (State that the parameter is going to inject values from JSON object) (required annotation)
     */

    @PostMapping
    public ResponseUtil saveCustomer(@ModelAttribute CustomerDTO customerDTO) {
        System.out.println("Save Customer Invoked" + customerDTO.toString());
        if (repo.existsById(customerDTO.getId())) {
            throw new RuntimeException("Customer Already Exist. Please enter another id..!");
        }
        Customer customer = new Customer(customerDTO.getId(), customerDTO.getName(), customerDTO.getAddress(), customerDTO.getSalary());
        repo.save(customer);
        return new ResponseUtil("OK", "Successfully Registered..!", null);
    }

    //    @DeleteMapping
//    public ResponseUtil deleteCustomer(String id){
//        return new ResponseUtil("OK","Successfully Deleted..! : "+id,null);
//    }
    @DeleteMapping(params = {"id"})
    public ResponseUtil deleteCustomer(@RequestParam String id) {
        if (!repo.existsById(id)) {
            throw new RuntimeException("Wrong ID..Please enter valid id..!");
        }
        repo.deleteById(id);
        return new ResponseUtil("OK", "Successfully Deleted..! : " + id, null);
    }

    @PutMapping
    public ResponseUtil updateCustomer(@RequestBody CustomerDTO customerDTO) {
        if (!repo.existsById(customerDTO.getId())) {
            throw new RuntimeException("Wrong ID..No Such a Customer to Update..!");
        }
        Customer customer = new Customer(customerDTO.getId(), customerDTO.getName(), customerDTO.getAddress(), customerDTO.getSalary());
        repo.save(customer);
        return new ResponseUtil("OK", "Successfully Updated..! : " + customerDTO.getId(), null);
    }

    @GetMapping
    public ResponseUtil getAllCustomers() {
        ArrayList<CustomerDTO> arrayList = new ArrayList<>();
        List<Customer> all = repo.findAll();
        return new ResponseUtil("OK", "Successfully Loaded..!", all);
    }
}
