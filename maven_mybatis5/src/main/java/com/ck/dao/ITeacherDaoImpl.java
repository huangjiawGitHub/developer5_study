package com.ck.dao;

import com.ck.entity.Teacher;
import com.ck.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ITeacherDaoImpl implements ITeacherDao {
    @Override
    public List<Teacher> queryall() {
        SqlSession sqlSession = MybatisUtil.openSession(true);
        ITeacherDao teacherDao = sqlSession.getMapper(ITeacherDao.class);
        List<Teacher> queryall = teacherDao.queryall();
        return queryall;
    }
}
