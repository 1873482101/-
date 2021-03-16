package cn.itcast.test;

import cn.itcast.service.AccountService;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    /**
     * 获取spring的ioc容器，并根据id获取对象
     */
    @Test
    public void run1(){
        // 加载配置文件获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // 根据id获取Bean对象
        AccountService as = (AccountService) ac.getBean("accountService");
        // 调用方法
        as.findAll();
    }

}
