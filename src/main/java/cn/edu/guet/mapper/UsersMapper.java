package cn.edu.guet.mapper;

import cn.edu.guet.model.Menu;
import cn.edu.guet.model.Users;
import cn.edu.guet.util.PageModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UsersMapper {
    void saveUsers(Users users) throws Exception;
    void updateUsers(Users users) throws Exception;
    void deleteUsersById(String id) throws Exception;
    void saveRole(@Param("id") String id,@Param("roleid") String roleid) throws Exception;
    void updateRole(@Param("id") String id,@Param("roleid") String roleid) throws Exception;
    Users getUsersById(String id);
    List<Users> getAllUsers(int endRow, int startRow);
    int getAllUsersTotal();
    List<Users> getUsersByCondition(Map map);
    Users login(@Param("id")String id,@Param("password")String password);

}
