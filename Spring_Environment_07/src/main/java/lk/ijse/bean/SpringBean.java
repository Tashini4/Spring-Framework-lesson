package lk.ijse.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean {
    @Value("${os.name}")
    private String osName;

    @Value("${USERNAME}")
    private String logName;

    @Value("${db.user}")
    private String user;

    @Value("${db.password}")
    private String password;

    public SpringBean(){
        System.out.println("SpringBean Constructor");
        System.out.println("OS Name : " +osName);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("OS Name :" +osName);
        System.out.println("User name :" + logName);
    }
}
