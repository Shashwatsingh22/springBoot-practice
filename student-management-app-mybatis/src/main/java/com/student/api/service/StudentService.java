package com.student.api.service;

import java.util.List;
import com.student.api.entities.Student;

public interface StudentService {

    //this work we are doing for lose-coupling
    public List<Student> getStudentList();
    public Student getStudentById(long stdId);

    Student addNewStudent(Student student);

    Student updateData(Student student);

    void deleteStudentById(long stdId);
//    public Student addNewStudent(Student student);
//    public Student updateData(Student student);
//    public  void deleteStudentById(long stdId);
}
