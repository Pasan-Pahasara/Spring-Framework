package lk.ijse.spring.pojo;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author : ShEnUx
 * @time : 10:57 AM
 * @date : 2/1/2023
 * @since : 0.1.0
 **/
@Component
public class SpringBeanOne implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBeanOne() {
        System.out.println("SpringBeanOne:Instantiated");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("SpringBeanOne:Bean Factory Aware");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("SpringBeanOne:Bean Name Aware");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("SpringBeanOne:Disposable Bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SpringBeanOne:Initializing Bean");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("SpringBeanOne:Application Context Aware");
    }
}
