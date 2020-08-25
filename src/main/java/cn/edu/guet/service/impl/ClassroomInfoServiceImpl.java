package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.ClassroomBuildingMapper;
import cn.edu.guet.mapper.ClassroomInfoMapper;
import cn.edu.guet.model.ClassroomInfo;
import cn.edu.guet.service.IClassroomInfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassroomInfoServiceImpl implements IClassroomInfoService {
    @Autowired
    ClassroomInfoMapper classroomInfoMapper;
    @Autowired
    ClassroomBuildingMapper classroomBuildingMapper;

    @Override
    public ClassroomInfo getClassroomInfoByid(String classroomloc) {
        return classroomInfoMapper.getClassroomInfoByid(classroomloc);
    }

    @Override
    public List<ClassroomInfo> getAllClassroomInfo() {
        return classroomInfoMapper.getAllClassroomInfo();
    }

    @Override
    public void updateClassroomInfo(ClassroomInfo classroomInfo) throws Exception {
        classroomInfoMapper.updateClassroomInfo(classroomInfo);
        classroomBuildingMapper.updateClassroomBuilding(classroomInfo.getClassroomBuilding());
    }
}
