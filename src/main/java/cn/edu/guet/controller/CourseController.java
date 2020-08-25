package cn.edu.guet.controller;

import cn.edu.guet.model.Course;
import cn.edu.guet.model.ResponseTemplate;
import cn.edu.guet.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Course")
public class CourseController {

    @Autowired
    ICourseService courseService;
    @RequestMapping(value = "getCourseById",method = RequestMethod.GET)
    public ResponseTemplate getCourseById(String lessonno){
        Course course=courseService.getCourseByid(lessonno);
        return ResponseTemplate.result(200,"查询成功",course);
    }

    @RequestMapping(value = "getAllCourse",method = RequestMethod.GET)
    public ResponseTemplate getAllCourse(){
        List<Course> courseList = null;
            courseList = courseService.getAllCourse();
        return ResponseTemplate.result(200,"查询成功",courseList);
    }


    @RequestMapping(value = "updateCourse",method = RequestMethod.POST)
    public ResponseTemplate updateCourse(@RequestBody Course course){
        try {
            courseService.updateCourse(course);
            return ResponseTemplate.result(200,"更新成功",null);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseTemplate.result(200,"更新失败",course);
        }
    }
}