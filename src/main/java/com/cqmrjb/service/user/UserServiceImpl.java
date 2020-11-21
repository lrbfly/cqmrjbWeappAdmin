package com.cqmrjb.service.user;

import com.cqmrjb.dao.user.UserDao;
import com.cqmrjb.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public Map selectUserByName(Map map) {
        Map<String,Object> result = new HashMap();
        User user = userDao.selectUserByName(map.get("userName").toString());
        //验证密码 不正确返回空
        if(user !=null){
            if(!user.getUserPassword().equals(map.get("userPassword").toString())){
                user = null;
            }
        }
        result.put("code",200);
        result.put("msg",user!=null ? "操作成功" : "用户名或密码错误");
        result.put("data",user);
        return result;
    }
}
