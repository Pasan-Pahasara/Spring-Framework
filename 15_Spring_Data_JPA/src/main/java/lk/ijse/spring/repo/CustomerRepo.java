package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author : ShEnUx
 * @time : 4:17 PM
 * @date : 2/6/2023
 * @since : 0.1.0
 **/

//මේකෙදි ඉල්ලනවා generics 2 ක්. ඒකට දෙනවා මේ repo එකට අදාල entity එකයි ඒකේ primary key එකේ data type එකයි.
public interface CustomerRepo extends JpaRepository <Customer,String> {
    Customer findCustomerByName(String name);//Query Methods //Subject එක ඇතුව දාන්නත් පුලුවන්

    List<Customer> findByName(String name);//Alternative //Subject එක නැතුව දාන්නත් පුලුවන්

    Customer readCustomerByName(String name);
    Customer getCustomerByName(String name);
    Customer queryCustomerByName(String name);
    Customer searchCustomerByName(String name);
    Customer streamCustomerByName(String name);
    Customer countCustomerByName(String name);
    Customer existsCustomerByName(String name);
    Customer deleteCustomerByName(String name);
    Customer removeCustomerByName(String name);
}
