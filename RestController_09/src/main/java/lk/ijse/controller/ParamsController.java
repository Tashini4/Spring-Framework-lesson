package lk.ijse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("params")
public class ParamsController {
    @GetMapping(params = {"id"})
    public String test1(@RequestParam("id") String id){
        return id;
    }
    @GetMapping(params = {"id","name"})
    public String test2(@RequestParam("id") String id , @RequestParam("name") String name){
        return id + " " + name;
    }



}
