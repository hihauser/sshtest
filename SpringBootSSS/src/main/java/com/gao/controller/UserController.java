package com.gao.controller;

import com.gao.common.ResponseResult;
import com.gao.dao.UserDao;
import com.gao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
@CrossOrigin//跨域请求
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    //@GetMapping("/findAll")
    public ResponseResult<User> findAll(){
        List<User> users = userDao.findAll();
        ResponseResult<User> result =new ResponseResult<>(true,CodeMenu.SUCCESS);

        result.setUser(new User());
        result.setUserList(users);
        return result;
    }

    @GetMapping("/findById")
    public ResponseResult<User> findall(int id){
        System.out.println("===================");
        Optional<User> byId = userDao.findById(id);
        User user = byId.get();
        ResponseResult<User> result =new ResponseResult<>(true,CodeMenu.SUCCESS);
        result.setUser(user);
        result.setUserList(new ArrayList<>());
        return result;
    }

    @PostMapping("/updateUser")
    public ResponseResult<User> updateUser(@RequestBody User user){
        System.out.println(user);
        userDao.save(user);
        ResponseResult<User> result =new ResponseResult<>(true,CodeMenu.SUCCESS);
        result.setUser(new User());
        result.setUserList(new ArrayList<>());
        return result;
    }

}
