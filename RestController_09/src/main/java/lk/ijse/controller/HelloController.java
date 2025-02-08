package lk.ijse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello")
public class HelloController {
    @GetMapping
    public String SayHello() {
        return "get mapping invoked";
    }
    @PostMapping
    public String SayHelloPost(){
        return "post mapping invoked";
    }
    @PutMapping
    public String SayHelloPut(){
        return "put mapping invoked";
    }
    @DeleteMapping
    public String SayHelloDelete(){
        return "delete mapping invoked";
    }
}
