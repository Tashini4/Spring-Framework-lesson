package lk.ijse.spring_boot_13.controller;

import lk.ijse.spring_boot_13.dto.CustomerDTO;
import lk.ijse.spring_boot_13.entity.Customer;
import lk.ijse.spring_boot_13.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    //property injection
    @Autowired
    private CustomerService customerService;
    @PostMapping("save")
    public boolean saveCustomer(@RequestBody CustomerDTO customerDTO){
        boolean res = customerService.addCustomer(customerDTO);
        return res;
    }
    @GetMapping("get")
    public List<CustomerDTO> getAllCustomer(){
        return customerService.getAllCustomer();
    }
    @PutMapping("update")
    public CustomerDTO updateCustomer(@PathVariable int id,@RequestBody CustomerDTO customerDTO){
        return customerService.updateCustomer(id,customerDTO);
    }
    @DeleteMapping("/{id}")
    public int deleteCustomer(@PathVariable int id){
        customerService.deleteCustomer(id);
        return id;
    }
}
