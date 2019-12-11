package com.gao.test;

import com.gao.MyApp;
import com.gao.dao.UserDao;
import com.gao.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyApp.class)
public class UserTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void test(){
        List<User> all = userDao.findAll();
        System.out.println(all);
        for (User user : all) {
            System.out.println(user);
        }
    }

}
