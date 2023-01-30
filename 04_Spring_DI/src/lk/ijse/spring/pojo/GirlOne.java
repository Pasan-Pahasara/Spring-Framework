package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

/**
 * @author : ShEnUx
 * @time : 9:57 PM
 * @date : 1/25/2023
 * @since : 0.1.0
 **/
@Component
public class GirlOne implements GoodGirl {
    public GirlOne() {
        System.out.println("Girl One:Instantiated");
    }

    @Override
    public void chat() {
        System.out.println("Girl One:Hello hi..!");
    }
}

