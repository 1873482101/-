package cn.itcast.dao;

import cn.itcast.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName: UserDao
 * @Description:
 * @Author 梁智
 * @Date 2021/3/12
 * @Version 1.0
 */
@Repository
public interface UserDao {
    @Select("select * from User")
    public List<User> findAll();

    @Select("select * from User where username=#{name}")
    public List<User> findname(String name);

     @Insert("insert into User (username,password) values(#{username},#{password})")
    public void saveAccount(User user);
}
