package cn.itcast.service.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import cn.itcast.domain.vo.MessageModel;
import cn.itcast.service.UserService;
import cn.itcast.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: UserServiceImpl
 * @Description:
 * @Author 梁智
 * @Date 2021/3/13
 * @Version 1.0
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public MessageModel userLogin(String uname, String upwd) {

        MessageModel messageModel = new MessageModel();
        //回显数据
        User u = new User();
        u.setUsername(uname);
        u.setPassword(upwd);
        messageModel.setObject(u);

        System.out.println("uname:"+uname+"-----"+"upwd:"+upwd);

        //1.参数的非空判断
        if(StringUtil.isEmpty(uname) || StringUtil.isEmpty(upwd)){
            messageModel.setCode(0);
            messageModel.setMsg("用户名和密码不能为空");
            System.out.println("非空判断");

            return messageModel;
        }

        //2.调用dao 层的查询方法，调用用户名查询用户对象
        List<User> user = userDao.findname(uname);
        System.out.println("user查询结果："+user);

        System.out.println("user  0 为空"+user.size());

        //3判断用户对象是否为空
        if(user.size()==0){
            //发送状态码，提示信息，回显数据设置到消息模型对象中，返回消息模型对象
            messageModel.setCode(0);
            messageModel.setMsg("用户不存在！");
            System.out.println("用户不存在");
            return messageModel;
        }
        //4.判断数据库中查询到的用户密码与前台密码比较
        for (User x : user) {
            if(!upwd.equals(x.getPassword())){
                messageModel.setCode(0);
                messageModel.setMsg("用户密码不正确");
                System.out.println("用户密码不正确");
                return messageModel;
            }
            //5.登录成功将用户信息设置掉消息模型
            messageModel.setObject(user);
        }
        return messageModel;
    }

    @Override
    public List<User> findAll() {
        System.out.println("业务登录，查询账户");

        return userDao.findAll();
    }

    @Override
    public void save(User user) {

    }
}
