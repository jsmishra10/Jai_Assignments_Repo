package com.greatlearning.service;

import com.greatlearning.dao.StudentRepository;
import com.greatlearning.entity.Student;

import java.util.List;

public interface StudentService {

    public List<Student> findAll();

    public Student findById(Long studentId);

    public void addRecord(Student student);

    public void deleteStudentRecord(Long studentId);


}
