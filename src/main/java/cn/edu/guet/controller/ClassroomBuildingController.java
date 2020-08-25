package cn.edu.guet.controller;

import cn.edu.guet.model.ClassroomBuilding;
import cn.edu.guet.model.ResponseTemplate;
import cn.edu.guet.service.IClassroomBuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ClassroomBuilding")
public class ClassroomBuildingController {

    @Autowired
    IClassroomBuildingService classroomBuildingService;

    @RequestMapping(value = "getClassroomBuildingByid",method = RequestMethod.GET)
    public ResponseTemplate getClassroomBuildingByid(String id){
        ClassroomBuilding classroomBuilding=classroomBuildingService.getClassroomBuildingByid(id);
        return ResponseTemplate.result(200,"查询成功",classroomBuilding);
    }

    @RequestMapping(value = "getAllClassroomBuilding",method = RequestMethod.GET)
    public ResponseTemplate getAllClassroomBuilding(){
        List<ClassroomBuilding> classroomBuildingList = null;
            classroomBuildingList = classroomBuildingService.getAllClassroomBuilding();
        return ResponseTemplate.result(200,"查询成功",classroomBuildingList);
    }


    @RequestMapping(value = "updateClassroomBuilding",method = RequestMethod.POST)
    public ResponseTemplate updateClassroomBuilding(@RequestBody ClassroomBuilding classroomBuilding){
        try {
            classroomBuildingService.updateClassroomBuilding(classroomBuilding);
            return ResponseTemplate.result(200,"更新成功",null);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseTemplate.result(401,"更新失败",classroomBuilding);
        }
    }
}