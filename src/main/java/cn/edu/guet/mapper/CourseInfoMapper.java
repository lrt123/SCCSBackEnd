package cn.edu.guet.mapper;

import cn.edu.guet.model.CourseInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CourseInfoMapper {
     void updateCourseInfo(CourseInfo courseInfo) throws Exception;
     CourseInfo getCourseInfoById(String lessoncode);
    List<CourseInfo> getAllCourseInfo();
}
