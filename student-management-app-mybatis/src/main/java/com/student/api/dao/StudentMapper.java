package com.student.api.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.student.api.entities.Student;
import com.student.api.util.MyBatisUtil;

@Repository
public class StudentMapper {
     public List<Student> getAllStudents(){

         SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        //@SuppressWarnings("unchecked")
        //Pass the id which we have given in the xml
        List<Student> studentList = session.selectList("getAllStudents");
        session.commit();
        session.close();
        return studentList;
    }

    public Student findById(long stdID)
    {
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        Student student = session.selectOne("findById", stdID);
        session.commit();
        session.close();
        return student;
    }

    public void save(Student student)
    {
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        session.selectOne("addStudent", student);
        session.commit();
        session.close();
    }

    public void updateStdData(Student student)
    {
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        session.selectOne("updateStudent", student);
        session.commit();
        session.close();
    }

    public void deleteById(long stdID)
    {
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        session.selectOne("deleteStudent", stdID);
        session.commit();
        session.close();
    }
}
