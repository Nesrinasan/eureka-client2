package com.asan.demo;

import com.asan.demo.feign.Client1Feign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class Controller {

    @Autowired
    Client1Feign client1Feign;

    @GetMapping(value = "/getContent")
    public String getContentClient1(){

       return "Client1 servisi çağrıldı. İçerik:" + client1Feign.greeting();

    }

}
