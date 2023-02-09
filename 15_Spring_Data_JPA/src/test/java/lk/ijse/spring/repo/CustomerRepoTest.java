package lk.ijse.spring.repo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
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
@ContextConfiguration//add configuration for that context
@ExtendWith(SpringExtension.class)//integrate junit with spring
class CustomerRepoTest {

    @Test
    void findByName() {

    }
}