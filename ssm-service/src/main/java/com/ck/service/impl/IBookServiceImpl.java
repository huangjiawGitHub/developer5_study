package com.ck.service.impl;

import com.ck.dao.IBookDao;
import com.ck.entity.booktype;
import com.ck.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IBookServiceImpl implements IBookService {

    @Autowired
    private IBookDao bookDao;

    @Override
    public List<booktype> queryAll() {
        return bookDao.queryAll();
    }
}
