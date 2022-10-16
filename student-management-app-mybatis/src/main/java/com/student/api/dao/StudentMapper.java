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
        @SuppressWarnings("unchecked")
        //Pass the id which we have given in the xml
        List<Student> studentList = session.selectList("getAllStudents");
        session.commit();
        session.close();
        return studentList;
    }
}
