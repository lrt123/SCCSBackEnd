package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.RoleMapper;
import cn.edu.guet.model.Role;
import cn.edu.guet.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RoleServiceImpl implements IRoleService {
    @Autowired
    RoleMapper roleMapper;

    @Override
    public Role getRoleById(String roleId) {
        return roleMapper.getRoleById(roleId);
    }

    @Override
    public List<Role> getAllRole() {
        return roleMapper.getAllRole();
    }

    @Override
    public void saveRole(Role role) throws Exception {

    }

    @Override
    public void updateRole(Role role) throws Exception {

    }

    @Override
    public void deleteRoleById(String roleId) throws Exception {

    }
}
