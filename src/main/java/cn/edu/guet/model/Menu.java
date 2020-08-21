package cn.edu.guet.model;


import java.util.ArrayList;
import java.util.List;

public class Menu {

  private String menuid;
  private String pId;
  private String menuname;
  private String url;
  private String icon;

  private List<Menu> childMenus=new ArrayList<Menu>();
  public String getMenuid() {
    return menuid;
  }

  public void setMenuid(String menuid) {
    this.menuid = menuid;
  }


  public String getpId() {
    return pId;
  }

  public void setpId(String pId) {
    this.pId = pId;
  }

  public List<Menu> getChildMenus() {
    return childMenus;
  }

  public void setChildMenus(List<Menu> childMenus) {
    this.childMenus = childMenus;
  }

  public String getMenuname() {
    return menuname;
  }

  public void setMenuname(String menuname) {
    this.menuname = menuname;
  }


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

}
