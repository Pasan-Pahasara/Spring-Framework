package lk.ijse.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author : ShEnUx
 * @time : 5:21 PM
 * @date : 2/1/2023
 * @since : 0.1.0
 **/
@Configuration
@Import(JPAConfig.class)
public class WebRootConfig {
}