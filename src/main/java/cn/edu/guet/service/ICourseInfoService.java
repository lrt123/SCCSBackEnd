package cn.edu.guet.service;

import cn.edu.guet.model.CourseInfo;

import java.util.List;

public interface ICourseInfoService {
    void updateCourseInfo(CourseInfo courseInfo) throws Exception;
    CourseInfo getCourseInfoById(String lessoncode);
    List<CourseInfo> getAllCourseInfo();
}
