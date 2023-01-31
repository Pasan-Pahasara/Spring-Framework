package lk.ijse.spring.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author : ShEnUx
 * @time : 4:59 PM
 * @date : 1/31/2023
 * @since : 0.1.0
 **/
@Component
public class Customer {
//    public Customer() {
//        System.out.println("Default Constructor:Customer:Instantiated");
//    }
//    public Customer(@Value("IJSE") String name) {
//        System.out.println("Customer:Instantiated "+name);
//    }
    public Customer(@Value("Dasun,Kasun,Amal") String names[]) {
        System.out.println("Customer:Instantiated");
        for (String name : names) {
            System.out.println(name);
        }
    }
    //what you can assign with @Value annotation
    //Primitive Data Types
    //String data
    //Arrays

}
