package com.student.studentex.service;


import com.student.studentex.models.Interview;
import com.student.studentex.models.Student;
import com.student.studentex.repository.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Override
    public void conductInterview(Student student) {

    }

    @Override
    public List<Interview> getQuestions() throws Exception {
        return null;
    }
}
