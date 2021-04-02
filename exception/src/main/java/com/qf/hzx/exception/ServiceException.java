package com.qf.hzx.exception;

import com.qf.hzx.common.StatusCode;

/**
 * @program: exception
 * @author: hzx
 * @since: JDK 1.8
 * @create: 2020-11-05 19:45
 **/
public class ServiceException extends BaseException {
    public ServiceException(StatusCode statusCode) {
        super(statusCode);
    }

    public ServiceException(Integer status, String message, String pit) {
        super(status, message, pit);
    }
}
