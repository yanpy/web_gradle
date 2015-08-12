package com.controller.control;

import com.github.pagehelper.PageHelper;
import com.model.dao.UserInfoMapper;
import com.model.entity.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yanpengyu on 2015/8/10 0010.
 */
@RestController //标注此类为Controller
@RequestMapping("/app")
public class UserInfoController {
    private final static Logger logger = LoggerFactory.getLogger(UserInfoController.class);

    @Autowired
    private UserInfoMapper userInfoMapper;

    @RequestMapping("/insert")
    @ResponseBody
    String getInsert() {
        UserInfo userInfo = new UserInfo();
//        userInfo.setId(1);
        userInfo.setName("asdf");
        userInfo.setAge(12);
        int i = userInfoMapper.insert(userInfo);
        return "Hello World!@@@" + i;
    }

    @RequestMapping("/delete")
    public String getDelete() {
        logger.info("--------------------- delete ------------------------");

        int i = userInfoMapper.deleteByPrimaryKey(101);

        return "delete " + i;
    }

    @RequestMapping("/delete/{uid:.+}")
    public String getDelete(@RequestParam int uid) {
        logger.info("--------------------- delete ------------------------");

        int i = userInfoMapper.deleteByPrimaryKey(uid);

        return "delete " + i;
    }

    @RequestMapping("/update")
    public String getUpdate() {
        logger.info("--------------------- update ------------------------");
        UserInfo userInfo = new UserInfo();
        userInfo.setId(100);
        userInfo.setName("jkl");
        int i = userInfoMapper.updateByPrimaryKey(userInfo);

        return "update " + i;
    }

    @RequestMapping("/select")
    public List getSelect() {
        logger.info("--------------------- select ------------------------");
        return userInfoMapper.selectByExample(null);
    }

    @RequestMapping("/select/page")
    public List getSelectPage() {
        logger.info("--------------------- select ------------------------");
        PageHelper.startPage(1, 4);
        List list = userInfoMapper.selectByExample(null);
        return list;
    }

    @RequestMapping("/select/page2")
    public List getSelectParam(@RequestParam int pageNum,@RequestParam int pageSize) {
        logger.info("--------------------- select ------------------------");
        PageHelper.startPage(pageNum, pageSize);
        List list = userInfoMapper.selectByExample(null);
        return list;
    }
}
