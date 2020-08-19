package cn.edu.guet.mapper;

import cn.edu.guet.model.Student;

import java.util.List;

public interface StudentMapper {
    Student saveStudent();
    int updateStudent();
    int deleteStudent();
    Student getStudentById(String id);
    List<Student> getAllStudent();
}
