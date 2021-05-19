package com.ck.dao;

import com.ck.entity.Booktype;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IBooktypeDao {

    //查询图书类型信息
    @Select("select * from booktype")
    public List<Booktype> queryAll();

    //根据id查询
    @Select("select * from booktype where btid=#{0}")
    public Booktype queryById(int id);
}
