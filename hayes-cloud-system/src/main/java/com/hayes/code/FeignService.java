package com.hayes.code;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "hayes-cloud-gateway")
public interface FeignService {

    @RequestMapping(value = "/about/me", method = RequestMethod.GET)
    public String me();

}
