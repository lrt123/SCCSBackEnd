package cn.edu.guet.mapper;


import cn.edu.guet.model.Menu;
import cn.edu.guet.model.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuMapper {
    Menu getMenuById(String id);
    List<Menu> getAllMenu();
    List<Menu> getUserMenu(@Param("userid") String userid);
    void saveMenu(Menu menu) throws Exception;
    void deleteMenuById(String id) throws Exception;
    void updateMenu(Menu menu) throws Exception;
}