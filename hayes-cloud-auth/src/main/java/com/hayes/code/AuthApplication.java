package com.hayes.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableDiscoveryClient
@SpringBootApplication
@Controller
public class AuthApplication {
    public static void main(String[] args) {

        SpringApplication.run(AuthApplication.class, args);

    }

    @RequestMapping("/login")
    public String login(){

        return "login";
    }

}
