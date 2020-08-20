package com.hayes.code.ctrl;

import com.hayes.code.result.JsonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @RequestMapping("/index")
    public JsonResult index(){

        return JsonResult.success();

    }

}
