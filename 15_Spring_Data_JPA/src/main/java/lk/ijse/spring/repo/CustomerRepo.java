package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

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
    @Query(value = "select * from Customer",nativeQuery = true)//nativeQuery attribute එක default එන්න false ඒක true කරගන්න ඕන.
    List<Customer> methodOne();

    @Query(value = "select * from Customer where id='C00-001'",nativeQuery = true)
    Customer methodTwo();

    //Positional Params
    //Name Params

    //Positional Params(Positions අනුවනම් parameters set කරලා තීන්නේ ඒවට කියනවා Positional Params කියලා.)
    @Query(value = "select * from Customer where id=?1",nativeQuery = true)//මේකේ 1 කියලා දාලා කියලා තීන්නේ පලවෙනි එකට එන value එක මේකට set කරන්න කියලා.
    Customer methodThree(String id);

    //1 = id param value
    //2 = name param value
    @Query(value = "select * from Customer where id=?1 and name=?2",nativeQuery = true)//මේකේ 1,2 කියලා දාලා කියලා තීන්නේ පලවෙනි එකට එන value එක පලවෙනි එකට set කරන්න, දෙවනි එකට එන value එක දෙවනි එකට set කරන්න කියලා.
    Customer methodFour(String id,String name);

    //Name Params
    //a = id param value
    //b = name param value
    //@Param = required annotation
    @Query(value = "select * from Customer where id=:a and name=:b",nativeQuery = true)//මේකේ a name value එකට id එකේ @Param value එක set කරනවා සහ b name value එකට name එකේ @Param value එක set කරනවා
    Customer methodFive(@Param("a") String id, @Param("b") String name);

    //JPQL(මේක Java Persistent Api එකෙන් introduce කරපු එක)
    @Query(value = "select u from Customer u")
    List<Customer> getCustomerWithJPQL();
}
