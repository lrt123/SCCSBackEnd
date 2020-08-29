package cn.edu.guet.service;

import cn.edu.guet.model.ClassroomBuilding;


import java.util.List;

public interface IClassroomBuildingService {

//    void addCourse(Course course) throws Exception;
//    void deleteCourse(Course course) throws Exception;
    void saveClassroomBuilding(ClassroomBuilding classroomBuilding) throws Exception;
    void deleteClassroomBuilding(String id) throws Exception;
    ClassroomBuilding getClassroomBuildingByid(String id);
    List<ClassroomBuilding> getAllClassroomBuilding();
    void updateClassroomBuilding(ClassroomBuilding classroomBuilding) throws Exception;

}
