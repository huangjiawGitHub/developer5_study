package com.ck.dao;

import com.ck.entity.Teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ITeacherDao {

    @Select("select * from teacher")
    public List<Teacher> queryall();
}
