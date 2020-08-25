package cn.edu.guet.controller;

import cn.edu.guet.model.ClassroomInfo;
import cn.edu.guet.model.ResponseTemplate;
import cn.edu.guet.service.IClassroomInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import cn.edu.guet.model.ResponseTemplate;

import java.util.List;

@RestController
@RequestMapping("ClassroomInfo")
public class ClassroomInfoController {

    @Autowired
    IClassroomInfoService classroomInfoService;
    @RequestMapping(value = "getClassroomInfoByid",method = RequestMethod.GET)
    public ResponseTemplate getClassroomInfoByid(String classroomloc){
        ClassroomInfo classroomInfo=classroomInfoService.getClassroomInfoByid(classroomloc);
        return ResponseTemplate.result(200,"查询成功",classroomInfo);
    }
    @RequestMapping(value = "getAllClassroomInfo",method = RequestMethod.GET)
    public ResponseTemplate getAllClassroomInfo(){
        List<ClassroomInfo> classroomInfoList = null;
            classroomInfoList = classroomInfoService.getAllClassroomInfo();
        return ResponseTemplate.result(200,"查询成功",classroomInfoList);
    }


    @RequestMapping(value = "updateClassroomInfo",method = RequestMethod.POST)
    public ResponseTemplate updateClassroomInfo(@RequestBody ClassroomInfo classroomInfo){
        try {
            classroomInfoService.updateClassroomInfo(classroomInfo);
            return ResponseTemplate.result(200,"更新成功",null);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseTemplate.result(401,"更新失败",classroomInfo);
        }
    }
}