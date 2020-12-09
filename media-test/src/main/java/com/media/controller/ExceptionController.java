package com.media.controller;

import com.media.api.ApiResult;
import com.media.exception.MyExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exception")
public class ExceptionController {

    @RequestMapping("/aa")
    public Object exception() throws Exception{
        try {
            int a = 1/0;
        } catch (Exception e) {
           throw new MyExceptionHandler("测试异常处理");
        }
        return ApiResult.ok();
    }

    @GetMapping("/testException")
    public ApiResult testException() throws Exception{
        try {
            int a = 1/0;
        } catch (Exception e) {
            throw new MyExceptionHandler("测试异常处理返回格式");
        }
        return ApiResult.ok();
    }
}
