package cn.edu.guet.model;


public class Course {

  private String lessonno;
  private Teacher teacher;
  private CourseInfo courseInfo;
  private ClassroomInfo classroomInfo;
  private double credit;
  private double period;

  @Override
  public String toString() {
    return "Course{" +
            "lessonno='" + lessonno + '\'' +
            ", teacher=" + teacher +
            ", courseInfo=" + courseInfo +
            ", classroomInfo=" + classroomInfo +
            ", credit=" + credit +
            ", period=" + period +
            '}';
  }

  public Teacher getTeacher() {
    return teacher;
  }

  public void setTeacher(Teacher teacher) {
    this.teacher = teacher;
  }

  public CourseInfo getCourseInfo() {
    return courseInfo;
  }

  public void setCourseInfo(CourseInfo courseInfo) {
    this.courseInfo = courseInfo;
  }

  public ClassroomInfo getClassroomInfo() {
    return classroomInfo;
  }

  public void setClassroomInfo(ClassroomInfo classroomInfo) {
    this.classroomInfo = classroomInfo;
  }

  public String getLessonno() {
    return lessonno;
  }

  public void setLessonno(String lessonno) {
    this.lessonno = lessonno;
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
