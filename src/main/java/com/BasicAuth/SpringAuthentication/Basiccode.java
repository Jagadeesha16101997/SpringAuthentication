package com.BasicAuth.SpringAuthentication;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.lang.reflect.Method;

@RestController
@RequestMapping
public class Basiccode {

    @RequestMapping(method= RequestMethod.GET, value = "/auth")
    public String getSuccessMessage()
    {
        return "successfull succeeded";
    }
}
