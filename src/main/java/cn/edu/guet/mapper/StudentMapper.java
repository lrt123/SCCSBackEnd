package cn.edu.guet.mapper;

import cn.edu.guet.model.Student;

import java.util.List;

public interface StudentMapper {
    void saveStudent(Student student);
    void updateStudent(Student student);
    void deleteStudentById(String id);
    Student getStudentById(String id);
    List<Student> getAllStudent();
}
