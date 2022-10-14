package com.student.api.dao;

import com.student.api.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository <Student,Long> {

}
