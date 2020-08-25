package cn.edu.guet.controller;

import cn.edu.guet.model.Course;
import cn.edu.guet.model.CourseInfo;
import cn.edu.guet.model.ResponseTemplate;
import cn.edu.guet.service.ICourseInfoService;
import cn.edu.guet.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("CourseInfo")
public class CourseInfoController {

    @Autowired
    ICourseInfoService courseInfoService;

    @Autowired
    ResponseTemplate responseTemplate;
    @RequestMapping(value = "getCourseInfoById",method = RequestMethod.GET)
    @ResponseBody
    public ResponseTemplate getCourseInfoById(String lessonno){
        CourseInfo courseInfo=courseInfoService.getCourseInfoById(lessonno);
        responseTemplate.setCode(200);
        responseTemplate.setMessage("查询成功");
        responseTemplate.setData(courseInfo);
        //System.out.println("course aaaaaaaaaaaaaaaaa= " + course);
        return responseTemplate;
    }
    @ResponseBody
    @RequestMapping(value = "getAllCourseInfo",method = RequestMethod.GET)
    public ResponseTemplate getAllCourseInfo(){
        List<CourseInfo> courseInfoList = null;
            courseInfoList = courseInfoService.getAllCourseInfo();
            responseTemplate.setData(courseInfoList);
            responseTemplate.setCode(200);
            responseTemplate.setMessage("查询成功");
            return responseTemplate;
    }


    @RequestMapping(value = "updateCourseInfo",method = RequestMethod.POST)
    @ResponseBody

    public ResponseTemplate updateCourseInfo(@RequestBody CourseInfo courseInfo){
        try {
            courseInfoService.updateCourseInfo(courseInfo);
            responseTemplate.setCode(200);
            responseTemplate.setMessage("更新成功");
            responseTemplate.setData(null);
        } catch (Exception e) {
            e.printStackTrace();
            responseTemplate.setCode(401);
            responseTemplate.setMessage("更新失败");
            responseTemplate.setData(courseInfo);
        }
        return responseTemplate;
    }
}