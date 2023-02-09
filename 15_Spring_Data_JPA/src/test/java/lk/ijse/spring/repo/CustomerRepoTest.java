package lk.ijse.spring.repo;

import lk.ijse.spring.config.WebRootConfig;
import lk.ijse.spring.entity.Customer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

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
        Customer pahasara = repo.findCustomerByName("Pahasara");
        System.out.println(pahasara);
    }

    @Test
    void findCustomerByName() {
        Customer pahasara = repo.findCustomerByName("Pahasara");
        System.out.println(pahasara);
    }
}