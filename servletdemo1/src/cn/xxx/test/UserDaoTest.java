package cn.xxx.test;

import cn.xxx.dao.Userdao;
import cn.xxx.domain.User;
import org.junit.Test;

public class UserDaoTest {



    @Test
    public void testLogin(){
        User loginuser = new User();
        loginuser.setUsername("mayun");
        loginuser.setPassword("123");


        Userdao dao = new Userdao();
        User user = dao.login(loginuser);

        System.out.println(user);
    }
}
