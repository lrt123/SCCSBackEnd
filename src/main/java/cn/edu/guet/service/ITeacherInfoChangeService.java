package cn.edu.guet.service;

import cn.edu.guet.model.Teacher;

import java.util.List;

public interface ITeacherInfoChangeService {
    List<Teacher> getAllTeachers();
    Teacher getTeacherBydId(String id);
    void teacherJobChange(Teacher teacher) throws Exception;
    void addTeacher(Teacher teacher) throws Exception;
    void deleteTeacher(String id) throws Exception;
}
