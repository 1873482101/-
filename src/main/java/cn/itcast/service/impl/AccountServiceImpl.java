package cn.itcast.service.impl;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: AccountServiceImpl
 * @Description:
 * @Author 梁智
 * @Date 2021/3/6
 * @Version 1.0
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("业务一，查询账户");

        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务二，保存账户");
        accountDao.saveAccount(account);
    }
}
