package lk.ijse.spring.config;

import lk.ijse.spring.pojo.PojoThree;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author : ShEnUx
 * @time : 6:56 PM
 * @date : 1/25/2023
 * @since : 0.1.0
 **/
@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
public class AppConfig {
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public PojoThree pojoThree(){
        return new PojoThree();
    }
}
