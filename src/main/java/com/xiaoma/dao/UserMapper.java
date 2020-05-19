package com.xiaoma.dao;

import com.xiaoma.pojo.User;

import java.util.List;

public interface UserMapper {
    //根据id查询
    public User selectId(Integer id);
    public List<User> selectAll();
    //根据id查询
    public User selectbyId(String name);
    //删除
    public void delete(int id);
    //新增
    public void add(User user);
    //修改
    public void update(User user);
}
