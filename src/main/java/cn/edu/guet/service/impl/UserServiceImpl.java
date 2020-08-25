package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.MenuMapper;
import cn.edu.guet.mapper.RoleMapper;
import cn.edu.guet.mapper.UserInfoMapper;
import cn.edu.guet.mapper.UsersMapper;
import cn.edu.guet.model.Menu;
import cn.edu.guet.model.Role;
import cn.edu.guet.model.UserInfo;
import cn.edu.guet.model.Users;
import cn.edu.guet.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements IUserService {
    @Autowired
    UsersMapper usersMapper;
    @Autowired
    UserInfoMapper userInfoMapper;
    @Autowired
    RoleMapper roleMapper;
    @Autowired
    MenuMapper menuMapper;
    @Override
    public void saveUsers(Users users) throws Exception {
        usersMapper.saveUsers(users);
        userInfoMapper.saveUserInfo(users.getUserInfo());
        for(Role role:users.getRoles()){
            usersMapper.saveRole(users.getId(),role.getRoleid());
        }
    }

    @Override
    public void updateUsers(Users users) throws Exception {
        usersMapper.updateUsers(users);
        userInfoMapper.updateUserInfo(users.getUserInfo());
        for (Role role:users.getRoles()) {
            usersMapper.updateRole(users.getId(),role.getRoleid());
        }
    }

    @Override
    public void deleteUsersById(String id) throws Exception {
        usersMapper.deleteUsersById(id);
    }


    @Override
    public Users getUsersById(String id) {
        return usersMapper.getUsersById(id);
    }

    @Override
    public List<Users> getAllUsers() {
        return usersMapper.getAllUsers();
    }

    @Override
    public List<Menu> getUserMenusById(String id) {
       return  menuMapper.getUserMenu(id);
    }
}
