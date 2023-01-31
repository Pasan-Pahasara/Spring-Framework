package lk.ijse.spring.config;

import lk.ijse.spring.pojo.PojoTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : ShEnUx
 * @time : 12:27 PM
 * @date : 1/31/2023
 * @since : 0.1.0
 **/
@Configuration
public class ConfigOne {
    public ConfigOne(){
        System.out.println("ConfigOne:Instantiated");
    }
    @Bean
    public PojoTwo pojoTwo(){
        return new PojoTwo();
    }
}
