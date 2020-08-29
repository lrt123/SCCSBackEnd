package cn.edu.guet.service;

import cn.edu.guet.model.CourseInfo;

import java.util.List;

public interface ICourseInfoService {


    void saveCourseInfo(CourseInfo courseInfo) throws Exception;
    void deleteCourseInfo(String lessoncode) throws Exception;
    void updateCourseInfo(CourseInfo courseInfo) throws Exception;
    CourseInfo getCourseInfoById(String lessoncode);
    List<CourseInfo> getAllCourseInfo();
}
