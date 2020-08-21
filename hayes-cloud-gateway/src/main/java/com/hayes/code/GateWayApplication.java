package com.hayes.code;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
@Slf4j
public class GateWayApplication {
    public static void main(String[] args) {

        SpringApplication.run(GateWayApplication.class, args);

    }

    @RequestMapping("/about/me")
    public JSONObject me (){

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","tom");
        jsonObject.put("age","25");
        jsonObject.put("addr","beijing");

        return jsonObject ;
    }



}
