package com.ck.service;

import com.ck.entity.Booktype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

public interface IBooktypeService {

    public List<Booktype> queryAll();

    public Booktype queryById(int id);
}
