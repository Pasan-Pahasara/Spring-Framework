package lk.ijse.spring.service.impl;

import lk.ijse.spring.config.WebRootConfig;
import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.transaction.Transactional;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : ShEnUx
 * @time : 10:50 PM
 * @date : 2/9/2023
 * @since : 0.1.0
 **/
@WebAppConfiguration//create the testing context
@ContextConfiguration(classes = {WebRootConfig.class})//add configuration for that context
@ExtendWith(SpringExtension.class)//integrate junit with spring
@Transactional //database එකට අවුලක් නවෙන්න අපිට test කරන්න මේ annotation එක use කරනවා.
class CustomerServiceImplTest {

    @Autowired
    CustomerService service;

    @Test
    void saveCustomer() {
        //valid data එකක් දීලා බලනවා test එක OKද කියලා.
        //Assertions methods දාලා අපිට පුලුවන් check කරගන්න අපිට ඕන Output එකම එනවද කියලා.මේක දෙන්නේ jupiter api එකෙන්.
        assertDoesNotThrow(() -> {//මෙතන කියලා තීන්නේ මෙකෙන් error එකක් generate වෙන්නේ නෑ කියලා.
            service.saveCustomer(new CustomerDTO("C00-007", "Ashan", "Matara", 25000.00));
        });

        //invalid data එකක් දීලා බලනවා error එකක් throws කරනවද කියලා.
        assertThrows(RuntimeException.class, () -> {//මෙතන කියලා තීන්නේ මෙකෙන් error එකක් generate වෙන්න ඕන කියලා.
            service.saveCustomer(new CustomerDTO("C00-002", "Pahasara", "Panadura", 25000.00));
        });
    }

    @Test
    void deleteCustomer() {
        //valid
        assertDoesNotThrow(()->{
            service.deleteCustomer("C00-001");
        });

        //invalid
        assertThrows(RuntimeException.class,()->{
            service.deleteCustomer("C00-008");
        });
    }

    @Test
    void updateCustomer() {
        //valid
        assertDoesNotThrow(()->{
            service.updateCustomer(new CustomerDTO("C00-001","Yashodya","Colombo",25000.00));
        });

        //invalid
        assertThrows(RuntimeException.class,()->{
            service.updateCustomer(new CustomerDTO("C00-008","Yashodya","Colombo",25000.00));
        });
    }

    @Test
    void getAllCustomers() {
        ArrayList<CustomerDTO> allCustomers = service.getAllCustomers();
        assertTrue(allCustomers.size()>0);
    }

    @Test
    void searchCustomerWithName() {
        //valid info
        CustomerDTO customerDTO1 = service.searchCustomerWithName("Nimesh");
        assertNotNull(customerDTO1);
        System.out.println(customerDTO1);

        //invalid info
        CustomerDTO customerDTO2 = service.searchCustomerWithName("Nim");
        assertNull(customerDTO2);
    }
}