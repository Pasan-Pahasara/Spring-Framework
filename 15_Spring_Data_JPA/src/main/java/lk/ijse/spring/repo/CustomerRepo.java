package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : ShEnUx
 * @time : 4:17 PM
 * @date : 2/6/2023
 * @since : 0.1.0
 **/

//මේකෙදි ඉල්ලනවා generics 2 ක්. ඒකට දෙනවා මේ repo එකට අදාල entity එකයි ඒකේ primary key එකේ data type එකයි.
public interface CustomerRepo extends JpaRepository <Customer,String> {
    Customer findCustomerByName(String name);//Query Methods

    Customer findByName(String name);//Alternative //Subject එක නැතුව දාන්නත් පුලුවන්
}
