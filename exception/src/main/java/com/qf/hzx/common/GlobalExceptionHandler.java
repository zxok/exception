package com.qf.hzx.common;

import com.qf.hzx.exception.ServiceException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @program: exception
 * @author: hzx
 * @since: JDK 1.8
 * @create: 2020-11-05 20:05
 * 全局一次处理
 **/
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ServiceException.class)
    public ResponseEntity<Object> handler(ServiceException exception) {
        return ResponseEntity.error(exception.getStatus(),exception.getMessage(),exception.getPit());
    }

}
