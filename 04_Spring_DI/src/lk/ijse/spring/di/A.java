package lk.ijse.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author : ShEnUx
 * @time : 6:31 PM
 * @date : 1/30/2023
 * @since : 0.1.0
 **/
@Component
public class A {
    @Autowired
    SuperB superB;//Property Injection
    public A() {
        System.out.println("A:Instantiated");
    }
    public void test(){
        superB.methodUseByA();
    }
}
