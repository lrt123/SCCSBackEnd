package cn.edu.guet.controller;

import cn.edu.guet.model.ResponseTemplate;
import cn.edu.guet.model.Student;
import cn.edu.guet.model.Teacher;
import cn.edu.guet.service.ITeacherInfoChangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("TeacherInfoChange")
public class TeacherInfoChangeController {

    @Autowired
    ITeacherInfoChangeService teacherInfoChangeService;

    @Autowired
    ResponseTemplate responseTemplate;

    @RequestMapping(value = "getAllTeachers",method = RequestMethod.GET)
    @ResponseBody
    public ResponseTemplate getAllTeacher() {
        List<Teacher> allTeachers= teacherInfoChangeService.getAllTeachers();
        responseTemplate.setCode(200);
        responseTemplate.setMessage("查询成功");
        responseTemplate.setData(allTeachers);
        return responseTemplate;
    }

    @RequestMapping(value = "getTeacherById",method = RequestMethod.GET)
    @ResponseBody
    public ResponseTemplate getTeacherById(String id){

        Teacher teacher = teacherInfoChangeService.getTeacherBydId(id);
        responseTemplate.setCode(200);
        responseTemplate.setMessage("查询成功");
        responseTemplate.setData(teacher);
        return responseTemplate;

    }

    @RequestMapping(value = "teacherJobChange",method = RequestMethod.POST)
    @ResponseBody
    public ResponseTemplate teacherJobChange(@RequestBody Teacher teacher){

        try {
            System.out.println("teacher.getId() = " + teacher.getId());
            teacherInfoChangeService.teacherJobChange(teacher);
            responseTemplate.setCode(200);
            responseTemplate.setMessage("更新成功");
            responseTemplate.setData(teacher);
        } catch (Exception e) {
            e.printStackTrace();
            responseTemplate.setCode(401);
            responseTemplate.setMessage("更新失败");
            responseTemplate.setData(teacher);
        }
        return responseTemplate;

    }

    @RequestMapping(value = "deleteTeacher",method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseTemplate deleteTeacher(String id){
        try {
            teacherInfoChangeService.deleteTeacher(id);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }

    @RequestMapping(value = "addTeacher",method = RequestMethod.POST)
    @ResponseBody
    public ResponseTemplate addTeacher(@RequestBody Teacher teacher){

        try {
            teacherInfoChangeService.addTeacher(teacher);
            responseTemplate.setCode(200);
            responseTemplate.setMessage("添加用户信息成功");
            responseTemplate.setData(null);
        } catch (Exception e) {
            e.printStackTrace();
            responseTemplate.setCode(401);
            responseTemplate.setMessage("添加用户失败");
            responseTemplate.setData(teacher);
        }
        return responseTemplate;

    }
}
