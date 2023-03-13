package com.ctx.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

/**
 * @program: gateway
 * @ClassName MadeController
 * @description:
 * @author: ctx
 * @create: 2023-01-30 15:17
 * @Version 1.0
 **/
@RequestMapping("/user")
@RestController
public class MadeController {

    @PostMapping(value = "/12345", consumes= MediaType.APPLICATION_JSON_VALUE)
    public String getUser(){
        return "ceshi";
    }
}
