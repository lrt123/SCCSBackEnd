package cn.edu.guet.model;


public class Exam {

  private String lessonno;
  private String classroomloc;
  private java.sql.Timestamp starttime;
  private java.sql.Timestamp endtime;


  public String getLessonno() {
    return lessonno;
  }

  public void setLessonno(String lessonno) {
    this.lessonno = lessonno;
  }


  public String getClassroomloc() {
    return classroomloc;
  }

  public void setClassroomloc(String classroomloc) {
    this.classroomloc = classroomloc;
  }


  public java.sql.Timestamp getStarttime() {
    return starttime;
  }

  public void setStarttime(java.sql.Timestamp starttime) {
    this.starttime = starttime;
  }


  public java.sql.Timestamp getEndtime() {
    return endtime;
  }

  public void setEndtime(java.sql.Timestamp endtime) {
    this.endtime = endtime;
  }

}
