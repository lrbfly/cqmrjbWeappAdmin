package com.cqmrjb.controller.user;

import com.cqmrjb.entity.user.User;
import com.cqmrjb.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping( "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping( "/login")
    @ResponseBody
    public Map<String,Object> selectUserByIdTest(@RequestBody Map<String,Object> params){
        return userService.selectUserByName(params);
    }
}
