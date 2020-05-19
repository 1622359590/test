package com.xiaoma.service;

import com.xiaoma.dao.UserMapper;
import com.xiaoma.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userDao;
    @Override
    public List<User> selectAll() {
        return userDao.selectAll();
    }

    @Override
    public User selectbyId(String name) {
        return userDao.selectbyId(name);
    }

    @Override
    public void delete(int id) {
        userDao.delete(id);
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public User selectId(Integer id) {
        return userDao.selectId(id);
    }
}
