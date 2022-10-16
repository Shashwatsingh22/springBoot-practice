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

    //@Override
//    public Student getStudentById(long stdId) {
//        return  //studentDao.getById(stdId);
//                //getReferenceById(stdId);
//    }

//    @Override
//    public Student addNewStudent(Student student) {
////        list.add(student);
////        return student;
//        studentDao.save(student);
//        return student;
//    }

//    @Override
//    public Student updateData(Student student) {
//
////        for (Student std: list) {
////            if(std.getStdID() == student.getStdID())
////            {
////                std.setName(student.getName());
////                std.setCity(student.getCity());
////                std.setSection(student.getSection());
////                std.setPhoneNum(student.getPhoneNum());
////                std.setStandard(student.getStandard());
////            }
////        }
//          studentDao.save(student);
//          return student;
//    }
//
//    @Override
//    public void deleteStudentById(long stdId) {
//
////        list = this.list.stream().filter(
////                e->e.getStdID()!=stdId
////        ).collect(Collectors.toList());
//
//         studentDao.deleteById(stdId);
//    }
}
