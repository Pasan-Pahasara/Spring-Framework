package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author : ShEnUx
 * @time : 10:25 PM
 * @date : 1/30/2023
 * @since : 0.1.0
 **/
@Component
public class PojoOne implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public PojoOne() {
        System.out.println("PojoOne:Instantiated");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("PojoOne:BeanFactoryAware");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("PojoOne:BeanNameAware");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("PojoOne:Disposable Bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("PojoOne:Initializing Bean");
        System.out.println("===================");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("PojoOne:Application Context Aware");
    }

    //Light Mode
    //In light inter bean dependencies are not satisfied
    @Bean
    public PojoTwo pojoTwo(){
        //inter-bean dependencies invocation
        PojoThree pojoThree1 = pojoThree();//In here they create simple Object
        PojoThree pojoThree2 = pojoThree();//In here they create simple Object
        System.out.println(pojoThree1);//Two links
        System.out.println(pojoThree2);//Two links
        return new PojoTwo();
    }

    @Bean
    public PojoThree pojoThree(){
        return new PojoThree();
    }
}
