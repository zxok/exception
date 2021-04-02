package com.qf.hzx.controller;

import com.qf.hzx.service.TestService;
import com.qf.hzx.utils.ResponseEntityBuild;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.constraints.Pattern;
import javax.xml.transform.Result;

/**
 * @program: exception
 * @author: hzx
 * @since: JDK 1.8
 * @create: 2020-11-05 19:53
 **/
@RestController
@RequestMapping("util")
public class TestControllerUtils {

    @Resource
    TestService service;

    @PostMapping("login")
    public ResponseEntityBuild<Object> login(@Pattern(regexp = "^[A-Z]{2}$", message = "格式有误") String username, String password) {
        Result result;
        return ResponseEntityBuild.error(222,username);
    }

    //int status, String msg status,msg
    @GetMapping("err")
    public ResponseEntityBuild<Object> register() {

        return ResponseEntityBuild.error();
    }

}
