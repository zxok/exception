package com.qf.hzx.service.impl;

import com.qf.hzx.common.ResponseEntity;
import com.qf.hzx.common.StatusCode;
import com.qf.hzx.exception.ServiceException;
import com.qf.hzx.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @program: exception
 * @author: hzx
 * @since: JDK 1.8
 * @create: 2020-11-05 19:55
 **/
@Service
public class TestServiceImpl implements TestService {
    @Override
    public ResponseEntity<Object> login(int id) {
        if (id == 0) {
            throw new ServiceException(StatusCode.ERROR);
        }

        if (id == 1) {
            throw new ServiceException(StatusCode.SUCCESS);
        }

        return ResponseEntity.error(000,"no","没有异常");
    }
}
