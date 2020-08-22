package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.CourseInfoMapper;
import cn.edu.guet.mapper.CourseMapper;
import cn.edu.guet.mapper.TeacherInfoChangeMapper;
import cn.edu.guet.model.Course;
import cn.edu.guet.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CourseServiceImpl implements ICourseService {
    @Autowired
    CourseMapper courseMapper;
    @Autowired
    CourseInfoMapper courseInfoMapper;
    @Autowired
    TeacherInfoChangeMapper teacherInfoChangeMapper;
    @Override
    public Course getCourseByid(String lessonno)  {
        return courseMapper.getCourseByid(lessonno);
    }

    @Override
    public List<Course> getAllCourse() {
        return courseMapper.getAllCourse();
    }

    @Override
    public void updateCourse(Course course) throws Exception {
        courseMapper.updateCourse(course);
        courseInfoMapper.updateCourseInfo(course.getCourseInfo());
        teacherInfoChangeMapper.teacherjobChange(course.getTeacher());

    }

}
