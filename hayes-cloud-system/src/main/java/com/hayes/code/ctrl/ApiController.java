package com.hayes.code.ctrl;

import com.hayes.code.FeignService;
import com.hayes.code.result.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Autowired
    private FeignService feignService;

    @RequestMapping("/index")
    public JsonResult index() {

        return JsonResult.success();

    }


    @RequestMapping("/me")
    public JsonResult me() {

        String me = feignService.me();


        return JsonResult.success(me);

    }


}
