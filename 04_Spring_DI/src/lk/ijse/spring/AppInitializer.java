package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.di.A;
import lk.ijse.spring.pojo.Boy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : ShEnUx
 * @time : 9:34 PM
 * @date : 1/25/2023
 * @since : 0.1.0
 **/
public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.registerBean(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

//        Boy bean = ctx.getBean(Boy.class);
//        bean.chatWithGirl();
        A bean = ctx.getBean(A.class);
        bean.test();
    }
}
