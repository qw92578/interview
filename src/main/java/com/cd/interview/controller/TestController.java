package com.cd.interview.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package: com.cd.interview.controller
 * @ClassName: TestController
 * @Author: fgq
 * @Description:
 * @Date: 2019/10/9 14:22
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "test222222";
    }
}
