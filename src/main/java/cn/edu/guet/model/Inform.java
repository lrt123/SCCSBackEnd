package cn.edu.guet.model;


import java.sql.Timestamp;

public class Inform {

  private String id;
  private String message;
  private java.sql.Timestamp starttime;
  private java.sql.Timestamp endtime;
  private String title;
  private String publisher;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public Timestamp getStarttime() {
    return starttime;
  }

  public void setStarttime(java.sql.Timestamp starttime) {
    this.starttime = starttime;
  }


  public Timestamp getEndtime() {
    return endtime;
  }


  public void setEndtime(java.sql.Timestamp endtime) {
    this.endtime = endtime;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

}
