package com.hls.demo.controller;

import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerController {

    private static final Logger LOG = LoggerFactory.getLogger(SwaggerController.class);

    @ApiOperation(value="测试", notes="测试swagger")
    @RequestMapping("/test")
    public String test(){
        LOG.info("进入");
        return "success";
    }
}
