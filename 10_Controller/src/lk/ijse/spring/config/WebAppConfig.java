package lk.ijse.spring.config;

import lk.ijse.spring.controller.CustomerController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author : ShEnUx
 * @time : 2:26 PM
 * @date : 2/1/2023
 * @since : 0.1.0
 **/
@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = {CustomerController.class})
public class WebAppConfig {
    @Bean
    /**
     *Monolithic Architecture එක use කරනවනම් විතරයි මේක ඕන වෙන්නේ.*/
    public ViewResolver viewResolver(){//views ටික තීන තැන set out කරලා දෙන එක කරන්නේ(Response එක වදිහට යවන්න).
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");//web එක root එකේ ඉදලා ඉන්න තැන දෙනවා
        viewResolver.setSuffix(".jsp");//File එකේ extension එක දෙනවා
        return viewResolver;
    }
}
