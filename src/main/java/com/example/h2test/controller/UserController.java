package com.example.h2test.controller;

import com.example.h2test.bo.User;
import com.example.h2test.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * create by sunzhongwei on 2020/04/22
 * Desc:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    /*
     * author:Lzq
     */

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/query")
    public Optional<User> queryById(@RequestParam Long id) {
        Optional<User> user = userRepository.findById(id);
        return user;
    }

    // 添加或者更新的方法，ID相同则为更新，不同则为插入
    @PutMapping("/addOrUpdate")
    public String addOrUpdate(@RequestBody User user) {
        System.out.println(user);
        userRepository.save(user);
        return "添加或更新成功!";
    }

    @DeleteMapping("/delete")
    public String deleteUser(Long id) {
        userRepository.deleteById(id);
        return "删除成功";
    }
}


