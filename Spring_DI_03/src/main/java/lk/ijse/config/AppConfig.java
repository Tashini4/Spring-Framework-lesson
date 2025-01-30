package lk.ijse.config;

import lk.ijse.bean.SpringBean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "lk.ijse.di")
public class AppConfig {
     /*public AppConfig() {

    }*/

    public SpringBean getSpringBean() {
        return new SpringBean();
    }
}
