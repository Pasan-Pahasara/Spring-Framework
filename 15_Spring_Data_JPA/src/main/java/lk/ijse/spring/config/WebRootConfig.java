package lk.ijse.spring.config;

import lk.ijse.spring.service.impl.CustomerServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author : ShEnUx
 * @time : 5:21 PM
 * @date : 2/1/2023
 * @since : 0.1.0
 **/
@Configuration
@Import(JPAConfig.class)
@ComponentScan(basePackageClasses = {CustomerServiceImpl.class})
public class WebRootConfig {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
