package com.student.api.service;

import com.student.api.entities.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImp implements StudentService {

    List<Student> list;

    public  StudentServiceImp()
    {
        list = new ArrayList<>();
        list.add(new Student(1,"Shashwat Singh","Varanasi",1234567890,"XII","C"));
        list.add(new Student(2,"Ramesh Yadav","Varanasi",1234567891,"XI","D"));
    }

    @Override
    public List<Student> getStudentList() {
        return list;
    }

    @Override
    public Student getStudentById(long stdId) {
        Student st = null;
        for(Student std : list) {
            if (std.getStdID() == stdId)
                st = std;
        }
        return  st;
    }
}
