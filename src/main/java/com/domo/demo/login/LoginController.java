package com.domo.demo.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(getClass());
    
    //http://localhost:8080/login?name=franco
    @RequestMapping("login")
    public String gotologinPage(@RequestParam String name, ModelMap model){
        model.put("name", name);
        logger.debug("Request param is {}", name);
        logger.info("Info Level");
        logger.warn("Warm Level");
        return "login";
    }
}
