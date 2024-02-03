package com.kob.backend.controller.pk;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(tags = "PK_API")
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "pk/index.html";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "test test test";
    }

}
