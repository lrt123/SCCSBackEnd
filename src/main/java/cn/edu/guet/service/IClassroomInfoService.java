package cn.edu.guet.service;

import cn.edu.guet.model.ClassroomInfo;


import java.util.List;

public interface IClassroomInfoService {

    void saveClassroomInfo(ClassroomInfo classroomInfo) throws Exception;
    void deleteClassroomInfo(String classroomloc) throws Exception;
    ClassroomInfo getClassroomInfoByid(String classroomloc);
    List<ClassroomInfo> getAllClassroomInfo();
    void updateClassroomInfo(ClassroomInfo classroomInfo) throws Exception;

}
