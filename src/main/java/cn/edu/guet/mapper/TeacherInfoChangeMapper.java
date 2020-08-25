package cn.edu.guet.mapper;

import cn.edu.guet.model.Teacher;
import cn.edu.guet.model.Users;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TeacherInfoChangeMapper {
    List<Teacher> getAllTeachers();
    Teacher getTeacherById(String id);
    void teacherjobChange(Teacher teacher);
    void deleteTeacher(String id);


    void addTeacher(Teacher teacher);

}
