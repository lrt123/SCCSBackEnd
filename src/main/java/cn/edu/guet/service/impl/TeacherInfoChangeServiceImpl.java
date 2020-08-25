package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.TeacherInfoChangeMapper;
import cn.edu.guet.model.Teacher;
import cn.edu.guet.service.ITeacherInfoChangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.TreeMap;
@Service
public class TeacherInfoChangeServiceImpl implements ITeacherInfoChangeService {

    @Autowired
    TeacherInfoChangeMapper teacherInfoChangeMapper;

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherInfoChangeMapper.getAllTeachers();
    }

    @Override
    public Teacher getTeacherBydId(String id) {
        return teacherInfoChangeMapper.getTeacherById(id);
    }

    @Override
    public void teacherJobChange(Teacher teacher) {
        teacherInfoChangeMapper.teacherjobChange(teacher);
    }

    @Override
    public void addTeacher(Teacher teacher) {
        teacherInfoChangeMapper.addTeacher(teacher);
    }

    @Override
    public void deleteTeacher(String id) {
        teacherInfoChangeMapper.deleteTeacher(id);
    }
}
