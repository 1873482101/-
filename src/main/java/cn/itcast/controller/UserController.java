package cn.itcast.controller;


import cn.itcast.domain.User;
import cn.itcast.domain.vo.MessageModel;

import cn.itcast.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @ClassName: UserServlet
 * @Description:
 * @Author 梁智
 * @Date 2021/3/11
 * @Version 1.0
 */
@Controller
@RequestMapping("/")
public class UserController extends HttpServlet {
    @Autowired
    private UserService UserService;
    /**
     * 用户登录
     */
    //@Override
    @RequestMapping("/get")
    public String  service(Model model,HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收客户端的请求
        String uname = req.getParameter("uname");
        String upwd = req.getParameter("upwd");

        System.out.println(uname+"---"+upwd);
        //调用service层的方法，返回消息模型对象
        MessageModel messageModel = UserService.userLogin(uname,upwd);
        System.out.println("code:"+messageModel.getCode());
        //判读消息模型的状态码

        if(messageModel.getCode()==1){
            System.out.println("messageModel.getObject()："+messageModel.getObject());
           // req.getSession().setAttribute("user",messageModel.getObject());

            model.addAttribute("user",messageModel.getObject());

            //resp.sendRedirect("list.jsp");
            return "hello";

        }else {
           // req.setAttribute("messageModel",messageModel);
            String msg = messageModel.getMsg();
            System.out.println(messageModel.getObject() instanceof java.util.List);




            model.addAttribute("messageModel",messageModel.getObject());
            model.addAttribute("code",msg);


            // req.getRequestDispatcher("login.jsp").forward(req,resp);
            //return "forward:login";
            return "login1";

        }



    }


    @RequestMapping("/UserfindAll")
    public String findAll(Model model) {
        System.out.println("表示层查询所有账户...");
        List<User> list = UserService.findAll();
        System.out.println(list);
        model.addAttribute("list", list);
        return "list2";

    }

}
