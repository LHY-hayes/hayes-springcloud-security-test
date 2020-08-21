package com.hayes.code;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient(value = "hayes-cloud-gateway")
public interface FeignService {

    @RequestMapping(value = "/about/me", method = RequestMethod.GET)
    public JSONObject me();

}
