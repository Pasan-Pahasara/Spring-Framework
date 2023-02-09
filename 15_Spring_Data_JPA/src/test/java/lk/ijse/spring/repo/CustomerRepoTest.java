package lk.ijse.spring.repo;

import lk.ijse.spring.config.WebRootConfig;
import lk.ijse.spring.entity.Customer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : ShEnUx
 * @time : 3:33 PM
 * @date : 2/9/2023
 * @since : 0.1.0
 **/
/**
 * Testing වලටත් වෙනම context එකක් හැදෙනවා. ඒ context එකට අදාලව ඒක create කරගන්න තමයි මේ annotation 3න දාන්නේ.
 * **/
@WebAppConfiguration//create the testing context
@ContextConfiguration(classes = {WebRootConfig.class})//add configuration for that context
@ExtendWith(SpringExtension.class)//integrate junit with spring
class CustomerRepoTest {

    /**
     * Service එක තමයි heart එක විදිහට සලකන්නේ. service එකේ තමයි අපි ඔක්කොම දේවල් ලියන්නේ Service class එකක් තමයි අපි මෙතනට ගෙනල්ලා Autowired කරන්නේ.repo Autowired කරන්නේ නෑ හැබැයි පුලුවන්.
     **/
    @Autowired
    CustomerRepo repo;
    @Test
    void findByName() {
        List<Customer> list = repo.findByName("Pahasara");
        for (Customer customer : list) {
            System.out.println(customer);
        }
    }

    @Test
    void findCustomerByName() {
        Customer pahasara = repo.findCustomerByName("Nimesh");
        System.out.println(pahasara);
    }
    @Test
    void testAllMethods() {
        /**
         * මේ හැම එකකින්ම වදින්නේ එකම query එක.
         * */
        Customer c1 = repo.findCustomerByName("Nimesh");
        Customer c2 = repo.readCustomerByName("Nimesh");
        Customer c3 = repo.getCustomerByName("Nimesh");
        Customer c4 = repo.queryCustomerByName("Nimesh");
        Customer c5 = repo.searchCustomerByName("Nimesh");
        Customer c6 = repo.streamCustomerByName("Nimesh");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c5);

    }
}