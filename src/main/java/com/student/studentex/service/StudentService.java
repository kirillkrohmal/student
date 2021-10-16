package com.student.studentex.service;


import com.student.studentex.models.Interview;
import com.student.studentex.models.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    void conductInterview(Student student);

    List<Interview> getQuestions() throws Exception;
}
