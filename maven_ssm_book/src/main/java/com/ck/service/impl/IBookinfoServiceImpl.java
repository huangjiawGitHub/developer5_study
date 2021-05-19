package com.ck.service.impl;

import com.ck.dao.IBookinfoDao;
import com.ck.entity.Bookinfo;
import com.ck.service.IBookinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class IBookinfoServiceImpl implements IBookinfoService {

    @Autowired
    private IBookinfoDao bookinfoDao;

    @Override
    public List<Bookinfo> queryAll(Map map) {
        return bookinfoDao.queryAll(map);
    }
}
