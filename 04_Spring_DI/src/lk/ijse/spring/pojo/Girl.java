package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author : ShEnUx
 * @time : 9:57 PM
 * @date : 1/25/2023
 * @since : 0.1.0
 **/
@Component
public class Girl implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public Girl() {
        System.out.println("Girl:Instantiated");
    }

    public void chat() {
        System.out.println("Hello hi..!");
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Girl:BeanFactory Aware");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Girl:BeanName Aware: "+s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Girl:Destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Girl:InitializingBean: Bean is Ready for USE");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Girl:ApplicationContext Aware");
    }
}

