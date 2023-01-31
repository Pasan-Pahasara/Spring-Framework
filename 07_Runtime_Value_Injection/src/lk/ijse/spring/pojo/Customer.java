package lk.ijse.spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
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

    /**
     * Parameters වලින් මොනා හරි දෙනවනම් @Value annotation එකත් එක්ක value එක දෙන්න ඕන. නැත්තම් error
     * Same parameters තියෙන ඒවගෙන් අපිට ඕන එක run කරගන්න ඕන්නම් @Autowired annotation එක දානවා. මේකේ default එන්නේ required = true
     * @Autowired එක දෙකටම දාලා required = false කරලා තියෙනවනම් දෙන්නගෙම එතකට spring කරන්නෙ greedious ම constructor එක select කරන එක.(Parameter Count එක වැඩිම එක select කරන එක)*/
    @Autowired(required = false)//here spring runs the greedious constructor
    public Customer(@Value("Dasun,Kasun,Amal") String[] names, @Value("1") int i, @Value("2") int c) {
        System.out.println("Customer:Instantiated");
        for (String name : names) {
            System.out.println(name);
        }
    }

    @Autowired(required = false)
    public Customer(@Value("Dasun") String name, @Value("10") int i) {
        System.out.println("Customer:Instantiated :" + name);
    }

    //what you can assign with @Value annotation
    //Primitive Data Types
    //String data
    //Arrays

}
