package lk.ijse.spring.config;

import lk.ijse.spring.controller.CustomerController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author : ShEnUx
 * @time : 5:21 PM
 * @date : 2/1/2023
 * @since : 0.1.0
 **/
@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = {CustomerController.class})
public class WebAppConfig {
}
