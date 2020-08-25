package cn.edu.guet.controller;

import cn.edu.guet.model.Course;
import cn.edu.guet.model.CourseInfo;
import cn.edu.guet.model.ResponseTemplate;
import cn.edu.guet.service.ICourseInfoService;
import cn.edu.guet.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("CourseInfo")
public class CourseInfoController {

    @Autowired
    ICourseInfoService courseInfoService;
    @RequestMapping(value = "getCourseInfoById",method = RequestMethod.GET)
    public ResponseTemplate getCourseInfoById(String lessonno){
        CourseInfo courseInfo=courseInfoService.getCourseInfoById(lessonno);
        return ResponseTemplate.result(200,"查询成功",courseInfo);
    }
    @RequestMapping(value = "getAllCourseInfo",method = RequestMethod.GET)
    public ResponseTemplate getAllCourseInfo(){
        List<CourseInfo> courseInfoList = null;
            courseInfoList = courseInfoService.getAllCourseInfo();
        return ResponseTemplate.result(200,"查询成功",courseInfoList);
    }


    @RequestMapping(value = "updateCourseInfo",method = RequestMethod.POST)

    public ResponseTemplate updateCourseInfo(@RequestBody CourseInfo courseInfo){
        try {
            courseInfoService.updateCourseInfo(courseInfo);
            return ResponseTemplate.result(200,"更新成功",null);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseTemplate.result(401,"更新失败",courseInfo);
        }
    }
}