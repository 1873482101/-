package cn.itcast.service;

import cn.itcast.domain.User;
import cn.itcast.domain.vo.MessageModel;

import java.util.List;

public interface UserService {
    public List<User> findAll();

    public void save(User user);

    public MessageModel userLogin(String uname, String upwd);
}
