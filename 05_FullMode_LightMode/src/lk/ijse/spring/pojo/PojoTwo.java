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
public class PojoTwo implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public PojoTwo() {
        System.out.println("PojoTwo:Instantiated");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("PojoTwo:BeanFactoryAware");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("PojoTwo:BeanNameAware");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("PojoTwo:Disposable Bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("PojoTwo:Initializing Bean");
        System.out.println("===================");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("PojoTwo:Application Context Aware");
    }
}
