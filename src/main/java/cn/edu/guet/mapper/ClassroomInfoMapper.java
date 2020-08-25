package cn.edu.guet.mapper;

import cn.edu.guet.model.ClassroomInfo;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface ClassroomInfoMapper {
    ClassroomInfo getClassroomInfoByid(String classroomloc);
    List<ClassroomInfo> getAllClassroomInfo();
    void updateClassroomInfo(ClassroomInfo classroomInfo) throws Exception;

}
