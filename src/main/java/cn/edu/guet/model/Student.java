package cn.edu.guet.model;


public class Student {

  private String id;
  private MajorInfo majorInfo;
  private Clazz clazz;
  private UserInfo userInfo;

  public UserInfo getUserInfo() {
    return userInfo;
  }

  public void setUserInfo(UserInfo userInfo) {
    this.userInfo = userInfo;
  }

  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  public MajorInfo getMajorInfo() {
    return majorInfo;
  }

  public void setMajorInfo(MajorInfo majorInfo) {
    this.majorInfo = majorInfo;
  }

  public Clazz getClazz() {
    return clazz;
  }

  public void setClazz(Clazz clazz) {
    this.clazz = clazz;
  }

}
