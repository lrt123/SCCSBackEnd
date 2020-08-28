package cn.edu.guet.service;

import cn.edu.guet.model.Course;

import java.util.List;

public interface ICourseService {

    void saveCourse(Course course) throws Exception;
    void deleteCourse(String lessonno) throws Exception;
    Course getCourseByid(String lessonno);
    void updateCourse(Course course) throws Exception;
    List<Course> getAllCourse();


}
