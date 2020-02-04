package cn.tedu.uo.service;

import cn.tedu.uo.domain.User;

public interface Userservice {
    void addPoints(String userId,int money);
    User queryUser(String userId);
}
