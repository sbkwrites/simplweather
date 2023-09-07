package controller;

import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    @ResponseBody
    @RequestMapping(value="/hello")
    public String hello(){
        return "hello";
    }

}
