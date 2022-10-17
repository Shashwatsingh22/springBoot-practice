package com.student.api.service;

import com.student.api.dao.StudentMapper;
import com.student.api.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentMapper studentMapper;


    @Override
    public List<Student> getStudentList() {
          return studentMapper.getAllStudents();
    }

    @Override
    public Student getStudentById(long stdId) {
        return studentMapper.findById(stdId);
    }

    @Override
    public Student addNewStudent(Student student) {
        studentMapper.save(student);
        return student;
    }

    @Override
    public Student updateData(Student student) {
          studentMapper.updateStdData(student);
          return student;
    }

    @Override
    public void deleteStudentById(long stdId) {
         studentMapper.deleteById(stdId);
    }
}
