package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author : ShEnUx
 * @time : 12:09 PM
 * @date : 1/31/2023
 * @since : 0.1.0
 **/
@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.pojo")
@Import({ConfigOne.class,ConfigTwo.class})
//@ImportResource("classpath:abcd.xml") //XML files import කරන්න තින්නේ.
//@ImportResource("filepath:abcd.xml")
public class AppConfig {
    public AppConfig(){
        System.out.println("AppConfig:Instantiated");
    }
}
