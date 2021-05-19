package com.ck.controller;

import com.ck.entity.booktype;
import com.ck.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Controller
public class bookController {

    @Autowired
    private IBookService bookService;

    @RequestMapping("queryAll")
    public String queryAll(ModelMap modelMap){
        List<booktype> booktypeList = bookService.queryAll();
        modelMap.put("booktypeList",booktypeList);
        return "a";
    }
}
