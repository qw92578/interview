package com.cd.interview.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Package: com.cd.interview.controller
 * @ClassName: IndexController
 * @Author: fgq
 * @Description: 页面路径控制
 * @Date: 2019/10/11 10:24
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @RequestMapping()
    public String getIndex (ModelAndView modelAndView) {
        return "test";
    }
}
