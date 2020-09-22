package com.example.jdbc.migrate.file.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO 用一句话描述这是干什么的
 *
 * @author gaomingxi@haier.com
 * @version 1.0
 * @date 2020/9/22 22:03
 */
@RestController
@RequestMapping("/api/v1/hello")
public class HelloApiController {

    @RequestMapping("/say/{name}")
    String sayHello(@PathVariable String name) {
        return "Hello," + name + "!";
    }
}
