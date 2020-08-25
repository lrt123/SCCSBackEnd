package cn.edu.guet.mapper;

import cn.edu.guet.model.ClassroomInfo;


import java.util.List;

public interface ClassroomInfoMapper {
    ClassroomInfo getClassroomInfoByid(String classroomloc);
    List<ClassroomInfo> getAllClassroomInfo();
    void updateClassroomInfo(ClassroomInfo classroomInfo) throws Exception;

}
