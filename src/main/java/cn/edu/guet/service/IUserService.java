package cn.edu.guet.service;

import cn.edu.guet.model.Menu;
import cn.edu.guet.model.Users;
import cn.edu.guet.util.PageModel;

import java.util.List;
import java.util.Map;

public interface IUserService {
    void saveUsers(Users users) throws Exception;
    void updateUsers(Users users) throws Exception;
    void deleteUsersById(String id) throws Exception;
    Users getUsersById(String id);
    PageModel<Users> getAllUsers(int rowPerPage,int currentPage);
    List<Menu> getUserMenusById(String id);
    List<Users> getUsersByCondition(Map map);
}
