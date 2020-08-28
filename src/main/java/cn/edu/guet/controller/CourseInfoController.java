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
    public ResponseTemplate getCourseInfoById(String lessoncode){
        if (lessoncode!=null){
            CourseInfo courseInfo=courseInfoService.getCourseInfoById(lessoncode);
            return ResponseTemplate.result(200,"查询成功",courseInfo);
        }
        return ResponseTemplate.result(200,"参数为空",null);

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


    @RequestMapping(value = "saveCourseInfo",method = RequestMethod.POST)
    public ResponseTemplate saveCourseInfo(@RequestBody CourseInfo courseInfo){
        try{
            if (courseInfo!=null){
                courseInfoService.saveCourseInfo(courseInfo);
                return ResponseTemplate.result(200,"添加成功",null);
            }
        }catch (Exception e) {
            e.printStackTrace();
            return ResponseTemplate.result(401,"添加失败",courseInfo);
        }
        return ResponseTemplate.result(401,"参数为空",null);
    }

    @RequestMapping(value = "deleteCourseInfo",method = RequestMethod.GET)
    public ResponseTemplate deleteCourseInfo(String lessoncode){
        try{
            if (lessoncode!=null && lessoncode!=""){
                courseInfoService.deleteCourseInfo(lessoncode);
                return ResponseTemplate.result(200,"删除成功",null);
            }
        }catch (Exception e) {
            e.printStackTrace();
            return ResponseTemplate.result(401,"添加失败",null);
        }
        return ResponseTemplate.result(401,"参数为空",null);
    }
}