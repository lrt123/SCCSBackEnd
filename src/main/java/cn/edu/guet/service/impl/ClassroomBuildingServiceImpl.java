package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.ClassroomBuildingMapper;
import cn.edu.guet.model.ClassroomBuilding;
import cn.edu.guet.service.IClassroomBuildingService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClassroomBuildingServiceImpl implements IClassroomBuildingService {
    @Autowired
    ClassroomBuildingMapper classroomBuildingMapper;


    @Override
    public ClassroomBuilding getClassroomBuildingByid(String id) {
        return classroomBuildingMapper.getClassroomBuildingByid(id);
    }

    @Override
    public List<ClassroomBuilding> getAllClassroomBuilding() {
        return classroomBuildingMapper.getAllClassroomBuilding();
    }

    @Override
    public void updateClassroomBuilding(ClassroomBuilding classroomBuilding) throws Exception {
        classroomBuildingMapper.updateClassroomBuilding(classroomBuilding);
    }
}
