package com.student.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//Importing Modules
import  java.util.List;

//Importing Entities (Class)
import com.student.api.entities.Student;

//Importing Services
//Interfaces
import com.student.api.service.StudentService;


@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService objStudentService;

    //Send res as lists of Students
    //So, return type List as Students (data-type)
    @GetMapping("/getList")
    public List<Student> getAllStudentList(){
        //But we Controller Can't able to take the Data from database/repo
        //So we need to create ther Service/Dao (Which can help us to take data from the repo or db)
        return this.objStudentService.getStudentList();
    }


    @GetMapping("/getByID/{stdId}")
    public Student getStduentById(@PathVariable String stdId)
    {
        return this.objStudentService.getStudentById(Long.parseLong(stdId));
    }

    @PostMapping("/add")
    public Student addNewStudent(@RequestBody Student student)
    {
       return this.objStudentService.addNewStudent(student);
    }

    @PutMapping("/update")
    public Student updateData(@RequestBody Student student)
    {
        try {
            return this.objStudentService.updateData(student);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return this.objStudentService.updateData(student);
    }

    @DeleteMapping("/{stdId}")
    public ResponseEntity<HttpStatus> deleteStudentData(@PathVariable String stdId)
    {
        try
        {
            this.objStudentService.deleteStudentById(Long.parseLong(stdId));
            return  new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception err)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
