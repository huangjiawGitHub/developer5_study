package com.ck.dao;

import com.ck.entity.booktype;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IBookDao {
    //查询
    @Select("select * from booktype")
    @ResultMap("bookMapper")
    public List<booktype> queryAll();
}
