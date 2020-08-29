package cn.edu.guet.controller;

import cn.edu.guet.model.Course;
import cn.edu.guet.model.ResponseTemplate;
import cn.edu.guet.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Course")
public class CourseController {

    @Autowired
    ICourseService courseService;
    @RequestMapping(value = "getCourseById",method = RequestMethod.GET)
    public ResponseTemplate getCourseById(String lessonno){
        if (lessonno!=null && lessonno!=""){
            Course course=courseService.getCourseByid(lessonno);
            return ResponseTemplate.result(200,"查询成功",course);
        }
        return  ResponseTemplate.result(200,"参数为空",null);
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
            if (course!=null){
                courseService.updateCourse(course);
                return ResponseTemplate.result(200,"更新成功",null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseTemplate.result(401,"更新失败",course);
        }
        return ResponseTemplate.result(401,"参数为空",null);
    }


    @RequestMapping(value = "saveCourse",method = RequestMethod.POST)
    public ResponseTemplate saveCourse(@RequestBody Course course){
        try{
            if (course!=null){
                courseService.saveCourse(course);
                return ResponseTemplate.result(200,"添加课程成功",null);
            }
        }catch (Exception e) {
            e.printStackTrace();
            return ResponseTemplate.result(401,"添加失败",course);
        }
        return ResponseTemplate.result(401,"参数为空",null);
    }

    @RequestMapping(value = "deleteCourse",method = RequestMethod.GET)
    public ResponseTemplate deleteCourse(String lessonno){
        try{
            if (lessonno!=null){
                courseService.deleteCourse(lessonno);
                return ResponseTemplate.result(200,"删除成功",null);
            }
        }catch (Exception e) {
            e.printStackTrace();
            return ResponseTemplate.result(401,"添加失败",null);
        }
        return ResponseTemplate.result(401,"参数为空",null);
    }


}