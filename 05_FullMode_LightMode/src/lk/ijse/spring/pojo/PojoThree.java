package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author : ShEnUx
 * @time : 10:25 PM
 * @date : 1/30/2023
 * @since : 0.1.0
 **/

public class PojoThree implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public PojoThree() {
        System.out.println("PojoThree:Instantiated");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("PojoThree:BeanFactoryAware");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("PojoThree:BeanNameAware");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("PojoThree:Disposable Bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("PojoThree:Initializing Bean");
        System.out.println("===================");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("PojoThree:Application Context Aware");
    }
}
