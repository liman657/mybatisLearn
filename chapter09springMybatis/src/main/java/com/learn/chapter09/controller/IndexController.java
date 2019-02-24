package com.learn.chapter09.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@Controller
public class IndexController {

    @RequestMapping(value={"","/index"})
    public ModelAndView dicts(){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("now",new Date());
        System.out.println(new Date());
        return mv;
    }

}
