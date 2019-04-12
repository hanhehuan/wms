package com.example.hhh.service.impl;

import com.example.hhh.dao.StudentMapper;
import com.example.hhh.model.Student;
import com.example.hhh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author hanhehuan
 * @create 2019-04-12 16:18
 */
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> getAllstudents() {
        return studentMapper.selectAllStudent();
    }
}
