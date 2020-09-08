package cn.tsc.edu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@ResponseBody
@Controller
public class hello {
   @RequestMapping("/hello")

    public String hello(){
       return  "hello world! ts college and tsc";
   }
}
