package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author : ShEnUx
 * @time : 4:34 PM
 * @date : 1/25/2023
 * @since : 0.1.0
 **/
public class PojoThree implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public PojoThree() {
        System.out.println("PojoThree:Instantiated");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("PojoThree:BeanName Aware: "+name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("PojoThree:BeanFactory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("PojoThree:ApplicationContext Aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("PojoThree:InitializingBean: Bean is Ready for USE");
        System.out.println("=============================");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("PojoThree:Destroyed");
    }
}
