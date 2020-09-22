package com.example.jdbc.migrate.file.service.impl;

import cn.hutool.core.date.DateUtil;
import com.example.jdbc.migrate.file.service.FileUpdateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * TODO 用一句话描述这是干什么的
 *
 * @author gaomingxi@haier.com
 * @version 1.0
 * @date 2020/9/22 22:31
 */
@Slf4j
@Service(value = "fileUpdateService")
public class FileUpdateServiceImpl implements FileUpdateService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String updateFileOss(String name, String id) {
        try {
            String sql = "update t_test set name = ? where id = ? ";
            int i = jdbcTemplate.update(sql, name, id);
            return "受影响行数：" + i;
        } catch (DataAccessException e) {
            log.error("更新异常，异常信息:", e);
            return "更新异常，异常信息：" + e.toString();
        }
    }
}
