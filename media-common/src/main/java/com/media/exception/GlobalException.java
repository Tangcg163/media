package com.media.exception;

import com.media.api.ApiCode;
import com.media.api.ApiResult;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tangchenggang
 */

@ControllerAdvice
@RestController
public class GlobalException {

    @ExceptionHandler(value = MyExceptionHandler.class)
    @ResponseStatus(HttpStatus.OK)
    public ApiResult ExceptionHandler(MyExceptionHandler myExceptionHandler){
        return ApiResult.fail(myExceptionHandler.getMessage());
    }
}
