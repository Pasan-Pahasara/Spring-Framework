package lk.ijse.spring.di;

import org.springframework.stereotype.Component;

/**
 * @author : ShEnUx
 * @time : 6:31 PM
 * @date : 1/30/2023
 * @since : 0.1.0
 **/
@Component
public class B implements SuperB{
    public B() {
        System.out.println("B:Instantiated");
    }
    @Override
    public void methodUseByA(){
        System.out.println("Method Invoked By A");
    }
}
