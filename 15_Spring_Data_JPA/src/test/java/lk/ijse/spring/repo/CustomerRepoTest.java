package lk.ijse.spring.repo;

import lk.ijse.spring.config.WebRootConfig;
import lk.ijse.spring.entity.Customer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author : ShEnUx
 * @time : 3:33 PM
 * @date : 2/9/2023
 * @since : 0.1.0
 **/

/**
 * Testing වලටත් වෙනම context එකක් හැදෙනවා. ඒ context එකට අදාලව ඒක create කරගන්න තමයි මේ annotation 3න දාන්නේ.
 **/
@WebAppConfiguration//create the testing context
@ContextConfiguration(classes = {WebRootConfig.class})//add configuration for that context
@ExtendWith(SpringExtension.class)//integrate junit with spring
@Transactional //database එකට අවුලක් නවෙන්න අපිට test කරන්න මේ annotation එක use කරනවා.
class CustomerRepoTest {

    /**
     * Service එක තමයි heart එක විදිහට සලකන්නේ. service එකේ තමයි අපි ඔක්කොම දේවල් ලියන්නේ Service class එකක් තමයි අපි මෙතනට ගෙනල්ලා Autowired කරන්නේ.repo Autowired කරන්නේ නෑ හැබැයි පුලුවන්.
     **/
    @Autowired
    CustomerRepo repo;

    /**
     * Test Class එකෙන් delete කරන එක risk උනාට add කරන්න පුලුවන් database එකට data. හැබැයි අපිට පුලුවන් @Transactional annotation එකෙන් database එකට add නොකර ඒක check කරගන්න විතරක්..
     */
    @Test
    void addCustomers() {
        Customer c1 = new Customer("C00-007", "Maneesha", "Panadura", 25000.00);
        Customer c2 = new Customer("C00-008", "Sadun", "Colombo", 35000.00);
        repo.save(c1);
        repo.save(c2);
    }

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
         * මේ හැම එකකින්ම වදින්නේ එකම query එක. return type එක Entity එකක්.
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

    @Test
    void testAllMethods2() {
        /**
         * මේ හැම එකකින්ම වදින්නේ එකම query එක.
         * */
        Long count = repo.countCustomerByName("Pahasara");
        System.out.println(count);
        Boolean available = repo.existsCustomerByName("Pahasara");
        System.out.println(available);
        repo.deleteCustomerByName("Nimesh");//test කරද්දි ඇටත්තටම delete කරන්න බෑ database එකෙන්. ඒක ගොඩාක් risk. හැබැයි අපිට පුලුවන් @Transactional annotation එකෙන් database එකෙන් delete නොකර ඒක check කරගන්න විතරක්..
        repo.removeCustomerByName("Pahasara");
    }

    @Test
    void testAllMethods3() {
        Customer c1 = repo.findCustomerByNameAndAddress("Pahasara", "Panadura");
        System.out.println(c1);
    }

    @Test
    void NativeSQLTestMethods1() {
        List<Customer> list = repo.methodOne();
        for (Customer customer : list) {
            System.out.println(customer);
        }
    }

    @Test
    void NativeSQLTestMethods2() {
        Customer c1 = repo.methodTwo();
        System.out.println(c1);
    }

    @Test
    void NativeSQLTestMethods3() {
        Customer c1 = repo.methodThree("C00-001");
        System.out.println(c1);
    }

    @Test
    void NativeSQLTestMethods4() {
        Customer c1 = repo.methodFour("C00-001","Yashodya");
        System.out.println(c1);
    }

    @Test
    void NativeSQLTestMethods5() {
        Customer c1 = repo.methodFive("C00-001","Yashodya");
        System.out.println(c1);
    }

    @Test
    void JPQL() {
        List<Customer> jpql = repo.getCustomerWithJPQL();
        for (Customer customer : jpql) {
            System.out.println(customer);
        }
    }

    @Test
    void HQL() {
        List<Customer> hql = repo.getCustomerWithHQL();
        for (Customer customer : hql) {
            System.out.println(customer);
        }
    }
}