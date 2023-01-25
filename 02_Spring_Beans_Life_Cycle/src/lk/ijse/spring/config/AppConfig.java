package lk.ijse.spring.config;

import lk.ijse.spring.pojo.PojoThree;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : ShEnUx
 * @time : 4:33 PM
 * @date : 1/25/2023
 * @since : 0.1.0
 **/

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
public class AppConfig {
    @Bean
    public PojoThree pojoThree(){
        return new PojoThree();
    }
}
