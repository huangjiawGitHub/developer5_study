package com.ck.dao;

import com.ck.entity.Bookinfo;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface IBookinfoDao {

    //查询图书所有信息
    public List<Bookinfo> queryAll(Map map);
}
