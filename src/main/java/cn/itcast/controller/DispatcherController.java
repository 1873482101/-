package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: DispatcherController
 * @Description:
 * @Author 梁智
 * @Date 2021/3/14
 * @Version 1.0
 */
@RequestMapping("/")
@Controller
public class DispatcherController {
    @RequestMapping("/login")
    public String loginPage() {
        return "login1";
    }

    @RequestMapping("/index")
    public String index() {
        return "redirect:/index.jsp";
    }
}