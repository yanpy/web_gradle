package com.view;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yanpengyu on 2015/8/10 0010.
 */

@RestController //标注此类为Controller
//@EnableAutoConfiguration //启动自动注入
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String getSample() {
        return "Hello World!@@@";
    }

    @RequestMapping("/app")
    @ResponseBody
    String getSample(@RequestParam String str) {
        return "Hello World ### !!!" + str;
    }

}
