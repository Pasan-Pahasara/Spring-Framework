package lk.ijse.spring.config;

import lk.ijse.spring.pojo.PojoThree;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : ShEnUx
 * @time : 12:29 PM
 * @date : 1/31/2023
 * @since : 0.1.0
 **/
@Configuration
public class ConfigTwo {
    public ConfigTwo() {
        System.out.println("ConfigTwo:Instantiated");
    }

    @Bean
    public PojoThree pojoThree(){
        return new PojoThree();
    }
}
