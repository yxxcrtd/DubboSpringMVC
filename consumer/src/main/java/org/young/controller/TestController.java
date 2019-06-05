package org.young.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.young.service.TestService;

import java.util.Date;

@RestController
@RequestMapping("dubbo")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("say")
    public String say() {
        System.out.println("=====================================" + new Date());
        return testService.saySomething("world ......");
    }

}
