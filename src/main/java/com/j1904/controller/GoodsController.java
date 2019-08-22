package com.j1904.controller;

import com.j1904.pojo.Goods;
import com.j1904.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class GoodsController {

    @Autowired
    private GoodsService goodsService;
    @RequestMapping("/login")
    public String view(){
        return "redirect:findAll";
    }

    @RequestMapping(value = "/findAll")
    public String findAll(Model model){
        List<Goods> goodsList=goodsService.findAll();
        model.addAttribute("goodsList",goodsList);
        return "zhanshi";
    }
}
