package com.ck.test;

import com.ck.dao.ITeacherDaoImpl;
import com.ck.entity.Teacher;
import org.junit.Test;

import java.util.List;

public class Mytest {

    @Test
    public void test1(){
        List<Teacher> teacherList = new ITeacherDaoImpl().queryall();
        System.out.println(teacherList);
    }
}
