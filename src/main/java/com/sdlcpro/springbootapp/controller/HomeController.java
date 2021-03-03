package com.sdlcpro.springbootapp.controller;

import com.sdlcpro.springbootapp.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @ResponseBody                                                    //Controller + ResponseBody = RestController
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public Student homeMethod(){
        //return "home";
        return new Student(1,"tanvir","ict");
    }

    @GetMapping("/home2")
    public String home2Method(){
        return "home2";
    }


}
