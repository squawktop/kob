package com.kob.backend.controller.user.account;

import com.kob.backend.service.impl.user.account.InfoServiceImpl;
import com.kob.backend.service.user.account.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class InfoController {
    @Autowired
    private InfoService infoService ;

    @GetMapping("/api/user/account/info/")//得到信息， 获取信息一般是Get
    public Map<String , String> getinfo(){
        return infoService.getinfo();
    }

}
