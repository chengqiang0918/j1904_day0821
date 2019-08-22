package com.j1904.controller;

import com.j1904.pojo.UserTable;
import com.j1904.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserTableController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/view",method = RequestMethod.GET)
    @ResponseBody
    public   List<UserTable> findAll(Model model){
        List<UserTable> userTables=userService.findAll();
        //model.addAttribute("userTables",userTables);
        return userTables;
    }
}
