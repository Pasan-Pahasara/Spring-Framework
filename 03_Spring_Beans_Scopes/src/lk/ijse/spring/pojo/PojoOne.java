package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author : ShEnUx
 * @time : 4:34 PM
 * @date : 1/25/2023
 * @since : 0.1.0
 **/
@Component  
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PojoOne implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public PojoOne() {
        System.out.println("PojoOne:Instantiated");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("PojoOne:BeanName Aware: "+name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("PojoOne:BeanFactory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("PojoOne:ApplicationContext Aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("PojoOne:InitializingBean: Bean is Ready for USE");
        System.out.println("=============================");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("PojoOne:Destroyed");
    }
}
