package com.student.studentex.repository;


import com.student.studentex.models.Interview;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao {
    List<Interview> readQuestionsFromSource() throws Exception;
}
