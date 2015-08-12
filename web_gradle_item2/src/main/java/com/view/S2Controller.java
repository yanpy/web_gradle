package com.view;

import com.model.dao.UserInfoMapper;
import com.model.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yanpengyu on 2015/8/10 0010.
 */
@RestController //标注此类为Controller
//@EnableAutoConfiguration //启动自动注入
@RequestMapping("/app")
public class S2Controller {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @RequestMapping("/")
    @ResponseBody
    String getS2() {
        return "Hello World!@@@";
    }

//    @RequestMapping("/inster")
//    @ResponseBody
//    String getInsert() {
//
//        UserInfo userInfo = new UserInfo();
////        userInfo.setId(1);
//        userInfo.setName("asdf");
//        userInfo.setAge(12);
//        int i = userInfoMapper.insert(userInfo);
//        return "Hello World!@@@" + i;
//    }
}
