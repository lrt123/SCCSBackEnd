package cn.edu.guet.service;

import cn.edu.guet.model.Course;

import java.util.List;

public interface ICourseService {
    Course getCourseByid(String lessonno);
    void updateCourse(Course course) throws Exception;
    List<Course> getAllCourse();

}
