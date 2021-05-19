package com.ck.controller;

import com.ck.entity.Booktype;
import com.ck.service.IBooktypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class BooktypeController {

    @Autowired
    private IBooktypeService booktypeService;

    @RequestMapping("queryAll")
    public String queryAll(ModelMap modelMap){
        List<Booktype> queryAll = booktypeService.queryAll();
        modelMap.put("queryAll",queryAll);
        return "p_list";
    }

    @RequestMapping("queryById")
    public String queryById(Map map,int id){
        Booktype queryById = booktypeService.queryById(id);
        map.put("bt",queryById);
        return "p_list";
    }
}
