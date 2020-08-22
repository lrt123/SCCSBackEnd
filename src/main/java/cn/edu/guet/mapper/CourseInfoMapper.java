package cn.edu.guet.mapper;

import cn.edu.guet.model.CourseInfo;

import java.util.List;

public interface CourseInfoMapper {
     void updateCourseInfo(CourseInfo courseInfo) throws Exception;
     CourseInfo getCourseInfoById(String lessoncode);
    List<CourseInfo> getAllCourseInfo();
}
