package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.StudentMapper;
import cn.edu.guet.mapper.UserInfoMapper;
import cn.edu.guet.model.Student;
import cn.edu.guet.model.UserInfo;
import cn.edu.guet.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements IStudentService {

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    UserInfoMapper userInfoMapper;
    @Override
    public void saveStudent(Student student) throws Exception {
        studentMapper.saveStudent(student);
    }

    @Override
    public void updateStudent(Student student) throws Exception {
        studentMapper.updateStudent(student);
        userInfoMapper.updateUserInfo(student.getUserInfo());
    }

    @Override
    public void deleteStudentById(String id) throws Exception {
        studentMapper.deleteStudentById(id);
    }

    @Override
    public Student getStudentById(String id) {
        return studentMapper.getStudentById(id);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentMapper.getAllStudent();
    }
}
