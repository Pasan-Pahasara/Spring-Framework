package lk.ijse.spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author : ShEnUx
 * @time : 9:39 PM
 * @date : 1/25/2023
 * @since : 0.1.0
 **/
@Component
public class Boy {
    @Autowired
    Girl girl;
    public Boy() {
        System.out.println("Boy:Instantiated");
    }
    public void chatWithGirl(){
//        Girl girl = new Girl(); //don't create objects
        girl.chat();
    }
}
