package com.itheima.controller;

import com.itheima.pojo.Itims;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/items")
public class UserController {

    @Autowired
    private UserService userService;

    /*查询所有*/
    @RequestMapping(value = "/findAll")
    public String findAll(Model model) {
        List<Itims> sava = userService.sava();
        System.out.println(sava);
        model.addAttribute("items",sava);
        return "items";
    }
    /*添加*/
    @RequestMapping(value = "/insert")
  public String sava(Itims itims)
  {
      System.out.println(1);
      Integer inst = userService.inst(itims);
      System.out.println(inst);
      return "redirect:/items/findAll";
  }
}
