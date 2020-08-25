package cn.edu.guet.controller;

import cn.edu.guet.model.ClassroomInfo;
import cn.edu.guet.model.ResponseTemplate;
import cn.edu.guet.service.IClassroomInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("ClassroomInfo")
public class ClassroomInfoController {

    @Autowired
    IClassroomInfoService classroomInfoService;
    @Autowired
    ResponseTemplate responseTemplate;
    @RequestMapping(value = "getClassroomInfoByid",method = RequestMethod.GET)
    @ResponseBody
    public ResponseTemplate getClassroomInfoByid(String classroomloc){
        ClassroomInfo classroomInfo=classroomInfoService.getClassroomInfoByid(classroomloc);
        responseTemplate.setCode(200);
        responseTemplate.setMessage("查询成功");
        responseTemplate.setData(classroomInfo);
        //System.out.println("course aaaaaaaaaaaaaaaaa= " + course);
        return responseTemplate;
    }
    @ResponseBody
    @RequestMapping(value = "getAllClassroomInfo",method = RequestMethod.GET)
    public ResponseTemplate getAllClassroomInfo(){
        List<ClassroomInfo> classroomInfoList = null;
            classroomInfoList = classroomInfoService.getAllClassroomInfo();
            responseTemplate.setData(classroomInfoList);
            responseTemplate.setCode(200);
            responseTemplate.setMessage("查询成功");
            return responseTemplate;
    }


    @RequestMapping(value = "updateClassroomInfo",method = RequestMethod.POST)
    @ResponseBody

    public ResponseTemplate updateClassroomInfo(@RequestBody ClassroomInfo classroomInfo){
        try {
            classroomInfoService.updateClassroomInfo(classroomInfo);
            responseTemplate.setCode(200);
            responseTemplate.setMessage("更新成功");
            responseTemplate.setData(null);
        } catch (Exception e) {
            e.printStackTrace();
            responseTemplate.setCode(401);
            responseTemplate.setMessage("更新失败");
            responseTemplate.setData(classroomInfo);
        }
        return responseTemplate;
    }
}