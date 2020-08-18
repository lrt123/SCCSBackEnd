package cn.edu.guet.model;


public class Course {

  private String lessonno;
  private String teacherid;
  private String lessoncode;
  private String classroomloc;
  private double credit;
  private double period;


  public String getLessonno() {
    return lessonno;
  }

  public void setLessonno(String lessonno) {
    this.lessonno = lessonno;
  }


  public String getTeacherid() {
    return teacherid;
  }

  public void setTeacherid(String teacherid) {
    this.teacherid = teacherid;
  }


  public String getLessoncode() {
    return lessoncode;
  }

  public void setLessoncode(String lessoncode) {
    this.lessoncode = lessoncode;
  }


  public String getClassroomloc() {
    return classroomloc;
  }

  public void setClassroomloc(String classroomloc) {
    this.classroomloc = classroomloc;
  }


  public double getCredit() {
    return credit;
  }

  public void setCredit(double credit) {
    this.credit = credit;
  }


  public double getPeriod() {
    return period;
  }

  public void setPeriod(double period) {
    this.period = period;
  }

}
