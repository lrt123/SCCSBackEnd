package cn.edu.guet.mapper;

import cn.edu.guet.model.Teacher;
import cn.edu.guet.model.Users;

import java.util.List;

public interface TeacherInfoChangeMapper {
    List<Teacher> getAllTeachers();
    Teacher getTeacherById(String id);
    void teacherjobChange(Teacher teacher);
    void deleteTeacher(String id);


    void addTeacher(Teacher teacher);

}
