package com.kob.backend.controller.user.bot;

import com.kob.backend.service.user.bot.AddService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class AddController {
    @Autowired
    private AddService addService ;

    @PostMapping("/api/user/bot/add/") //添加操作是需要修改数据库的，推荐使用post
    public Map<String , String> add(@RequestParam Map<String , String> data){
        return addService.add(data);
    }
}
