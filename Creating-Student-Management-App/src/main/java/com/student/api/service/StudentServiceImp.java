package com.student.api.service;

import com.student.api.dao.StudentDao;
import com.student.api.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentDao studentDao;
//    List<Student> list;

//    public  StudentServiceImp()
//    {
//        list = new ArrayList<>();
//        list.add(new Student(1,"Shashwat Singh","Varanasi",1234567890,"XII","C"));
//        list.add(new Student(2,"Ramesh Yadav","Varanasi",1234567891,"XI","D"));
//    }

    @Override
    public List<Student> getStudentList() {
          return studentDao.findAll();
//        return list;
    }

    @Override
    public Student getStudentById(long stdId) {
//        Student st = null;
//        for(Student std : list) {
//            if (std.getStdID() == stdId)
//                st = std;
//        }
//        return  st;
        return  studentDao.getById(stdId);
                //getReferenceById(stdId);
    }

    @Override
    public Student addNewStudent(Student student) {
//        list.add(student);
//        return student;
        studentDao.save(student);
        return student;
    }

    @Override
    public Student updateData(Student student) {

//        for (Student std: list) {
//            if(std.getStdID() == student.getStdID())
//            {
//                std.setName(student.getName());
//                std.setCity(student.getCity());
//                std.setSection(student.getSection());
//                std.setPhoneNum(student.getPhoneNum());
//                std.setStandard(student.getStandard());
//            }
//        }
          studentDao.save(student);
          return student;
    }

    @Override
    public void deleteStudentById(long stdId) {

//        list = this.list.stream().filter(
//                e->e.getStdID()!=stdId
//        ).collect(Collectors.toList());

         studentDao.deleteById(stdId);
    }
}
