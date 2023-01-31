package lk.ijse.spring.config;

import lk.ijse.spring.pojo.PojoThree;
import lk.ijse.spring.pojo.PojoTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : ShEnUx
 * @time : 10:24 PM
 * @date : 1/30/2023
 * @since : 0.1.0
 **/
@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
public class AppConfig {
    //Full Mode
    //In Full Mode it Satisfied Inter-bean Dependencies
//    @Bean
//    public PojoTwo pojoTwo(){
//        //inter-bean dependencies invocation
//        PojoThree pojoThree = pojoThree();
//        System.out.println(pojoThree);
//        return new PojoTwo();
//    }
//
//    @Bean
//    public PojoThree pojoThree(){
//        return new PojoThree();
//    }
}
