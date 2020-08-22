package cn.edu.guet.model;


public class CourseInfo {

  private String lessoncode;
  private String lessonname;
  private String major;

  @Override
  public String toString() {
    return "CourseInfo{" +
            "lessoncode='" + lessoncode + '\'' +
            ", lessonname='" + lessonname + '\'' +
            ", major='" + major + '\'' +
            '}';
  }

  public String getLessoncode() {
    return lessoncode;
  }

  public void setLessoncode(String lessoncode) {
    this.lessoncode = lessoncode;
  }


  public String getLessonname() {
    return lessonname;
  }

  public void setLessonname(String lessonname) {
    this.lessonname = lessonname;
  }


  public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }

}
