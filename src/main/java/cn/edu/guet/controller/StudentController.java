package cn.edu.guet.controller;


import cn.edu.guet.model.ResponseTemplate;
import cn.edu.guet.model.Student;
import cn.edu.guet.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    IStudentService studentService;
    @RequestMapping(value = "getStudent",method = RequestMethod.GET)

     public ResponseTemplate getStudentById(String id){
        if(id!=null){
            Student student = studentService.getStudentById(id);
            return  ResponseTemplate.result(200,"查询成功",student);
        }
        return  ResponseTemplate.result(200,"ID格式错误",null);
    }

    @RequestMapping(value = "getAllStudent",method = RequestMethod.GET)
    public ResponseTemplate getAllStudent(){
        List<Student> allStudent = studentService.getAllStudent();
        return  ResponseTemplate.result(200,"查询成功",allStudent);
    }

    @RequestMapping(method = RequestMethod.GET)

    public ResponseTemplate deleteStudent(String id){
        try {
            if(id == null){
                studentService.deleteStudentById(id);
                return ResponseTemplate.result(200,"删除成功",null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseTemplate.result(401,"删除失败",null);
        }
        return ResponseTemplate.result(401,"ID为空",null);
    }
    @RequestMapping(value = "updateStudent",method = RequestMethod.POST)
    public ResponseTemplate updateStudent(@RequestBody Student student){
        try {
            if(student!=null){
                studentService.updateStudent(student);
                return ResponseTemplate.result(200,"更新成功",null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseTemplate.result(401,"更新失败",null);
        }
        return ResponseTemplate.result(401,"参数为空",null);
    }

}
