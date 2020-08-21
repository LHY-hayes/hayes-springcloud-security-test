package com.hayes.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class GateWayApplication {
    public static void main(String[] args) {

        SpringApplication.run(GateWayApplication.class, args);

    }

    @RequestMapping("/about/me")
    public Authentication me (Authentication authentication){

        return authentication ;

    }



}
