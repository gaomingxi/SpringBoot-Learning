package com.example.jdbc.migrate.file.controller;

import com.example.jdbc.migrate.file.service.FileUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO 用一句话描述这是干什么的
 *
 * @author gaomingxi@haier.com
 * @version 1.0
 * @date 2020/9/22 23:12
 */
@RestController
@RequestMapping("/api/v1/file")
public class FileUpdateController {

    @Autowired
    private FileUpdateService fileUpdateService;

    @RequestMapping("/updateFile/{id}/{name}")
    String updateFile(@PathVariable String id, @PathVariable String name) {
        return fileUpdateService.updateFileOss(name, id);
    }
}
