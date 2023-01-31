package lk.ijse.spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author : ShEnUx
 * @time : 10:26 PM
 * @date : 1/31/2023
 * @since : 0.1.0
 **/
@Component
public class TestBean implements InitializingBean {
    @Autowired
    Environment environment;
    public TestBean() {
        System.out.println("TestBean:Instantiated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        String property = environment.getProperty("user.email");//If the key is not available it returns null
        System.out.println("Test Bean "+ property);

        String requiredProperty = environment.getRequiredProperty("users.email");//If the key is not available it throws an exception
        System.out.println("Test Bean "+ requiredProperty);
    }
}
