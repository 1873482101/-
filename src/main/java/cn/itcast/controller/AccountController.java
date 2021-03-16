package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @ClassName: AccountController
 * @Description:
 * @Author 梁智
 * @Date 2021/3/6
 * @Version 1.0
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private  AccountService accountService;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表示层查询所有账户...");
       List<Account> list = accountService.findAll();
       model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/save")
    public void save2(Account account, HttpServletRequest request,HttpServletResponse response) throws IOException {
        System.out.println("表示层，保存账号");

        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");//重定向转发可以使用return"forward:findAll"

        //return "forward:findAll";
    }



}
