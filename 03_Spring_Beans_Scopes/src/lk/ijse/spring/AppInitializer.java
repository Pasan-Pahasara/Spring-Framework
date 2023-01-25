package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : ShEnUx
 * @time : 6:55 PM
 * @date : 1/25/2023
 * @since : 0.1.0
 **/
public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.registerBean(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();
    }
}
