package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.ClassroomBuildingMapper;
import cn.edu.guet.model.ClassroomBuilding;
import cn.edu.guet.service.IClassroomBuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassroomBuildingServiceImpl implements IClassroomBuildingService {
    @Autowired
    ClassroomBuildingMapper classroomBuildingMapper;

    @Override
    public void saveClassroomBuilding(ClassroomBuilding classroomBuilding) throws Exception {
        classroomBuildingMapper.saveClassroomBuilding(classroomBuilding);
    }

    @Override
    public void deleteClassroomBuilding(String id) throws Exception {
        classroomBuildingMapper.deleteClassroomBuilding(id);
    }

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
