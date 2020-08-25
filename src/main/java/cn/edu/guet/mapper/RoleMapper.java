package cn.edu.guet.mapper;

import cn.edu.guet.model.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RoleMapper {
    Role getRoleById(String roleId);
    List<Role> getAllRole();
    void saveRole(Role role)throws Exception;
    void saveRoleMenu(@Param("menuid") String menuid,@Param("roleid")String roleid)throws Exception;
    void updateRole(Role role) throws Exception;
    void deleteRoleById(String roleId) throws Exception;
}
