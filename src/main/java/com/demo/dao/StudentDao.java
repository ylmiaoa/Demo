package com.demo.dao;

import java.util.List;

import com.demo.model.StudentEntity;

public interface StudentDao {

    public StudentEntity getStudent(String studentID);

    public List<StudentEntity> getStudentAll();

    public String test();

}
