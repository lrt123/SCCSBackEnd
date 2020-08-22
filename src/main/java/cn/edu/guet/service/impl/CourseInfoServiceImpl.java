package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.CourseInfoMapper;
import cn.edu.guet.model.CourseInfo;
import cn.edu.guet.service.ICourseInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CourseInfoServiceImpl implements ICourseInfoService {
    @Autowired
    CourseInfoMapper courseInfoMapper;

    @Override
    public void updateCourseInfo(CourseInfo courseInfo) throws Exception {
        courseInfoMapper.updateCourseInfo(courseInfo);

    }

    @Override
    public CourseInfo getCourseInfoById(String lessoncode) {
        return courseInfoMapper.getCourseInfoById(lessoncode);
    }

    @Override
    public List<CourseInfo> getAllCourseInfo() {
        return courseInfoMapper.getAllCourseInfo();
    }
}
