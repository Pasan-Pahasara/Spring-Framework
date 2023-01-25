package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.PojoOne;
import lk.ijse.spring.pojo.PojoThree;
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

        PojoThree bean1 = ctx.getBean(PojoThree.class);
        PojoThree bean2 = ctx.getBean(PojoThree.class);
        System.out.println(bean1);
        System.out.println(bean2);

        PojoOne b1 = ctx.getBean(PojoOne.class);
        PojoOne b2 = ctx.getBean(PojoOne.class);
        System.out.println(b1);
        System.out.println(b2);
    }
}
