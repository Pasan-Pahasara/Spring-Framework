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
@Component
public class PojoTwo implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public PojoTwo() {
        System.out.println("PojoTwo:Instantiated");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("PojoTwo:BeanName Aware: "+name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("PojoTwo:BeanFactory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("PojoTwo:ApplicationContext Aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("PojoTwo:InitializingBean: Bean is Ready for USE");
        System.out.println("=============================");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("PojoTwo:Destroyed");
    }
}
