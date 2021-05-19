package com.ck.controller;

import com.ck.entity.Bookinfo;
import com.ck.entity.Booktype;
import com.ck.service.IBookinfoService;
import com.ck.service.IBooktypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class BookinfoController {

    @Autowired
    private IBookinfoService bookinfoService;
    @Autowired
    private IBooktypeService booktypeService;

    @RequestMapping("queryAllbi")
    public String queryAll(@RequestParam Map map, ModelMap modelMap){
        if (map.get("btid")==null){
            map.put("btid","");
        }
        if(map.get("bname")==null){
            map.put("bname","");
        }

        List<Bookinfo> bookinfoList = bookinfoService.queryAll(map);
        modelMap.put("bookinfoList",bookinfoList);
        List<Booktype> booktypeList = booktypeService.queryAll();
        modelMap.put("booktypeList",booktypeList);

        modelMap.put("map", map);

        return "p_list";
    }
}
