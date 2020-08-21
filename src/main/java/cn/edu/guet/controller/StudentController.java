package cn.edu.guet.controller;


import cn.edu.guet.model.ResponseTemplate;
import cn.edu.guet.model.Student;
import cn.edu.guet.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("student")
public class StudentController {

    @Autowired
    IStudentService studentService;
    @Autowired
    ResponseTemplate responseTemplate;
    @RequestMapping(value = "getStudent",method = RequestMethod.GET)
    @ResponseBody
     public ResponseTemplate getStudentById(String id){
        Student student = studentService.getStudentById(id);
        responseTemplate.setCode(200);
        responseTemplate.setMessage("查询成功");
        responseTemplate.setData(student);
        return responseTemplate;
    }

    @RequestMapping(value = "getAllStudent",method = RequestMethod.GET)
    @ResponseBody
    public ResponseTemplate getAllStudent(){
        List<Student> allStudent = studentService.getAllStudent();
        responseTemplate.setData(allStudent);
        responseTemplate.setCode(200);
        responseTemplate.setMessage("查询成功");
        return responseTemplate;
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public ResponseTemplate deleteStudent(String id){
        try {
            studentService.deleteStudentById(id);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
    @RequestMapping(value = "updateStudent",method = RequestMethod.POST)
    @ResponseBody

    public ResponseTemplate updateStudent(@RequestBody Student student){
        try {
            System.out.println("student.getId() = " + student.getId());
            studentService.updateStudent(student);
            responseTemplate.setCode(200);
            responseTemplate.setMessage("更新成功");
            responseTemplate.setData(student);
        } catch (Exception e) {
            e.printStackTrace();
            responseTemplate.setCode(401);
            responseTemplate.setMessage("更新失败");
            responseTemplate.setData(student);
        }
        return responseTemplate;
    }

}
