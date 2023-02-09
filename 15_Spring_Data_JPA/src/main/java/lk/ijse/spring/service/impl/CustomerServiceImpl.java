package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

/**
 * @author : ShEnUx
 * @time : 1:01 PM
 * @date : 2/7/2023
 * @since : 0.1.0
 **/
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepo repo;

    @Autowired
    private ModelMapper mapper;
    @Override
    public void saveCustomer(CustomerDTO customerDTO) {
        if (repo.existsById(customerDTO.getId())) {
            throw new RuntimeException("Customer Already Exist. Please enter another id..!");
        }
        //DTO class එකක තියෙන data Entity එකකට transport කරගන්න ඕන උනොත් ඒ වැඩේ ලේසියෙන් කරන්න පුලුවන් මෙහෙම manually කරන්නේ නැතුව.
//        Customer customer = new Customer(customerDTO.getId(), customerDTO.getName(), customerDTO.getAddress(), customerDTO.getSalary());
//        Customer map = mapper.map(customerDTO, Customer.class);//Resource එක පලවෙනි parameter එකට දෙනවා. දෙවනි එකට convert වෙන්න න එක දෙනවා.
//        repo.save(map);
        repo.save(mapper.map(customerDTO, Customer.class));//alternative
    }

    @Override
    public void deleteCustomer(String id) {
        if (!repo.existsById(id)) {
            throw new RuntimeException("Wrong ID..Please enter valid id..!");
        }
        repo.deleteById(id);
    }

    @Override
    public void updateCustomer(CustomerDTO customerDTO) {
        if (!repo.existsById(customerDTO.getId())) {
            throw new RuntimeException("Wrong ID..No Such a Customer to Update..!");
        }
//        Customer customer = new Customer(customerDTO.getId(), customerDTO.getName(), customerDTO.getAddress(), customerDTO.getSalary());
//        repo.save(customer);
        repo.save(mapper.map(customerDTO, Customer.class));
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomers() {
        //        List<Customer> all = repo.findAll();
//        ArrayList<CustomerDTO> customerDTOArrayList = mapper.map(all, new TypeToken<ArrayList<CustomerDTO>>() {}.getType());//List එක convert කරනවා DTO එකකට.TypeToken class එකේ generics වලට දෙනවා CustomerDTO type එකේ ArrayList එකක්.
        return mapper.map(repo.findAll(), new TypeToken<ArrayList<CustomerDTO>>() {}.getType());//alternative
    }

    @Override
    public CustomerDTO searchCustomerWithName(String name) {
        return mapper.map(repo.findCustomerByName(name),CustomerDTO.class);//Query Methods Searching by Name
    }
}
