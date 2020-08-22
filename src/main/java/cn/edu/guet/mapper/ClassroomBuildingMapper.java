package cn.edu.guet.mapper;

import cn.edu.guet.model.ClassroomBuilding;


import java.util.List;

public interface ClassroomBuildingMapper {
    ClassroomBuilding getClassroomBuildingByid(String id);
    List<ClassroomBuilding> getAllClassroomBuilding();
    void updateClassroomBuilding(ClassroomBuilding classroomBuilding) throws Exception;

}
