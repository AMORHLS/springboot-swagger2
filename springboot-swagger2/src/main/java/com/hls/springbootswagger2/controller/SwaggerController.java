package com.hls.springbootswagger2.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hls")
@Api(" swagger ui 注释 api 级别")
public class SwaggerController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SwaggerController.class);

    @ApiOperation("swagger ui 注释 方法级别")
    @PostMapping("/hello")
    public Object hello(){
        String data = "springboot 集成 swagger2 ui !";
        return  data;
    }
}
