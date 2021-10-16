package com.student.studentex.repository;


import org.springframework.stereotype.Repository;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao{
    public StudentDaoImpl(StudentDaoImpl studentDao) {
    }
}
