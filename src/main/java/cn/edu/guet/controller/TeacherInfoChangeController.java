package cn.edu.guet.controller;

import cn.edu.guet.model.ResponseTemplate;
import cn.edu.guet.model.Student;
import cn.edu.guet.model.Teacher;
import cn.edu.guet.service.ITeacherInfoChangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("TeacherInfoChange")
public class TeacherInfoChangeController {

    @Autowired
    ITeacherInfoChangeService teacherInfoChangeService;

    @RequestMapping(value = "getAllTeachers",method = RequestMethod.GET)
    @ResponseBody
    public ResponseTemplate getAllTeacher() {
        List<Teacher> allTeachers= teacherInfoChangeService.getAllTeachers();
        return ResponseTemplate.result(200,"查询成功",allTeachers);
    }

    @RequestMapping(value = "getTeacherById",method = RequestMethod.GET)
    @ResponseBody
    public ResponseTemplate getTeacherById(String id){

        if(id !=null){
            Teacher teacher = teacherInfoChangeService.getTeacherBydId(id);
            return ResponseTemplate.result(200,"查询成功",teacher);
        }
        return ResponseTemplate.result(200,"查询成功",null);

    }

    @RequestMapping(value = "teacherJobChange",method = RequestMethod.POST)
    public ResponseTemplate teacherJobChange(@RequestBody Teacher teacher){
        try {
            teacherInfoChangeService.teacherJobChange(teacher);
            return ResponseTemplate.result(200,"更新成功",teacher);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseTemplate.result(401,"更新失败",teacher);
        }
    }

    @RequestMapping(value = "deleteTeacher",method = RequestMethod.DELETE)
    public ResponseTemplate deleteTeacher(String id){
        try {
            if(id !=null){
                teacherInfoChangeService.deleteTeacher(id);
                return ResponseTemplate.result(200,"删除成功",null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseTemplate.result(401,"删除失败",null);
        }
        return  ResponseTemplate.result(401,"参数为空",null);
    }

    @RequestMapping(value = "addTeacher",method = RequestMethod.POST)
    public ResponseTemplate addTeacher(@RequestBody Teacher teacher){

        try {
            if(teacher!=null){
                teacherInfoChangeService.addTeacher(teacher);
                return ResponseTemplate.result(200,"添加用户信息成功",null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseTemplate.result(401,"添加用户失败",teacher);
        }
        return  ResponseTemplate.result(401,"参数为空",null);
    }
}
