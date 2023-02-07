package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;

import java.util.ArrayList;

/**
 * @author : ShEnUx
 * @time : 12:08 PM
 * @date : 2/7/2023
 * @since : 0.1.0
 **/
public interface CustomerService {
    public void saveCustomer(CustomerDTO customerDTO);
    public void deleteCustomer(String id);
    public void updateCustomer(CustomerDTO customerDTO);
    public ArrayList<CustomerDTO> getAllCustomers();
}
