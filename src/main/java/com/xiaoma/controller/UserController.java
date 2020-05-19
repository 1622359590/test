package com.xiaoma.controller;

import com.xiaoma.pojo.User;
import com.xiaoma.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("get")
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping("home")
    public String gethome(HttpServletResponse response, HttpServletRequest request){
        List<User> users = userService.selectAll();
        request.setAttribute("users",users);
        return "home";
    }
    @RequestMapping("select")
    public String getselect(String name,HttpServletResponse response, HttpServletRequest request){
        User user = userService.selectbyId(name);
        System.out.println(user);
        List<User> users = new ArrayList<>();
        users.add(user);
        request.setAttribute("users",users);
        return "home";
    }
    @RequestMapping("delete")
    public String delete(Integer id,HttpServletResponse response, HttpServletRequest request){
        userService.delete(id);
        return gethome(response,request);
    }
    @RequestMapping("add")
    public String add(User user,HttpServletResponse response, HttpServletRequest request){
        userService.add(user);
        return gethome(response,request);
    }
    @RequestMapping("toupdate")
    public String toupdate(Integer id,HttpServletResponse response, HttpServletRequest request){
        User user = userService.selectId(id);
        request.setAttribute("user",user);
        return "update";
    }
    @RequestMapping("tohome")
    public String update(User user,HttpServletResponse response, HttpServletRequest request){
        userService.update(user);
        return gethome(response,request);
    }

}
