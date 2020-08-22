package cn.edu.guet.mapper;

import cn.edu.guet.model.Course;

import java.util.List;

public interface CourseMapper {
    Course getCourseByid(String lessonno);
    List<Course> getAllCourse();
    void updateCourse(Course course) throws Exception;

}
