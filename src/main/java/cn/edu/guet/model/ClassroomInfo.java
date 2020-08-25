package cn.edu.guet.model;


public class ClassroomInfo {

  private ClassroomBuilding classroomBuilding;
  private String classroomloc;
  private String classroomname;

  @Override
  public String toString() {
    return "ClassroomInfo{" +
            "classroomBuilding=" + classroomBuilding +
            ", classroomloc='" + classroomloc + '\'' +
            ", classroomname='" + classroomname + '\'' +
            '}';
  }

  public ClassroomBuilding getClassroomBuilding() {
    return classroomBuilding;
  }

  public void setClassroomBuilding(ClassroomBuilding classroomBuilding) {
    this.classroomBuilding = classroomBuilding;
  }

  public String getClassroomloc() {
    return classroomloc;
  }

  public void setClassroomloc(String classroomloc) {
    this.classroomloc = classroomloc;
  }


  public String getClassroomname() {
    return classroomname;
  }

  public void setClassroomname(String classroomname) {
    this.classroomname = classroomname;
  }

}
