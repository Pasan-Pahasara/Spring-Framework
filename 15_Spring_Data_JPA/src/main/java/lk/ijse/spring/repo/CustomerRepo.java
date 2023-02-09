package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

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


    Long countCustomerByName(String name);//මෙකෙ return type එක Long. number එකක් එන්නේ.
    Boolean existsCustomerByName(String name);//මෙකෙ return type එක Boolean. number එකක් එන්නේ.
    void deleteCustomerByName(String name);
    void removeCustomerByName(String name);

    Customer findCustomerByNameAndAddress(String name,String address);

    //Native SQL
    @Query(value = "select * from Customer",nativeQuery = true)
    List<Customer> methodOne();
}
