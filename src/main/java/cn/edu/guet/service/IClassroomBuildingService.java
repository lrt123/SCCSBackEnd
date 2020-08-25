package cn.edu.guet.service;

import cn.edu.guet.model.ClassroomBuilding;


import java.util.List;

public interface IClassroomBuildingService {

    ClassroomBuilding getClassroomBuildingByid(String id);
    List<ClassroomBuilding> getAllClassroomBuilding();
    void updateClassroomBuilding(ClassroomBuilding classroomBuilding) throws Exception;

}
