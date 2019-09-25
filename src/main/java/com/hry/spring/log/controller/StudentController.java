package com.hry.spring.log.controller;

import com.hry.spring.log.entity.UserEntity;
import com.hry.spring.log.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: WangCan
 * @Date: 2019/9/25 13:25
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private UserJPA userJPA;

    /**
     * 查询用户列表方法
     * @return
     */
    @RequestMapping(value ="/list" ,method = RequestMethod.GET)
    public List<UserEntity> list(){
        return userJPA.findAll();
    }
}
