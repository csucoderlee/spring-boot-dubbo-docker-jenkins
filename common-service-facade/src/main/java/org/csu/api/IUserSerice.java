package org.csu.api;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author by bixi.lx
 * @created on 2018 03 09 17:19
 */
@Service(version = "1.0.0")
@org.springframework.stereotype.Service
public interface IUserSerice {

    void login(String username, String password);
}
