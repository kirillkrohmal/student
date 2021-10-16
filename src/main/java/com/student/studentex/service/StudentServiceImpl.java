package com.student.studentex.service;


import com.student.studentex.models.StudentModel;
import com.student.studentex.repository.StudentDao;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    StudentDao dao;


    @Override
    public <S extends StudentModel> S save(S entity) {
        return null;
    }

    @Override
    public <S extends StudentModel> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<StudentModel> findById(Long aLong) {
        return Optional.empty ();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<StudentModel> findAll() {
        return null;
    }

    @Override
    public Iterable<StudentModel> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(StudentModel entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends StudentModel> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
