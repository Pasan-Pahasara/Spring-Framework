package lk.ijse.spring.config;

import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.repo.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

/**
 * @author : ShEnUx
 * @time : 3:25 PM
 * @date : 2/6/2023
 * @since : 0.1.0
 **/
@Configuration
@EnableTransactionManagement//මේකෙන් තමයි Transaction Management එක automatically වෙන්නේ.(අපට Transaction එක තියෙන තැන පෙන්නලා දෙන්න විතරයි තීන්නේ.) AOP use කරනවා.
@EnableJpaRepositories(basePackageClasses = {CustomerRepo.class, ItemRepo.class})
@PropertySource("classpath:application.properties")
public class JPAConfig {
    @Autowired
    private Environment env;
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource ds, JpaVendorAdapter va){
        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setPackagesToScan(env.getRequiredProperty("pro.entity"));//Good practice එකක් විදිහට මේ වගේ වෙනස් වෙන දේවල් class ඇතුලේ ලියන්න නෑ.
        factoryBean.setDataSource(ds);
        factoryBean.setJpaVendorAdapter(va);
        return factoryBean;
    }
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getRequiredProperty("pro.driver"));
        dataSource.setUrl(env.getRequiredProperty("pro.url"));
        dataSource.setUsername(env.getRequiredProperty("pro.username"));
        dataSource.setPassword(env.getRequiredProperty("pro.password"));
        return dataSource;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter(){
        HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
        jpaVendorAdapter.setDatabasePlatform(env.getRequiredProperty("pro.dial"));
        jpaVendorAdapter.setDatabase(Database.MYSQL);
        jpaVendorAdapter.setGenerateDdl(true);//query create කරන්නේ මේකෙන්.
        jpaVendorAdapter.setShowSql(true);//query ටික print කරනවා.
        return jpaVendorAdapter;
    }

    @Bean
//    Transaction Management part
    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory){
        return new JpaTransactionManager(entityManagerFactory);
    }
}
