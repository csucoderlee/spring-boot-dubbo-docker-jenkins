package org.csu.support;


import org.csu.api.IUserSerice;

/**
 * @author by bixi.lx
 * @created on 2018 03 09 17:19
 */
public class UserService implements IUserSerice {

    @Override
    public void login(String username, String password) {
        System.out.println("调用成功");
    }
}
