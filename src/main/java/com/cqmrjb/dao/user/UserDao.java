package com.cqmrjb.dao.user;
import com.cqmrjb.entity.user.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserDao {
    public User selectUserByName(String userId);
}
