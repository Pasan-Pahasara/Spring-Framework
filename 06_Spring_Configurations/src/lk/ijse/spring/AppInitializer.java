package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.config.ConfigOne;
import lk.ijse.spring.config.ConfigTwo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : ShEnUx
 * @time : 12:09 PM
 * @date : 1/31/2023
 * @since : 0.1.0
 **/
public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        //If we have more than one config class
        //We can register them to the context as follows
        ctx.register(AppConfig.class);
//        ctx.register(ConfigOne.class);
//        ctx.register(ConfigTwo.class);
        ctx.refresh();
        ctx.registerShutdownHook();
    }
}
