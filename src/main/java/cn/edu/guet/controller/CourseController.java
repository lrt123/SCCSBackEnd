package cn.edu.guet.controller;

import cn.edu.guet.model.Course;
import cn.edu.guet.model.ResponseTemplate;
import cn.edu.guet.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("Course")
public class CourseController {

    @Autowired
    ICourseService courseService;

    @Autowired
    ResponseTemplate responseTemplate;
    @RequestMapping(value = "getCourseById",method = RequestMethod.GET)
    @ResponseBody
    public ResponseTemplate getCourseById(String lessonno){
        Course course=courseService.getCourseByid(lessonno);
        responseTemplate.setCode(200);
        responseTemplate.setMessage("查询成功");
        responseTemplate.setData(course);
        //System.out.println("course aaaaaaaaaaaaaaaaa= " + course);
        return responseTemplate;
    }
    @ResponseBody
    @RequestMapping(value = "getAllCourse",method = RequestMethod.GET)
    public ResponseTemplate getAllCourse(){
        List<Course> courseList = null;
            courseList = courseService.getAllCourse();
            responseTemplate.setData(courseList);
            responseTemplate.setCode(200);
            responseTemplate.setMessage("查询成功");
            return responseTemplate;
    }


    @RequestMapping(value = "updateCourse",method = RequestMethod.POST)
    @ResponseBody

    public ResponseTemplate updateCourse(@RequestBody Course course){
        try {
            courseService.updateCourse(course);
            responseTemplate.setCode(200);
            responseTemplate.setMessage("更新成功");
            responseTemplate.setData(null);
        } catch (Exception e) {
            e.printStackTrace();
            responseTemplate.setCode(401);
            responseTemplate.setMessage("更新失败");
            responseTemplate.setData(course);
        }
        return responseTemplate;
    }
}