package com.student.studentex.service;


import com.student.studentex.models.StudentModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface StudentService extends CrudRepository<StudentModel, Long> {

}
