package com.qf.hzx.utils;

import lombok.Getter;

/**
 * @author Hzx
 */

@Getter
public enum StatusData {

    SUCCESS(200, "成功"),
    SYS_ERROR(401, "系统异常"),
    SERVICE_ERROR(404, "服务异常");
    private int status;
    private String message;

    StatusData(int status, String message) {
        this.status = status;
        this.message = message;
    }

}
