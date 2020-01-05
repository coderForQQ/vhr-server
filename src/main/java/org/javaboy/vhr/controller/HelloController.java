package org.javaboy.vhr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shigm
 * @date 2020/1/2 22:26
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String  hello() {
        return  "hello";
    }
}
