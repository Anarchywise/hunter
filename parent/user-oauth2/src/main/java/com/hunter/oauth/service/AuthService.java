package com.hunter.oauth.service;

import com.hunter.oauth.util.AuthToken;

/*****
 * @Author: www.itheima
 * @Date: 2019/7/7 16:23
 * @Description: com.hunter.oauth.service
 ****/
public interface AuthService {

    /***
     * 授权认证方法
     */
    AuthToken login(String username, String password, String clientId, String clientSecret);
}
