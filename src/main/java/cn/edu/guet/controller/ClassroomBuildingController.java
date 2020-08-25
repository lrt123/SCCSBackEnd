package cn.edu.guet.controller;

import cn.edu.guet.model.ClassroomBuilding;
import cn.edu.guet.model.ResponseTemplate;
import cn.edu.guet.service.IClassroomBuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("ClassroomBuilding")
public class ClassroomBuildingController {

    @Autowired
    IClassroomBuildingService classroomBuildingService;

    @Autowired
    ResponseTemplate responseTemplate;
    @RequestMapping(value = "getClassroomBuildingByid",method = RequestMethod.GET)
    @ResponseBody
    public ResponseTemplate getClassroomBuildingByid(String id){
        ClassroomBuilding classroomBuilding=classroomBuildingService.getClassroomBuildingByid(id);
        responseTemplate.setCode(200);
        responseTemplate.setMessage("查询成功");
        responseTemplate.setData(classroomBuilding);
        return responseTemplate;
    }
    @ResponseBody
    @RequestMapping(value = "getAllClassroomBuilding",method = RequestMethod.GET)
    public ResponseTemplate getAllClassroomBuilding(){
        List<ClassroomBuilding> classroomBuildingList = null;
            classroomBuildingList = classroomBuildingService.getAllClassroomBuilding();
            responseTemplate.setData(classroomBuildingList);
            responseTemplate.setCode(200);
            responseTemplate.setMessage("查询成功");
            return responseTemplate;
    }


    @RequestMapping(value = "updateClassroomBuilding",method = RequestMethod.POST)
    @ResponseBody

    public ResponseTemplate updateClassroomBuilding(@RequestBody ClassroomBuilding classroomBuilding){
        try {
            classroomBuildingService.updateClassroomBuilding(classroomBuilding);
            responseTemplate.setCode(200);
            responseTemplate.setMessage("更新成功");
            responseTemplate.setData(null);
        } catch (Exception e) {
            e.printStackTrace();
            responseTemplate.setCode(401);
            responseTemplate.setMessage("更新失败");
            responseTemplate.setData(classroomBuilding);
        }
        return responseTemplate;
    }
}