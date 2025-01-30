package lk.ijse.bean;

import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TestBean1 {
    public TestBean1() {

        System.out.println("TestBean1 constructor");
    }
}
