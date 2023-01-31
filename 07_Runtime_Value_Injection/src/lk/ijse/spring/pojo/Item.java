package lk.ijse.spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author : ShEnUx
 * @time : 5:38 PM
 * @date : 1/31/2023
 * @since : 0.1.0
 **/
@Component
public class Item implements InitializingBean {
    @Value("IJSE")//@Value annotation එක Instant properties වලටත් use කරන්න පුලුවන්
    private String name;
    public Item() {
        System.out.println("Item:Instantiated");
        System.out.println(name);//null still not ready
    }
    @Override
    public void afterPropertiesSet() throws Exception {//Features use කරනවනම් මේ අවස්තාවෙන් පස්සේ use කරන්න.
        System.out.println(name);
    }
}
