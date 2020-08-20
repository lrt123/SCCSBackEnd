package cn.edu.guet.mapper;

import cn.edu.guet.model.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsersMapper {

    void saveUsers(Users users) throws Exception;
    void updateUsers(Users users) throws Exception;
    void deleteUsersById(String id) throws Exception;
    void saveRole(@Param("id") String id,@Param("roleid") String roleid) throws Exception;
    Users getUsersById(String id);
    List<Users> getAllUsers();
}
