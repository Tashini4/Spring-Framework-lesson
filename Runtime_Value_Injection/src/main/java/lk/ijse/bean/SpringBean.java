package lk.ijse.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean {

    @Value("Tashini")
    private String name;

    public SpringBean(){
        System.out.println("String Bean Constructor");
        System.out.println(name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(name);
    }

    //public SpringBean(){}
    /*@Autowired(required = false)
    public SpringBean(@Value("Tashini") String name,@Value("5") int num,@Value("true") boolean x){
        System.out.println("Spring Bean Constructor");
        System.out.println(name);
        System.out.println(num);
        System.out.println(x);
    }
    @Autowired(required = false)
    public SpringBean(@Value("Tashini") String name,@Value("5") int num ){
        System.out.println("Spring Bean Constructor");
        System.out.println(name);
        System.out.println(num);

    }*/
}
