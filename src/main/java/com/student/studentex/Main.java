package com.student.studentex;

import com.student.studentex.models.Student;
import com.student.studentex.service.StudentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Main.class);
        StudentService service = ctx.getBean(StudentService.class);
        service.conductInterview(new Student ());
    }
}
