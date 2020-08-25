package cn.edu.guet.mapper;

import cn.edu.guet.model.Course;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CourseMapper {
    Course getCourseByid(String lessonno);
    List<Course> getAllCourse();
    void updateCourse(Course course) throws Exception;

}
