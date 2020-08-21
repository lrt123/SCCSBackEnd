package cn.edu.guet.model;


public class Teacher {

  private String id;
  private String jobtitle;
  private UserInfo userInfo;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getJobtitle() {
    return jobtitle;
  }

  public void setJobtitle(String jobtitle) {
    this.jobtitle = jobtitle;
  }

  public UserInfo getUserInfo() {
    return userInfo;
  }

  public void setUserInfo(UserInfo userInfo) {
    this.userInfo = userInfo;
  }
}
