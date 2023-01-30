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
//    @Autowired
    SuperB superB;//Property Injection
//    @Autowired //අනිවාර්‍යෙන්ම දාන්න ඕන්නෑ.හැබැයි convention එකක් විදිහට දානවා.
    public A(SuperB superB) {
//        this.superB=superB;//Constructor Injection
        System.out.println("A:Instantiated");
    }
    @Autowired
    public void setInjection(SuperB superB){
        this.superB=superB;
    }
    public void test(){
        superB.methodUseByA();
    }
}
