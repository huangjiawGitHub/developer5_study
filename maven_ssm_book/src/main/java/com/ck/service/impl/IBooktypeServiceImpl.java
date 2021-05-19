package com.ck.service.impl;

import com.ck.dao.IBooktypeDao;
import com.ck.entity.Booktype;
import com.ck.service.IBooktypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IBooktypeServiceImpl implements IBooktypeService {

    @Autowired
    private IBooktypeDao booktypeDao;

    @Override
    public List<Booktype> queryAll() {
        return booktypeDao.queryAll();
    }

    @Override
    public Booktype queryById(int id) {
        return booktypeDao.queryById(id);
    }
}
