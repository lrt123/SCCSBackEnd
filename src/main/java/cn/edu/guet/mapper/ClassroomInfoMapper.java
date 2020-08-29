package cn.edu.guet.mapper;

import cn.edu.guet.model.ClassroomInfo;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface ClassroomInfoMapper {

    void saveClassroomInfo(ClassroomInfo classroomInfo) throws Exception;
    void deleteClassroomInfo(String classroomloc) throws Exception;

    ClassroomInfo getClassroomInfoByid(String classroomloc);
    List<ClassroomInfo> getAllClassroomInfo();
    void updateClassroomInfo(ClassroomInfo classroomInfo) throws Exception;

}
