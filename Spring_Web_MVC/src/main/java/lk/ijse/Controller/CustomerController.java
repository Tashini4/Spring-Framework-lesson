package lk.ijse.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//javaEE
//web.xml -> URL pattern ?(localhost:8080/web/customer)
//customer -> servlet


@RestController
@RequestMapping("customer")
public class CustomerController {
    public String getCustomer(){
        return "Customer Controller";
    }
}
