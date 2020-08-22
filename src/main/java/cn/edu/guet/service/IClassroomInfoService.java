package cn.edu.guet.service;

import cn.edu.guet.model.ClassroomInfo;


import java.util.List;

public interface IClassroomInfoService {

    ClassroomInfo getClassroomInfoByid(String classroomloc);
    List<ClassroomInfo> getAllClassroomInfo();
    void updateClassroomInfo(ClassroomInfo classroomInfo) throws Exception;

}
