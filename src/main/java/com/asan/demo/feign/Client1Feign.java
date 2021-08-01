package com.asan.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "client1")
public interface Client1Feign {

    @GetMapping("/client/greeting")
    String greeting();

}
