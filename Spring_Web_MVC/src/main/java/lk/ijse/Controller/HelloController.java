package lk.ijse.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("hello")
public class HelloController {
    //public HelloController(){
      //  System.out.println("Hello Controller");
   // }
    @GetMapping
    public String SayHello(){
       return  "index";
    }
   // @GetMapping("test")
    //public String test(){
      //  return  "Hello World";
    //}
    //@GetMapping("test1")
    //public String test1(){
      //  return  "Hello World";
    }

