package lk.ijse.spring.pojo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author : ShEnUx
 * @time : 3:39 PM
 * @date : 1/30/2023
 * @since : 0.1.0
 **/
@Component
@Primary
public class GirlTwo implements GoodGirl{
    public GirlTwo() {
        System.out.println("Girl Two:Instantiated");
    }
    @Override
    public void chat() {
        System.out.println("Girl Two:Hello hi..!");
    }
}
