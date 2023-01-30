package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author : ShEnUx
 * @time : 9:39 PM
 * @date : 1/25/2023
 * @since : 0.1.0
 **/
@Component
public class Boy implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    @Autowired
    Girl girl;

    public Boy() {
        System.out.println("Boy:Instantiated");
    }

    public void chatWithGirl() {
//        Girl girl = new Girl(); //don't create objects
        girl.chat();
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Boy:BeanFactory Aware");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Boy:BeanName Aware: "+s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Boy:Destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Boy:InitializingBean: Bean is Ready for USE");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Boy:ApplicationContext Aware");
    }
}




