package lk.ijse.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {
    public String getCustomer(){
        return "Customer Controller";
    }

}
