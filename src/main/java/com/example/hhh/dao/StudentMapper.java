package com.example.hhh.dao;

import com.example.hhh.model.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author hanhehuan
 * @create 2019-04-12 16:20
 */
@Mapper
public interface StudentMapper {
    List<Student> selectAllStudent();

}
