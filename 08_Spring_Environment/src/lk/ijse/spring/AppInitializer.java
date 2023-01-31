package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;

/**
 * @author : ShEnUx
 * @time : 6:43 PM
 * @date : 1/31/2023
 * @since : 0.1.0
 **/
public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        //OS environment variables
        Map<String, String> getenv = System.getenv();
        for (String key : getenv.keySet()) {
            String value = getenv.get(key);
            System.out.println(key+" : "+value);
        }

        //Java environment variables
        Properties properties = System.getProperties();
        for (Object key : properties.keySet()) {
            Object value = properties.get(key);
            System.out.println(key+" : "+value);
        }
    }
}
