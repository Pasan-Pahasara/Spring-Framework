package lk.ijse.spring.config;

import lk.ijse.spring.controller.CustomerController;
import lk.ijse.spring.pojo.SpringBeanOne;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author : ShEnUx
 * @time : 11:38 PM
 * @date : 1/31/2023
 * @since : 0.1.0
 **/
@Configuration
@EnableWebMvc
//@ComponentScan(basePackages = {"lk.ijse.spring.pojo","lk.ijse.spring.controller"})
@ComponentScan(basePackageClasses = {CustomerController.class, SpringBeanOne.class}) //Alternative
public class WebAppConfig {
    public WebAppConfig() {
        System.out.println("WebAppConfig:Instantiated");
    }
}
