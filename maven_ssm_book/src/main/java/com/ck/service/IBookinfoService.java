package com.ck.service;

import com.ck.entity.Bookinfo;

import java.util.List;
import java.util.Map;

public interface IBookinfoService {

    public List<Bookinfo> queryAll(Map map);
}
