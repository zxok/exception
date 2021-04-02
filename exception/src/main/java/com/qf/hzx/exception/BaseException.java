package com.qf.hzx.exception;

import com.qf.hzx.common.StatusCode;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @program: exception
 * @author: hzx
 * @since: JDK 1.8
 * @create: 2020-11-05 19:45
 **/
@Data
@NoArgsConstructor
public class BaseException extends RuntimeException {
    private Integer status;
    private String message;
    private String pit;

    public BaseException(StatusCode statusCode) {
        this.status = statusCode.getStatus();
        this.message = statusCode.getMessage();
        this.pit = statusCode.getPit();
    }

    public BaseException(Integer status, String message, String pit) {
        this.status = status;
        this.message = message;
        this.pit = pit;
    }
}
