package cn.edu.guet.mapper;

import cn.edu.guet.model.ClassroomBuilding;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface ClassroomBuildingMapper {
    void saveClassroomBuilding(ClassroomBuilding classroomBuilding) throws Exception;
    void deleteClassroomBuilding(String id) throws Exception;
    ClassroomBuilding getClassroomBuildingByid(String id);
    List<ClassroomBuilding> getAllClassroomBuilding();
    void updateClassroomBuilding(ClassroomBuilding classroomBuilding) throws Exception;

}
