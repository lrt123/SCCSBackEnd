package cn.edu.guet.mapper;

import cn.edu.guet.model.Users;

import java.util.List;

public interface UsersMapper {

    Users saveUsers(Users users);
    int updateUsers(Users users);
    int deleteUsers(Users users);
    Users getUsersById(String id);
    List<Users> getAllUsers();
}
