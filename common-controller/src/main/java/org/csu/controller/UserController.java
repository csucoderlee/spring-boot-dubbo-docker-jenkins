package org.csu.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.csu.support.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author by bixi.lx
 * @created on 2018 03 11 18:08
 */
@RestController
public class UserController {
    @Reference(version = "1.0.0")
    private UserService userService;

    @GetMapping("/login")
    public void login() {
        userService.login("csu", "csu");
    }
}
