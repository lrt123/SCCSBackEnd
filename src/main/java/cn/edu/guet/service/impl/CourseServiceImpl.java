package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.*;
import cn.edu.guet.model.ClassroomBuilding;
import cn.edu.guet.model.Course;
import cn.edu.guet.model.UserInfo;
import cn.edu.guet.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImpl implements ICourseService {
    @Autowired
    CourseMapper courseMapper;
    @Autowired
    CourseInfoMapper courseInfoMapper;
    @Autowired
    TeacherInfoChangeMapper teacherInfoChangeMapper;
    @Autowired
    UserInfoMapper userInfoMapper;
    @Autowired
    ClassroomBuildingMapper classroomBuildingMapper;

    @Override
    public void saveCourse(Course course) throws Exception {
        courseMapper.saveCourse(course);

    }

    @Override
    public void deleteCourse(String lessonno) throws Exception {
        courseMapper.deleteCourse(lessonno);
    }

    @Override
    public Course getCourseByid(String lessonno)  {
        Course c=courseMapper.getCourseByid(lessonno);
        UserInfo userInfo=userInfoMapper.getUserInfoById(c.getTeacher().getId());
        c.getTeacher().setUserInfo(userInfo);

        return c;
    }

    @Override
    public List<Course> getAllCourse() {
        List<Course> allCourse = courseMapper.getAllCourse();
        System.out.println("allCourse = " + allCourse);
        if(allCourse!=null){
            for (Course c:allCourse) {
                UserInfo userInfo = userInfoMapper.getUserInfoById(c.getTeacher().getId());
//                ClassroomBuilding cb= classroomBuildingMapper.getClassroomBuildingByid(c.getClassroomInfo());
                if(userInfo!=null)
                System.out.println("userInfo.getUsername() = " + userInfo.getUsername());
                c.getTeacher().setUserInfo(userInfo);
                //c.getClassroomInfo().setClassroomBuilding(cb);
            }
        }
        return allCourse;
    }

    @Override
    public void updateCourse(Course course) throws Exception {
        courseMapper.updateCourse(course);
        courseInfoMapper.updateCourseInfo(course.getCourseInfo());
        teacherInfoChangeMapper.teacherjobChange(course.getTeacher());
        userInfoMapper.updateUserInfo(course.getTeacher().getUserInfo());
    }
}
