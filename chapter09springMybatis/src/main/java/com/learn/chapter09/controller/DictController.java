package com.learn.chapter09.controller;

import com.learn.chapter09.domain.POJO.SysDict;
import com.learn.chapter09.service.DictService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import java.util.List;

/**
 * autor:liman
 * comment:
 */
@Controller
@RequestMapping("/dicts")
public class DictController {

    @Autowired
    private DictService dictService;

    @RequestMapping
    public ModelAndView dicts(SysDict sysDict,Integer offset,Integer limit){
        ModelAndView mv = new ModelAndView();
        List<SysDict> dicts = dictService.findBySysDict(sysDict,offset,limit);
        mv.addObject("dicts",dicts);
        return mv;
    }

    @RequestMapping(value="add",method = RequestMethod.GET)
    public ModelAndView add(Long id){
        System.out.println(id);
        ModelAndView mv = new ModelAndView("dicts_add");
        SysDict sysDict;
        //如果id为空
        if(id == null){
            sysDict = new SysDict();
        }else{
            sysDict = dictService.findById(id);
        }
        mv.addObject("model",sysDict);
        return mv;
    }

    @RequestMapping(value="add",method = RequestMethod.POST)
    public ModelAndView save(SysDict sysDict){
        ModelAndView mv = new ModelAndView("dicts_add");
        try{
            dictService.saveOrUpdate(sysDict);
            mv.setViewName("redirect:/dicts");
        }catch (Exception e){
            mv.setViewName("dicts_add");
            mv.addObject("msg",e.getMessage());
            mv.addObject("model",sysDict);
        }
        return mv;
    }

    @RequestMapping(value = "delete",method = RequestMethod.POST)
    public ModelMap delete(@RequestParam Long id){
        ModelMap modelMap = new ModelMap();
        try{
            boolean success = dictService.deleteById(id);
            modelMap.put("success",success);
        }catch (Exception e){
            modelMap.put("success",false);
            modelMap.put("message",e.getMessage());
        }
        return modelMap;
    }



}
