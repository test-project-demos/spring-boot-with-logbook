package com.example.springbootwithlogbook;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhixiao.mzx
 * @date 2018/12/30
 */
@Slf4j
@RestController
public class MainController {
    @GetMapping("/get")
    public Object get(User user) {
        log.warn("call get method, param: {}", user);
        return user;
    }

    @PostMapping("/post_json")
    public Object postJson(@RequestBody User user) {
        return user;
    }

    @PostMapping("/post_form")
    public Object postForm(User user) {
        return user;
    }
}
