package cn.edu.guet.mapper;

import cn.edu.guet.model.Student;

import java.util.List;

public interface StudentMapper {
    void saveStudent(Student student) throws Exception;
    void updateStudent(Student student)throws Exception;
    void deleteStudentById(String id) throws Exception;
    Student getStudentById(String id);
    List<Student> getAllStudent();
}
