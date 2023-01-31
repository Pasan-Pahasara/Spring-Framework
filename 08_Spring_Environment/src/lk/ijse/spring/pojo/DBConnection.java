package lk.ijse.spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author : ShEnUx
 * @time : 6:49 PM
 * @date : 1/31/2023
 * @since : 0.1.0
 **/
@Component
public class DBConnection implements InitializingBean {
    @Value("${os.name}")//Property placeholder
    private String myOSName;

    @Value("${USERNAME}")//Property placeholder
    private String myUserName;
    @Value("${db.user.name}") 
    private String dbUserName;
    @Value("${db.user.password}")
    private String dbPassWord;
    @Value("${user.email}")
    private String userEmail;

    public DBConnection() {
        System.out.println("DBConnection:Instantiated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(myOSName);
        System.out.println(myUserName);
        System.out.println("===============");
        System.out.println(dbUserName);
        System.out.println(dbPassWord);
        System.out.println("===============");
        System.out.println(userEmail);
    }
}
