package lk.ijse.controller;

import lk.ijse.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("form")
public class FormDataController {
    //id-1
    //name-ewe
    //address-we
    @PostMapping
    public String test1(@RequestParam("id") String id,@RequestParam("name") String name){
        return id + " " + name;
    }
    @PostMapping(path = "test2")
    public String test2(@ModelAttribute CustomerDTO customerDTO){
        return customerDTO.toString();
    }


}
