package cn.edu.guet.service;

import cn.edu.guet.model.Menu;
import cn.edu.guet.model.Users;

import java.util.List;

public interface IUserService {
    void saveUsers(Users users) throws Exception;
    void updateUsers(Users users) throws Exception;
    void deleteUsersById(String id) throws Exception;
    Users getUsersById(String id);
    List<Users> getAllUsers();
    List<Menu> getUserMenus(Users users);
}
