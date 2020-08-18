package cn.edu.guet.model;


public class Score {

  private String id;
  private String teacherid;
  private String studentid;
  private String lessonno;
  private double score;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getTeacherid() {
    return teacherid;
  }

  public void setTeacherid(String teacherid) {
    this.teacherid = teacherid;
  }


  public String getStudentid() {
    return studentid;
  }

  public void setStudentid(String studentid) {
    this.studentid = studentid;
  }


  public String getLessonno() {
    return lessonno;
  }

  public void setLessonno(String lessonno) {
    this.lessonno = lessonno;
  }


  public double getScore() {
    return score;
  }

  public void setScore(double score) {
    this.score = score;
  }

}
