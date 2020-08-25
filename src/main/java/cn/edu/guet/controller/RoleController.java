package cn.edu.guet.controller;

import cn.edu.guet.model.ResponseTemplate;
import cn.edu.guet.model.Role;
import cn.edu.guet.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("role")
public class RoleController {
    @Autowired
    IRoleService roleService;

    @RequestMapping(value = "getRoleById",method = RequestMethod.GET)
    public ResponseTemplate getRoleById(String roleId){
        Role role = roleService.getRoleById(roleId);
        return ResponseTemplate.result(200,"查找角色成功",role);
    }


    @RequestMapping("getAllRoles")
    public ResponseTemplate getAllRole(){
        List<Role> allRole = roleService.getAllRole();
        return ResponseTemplate.result(200,"查找角色成功",allRole);
    }

    @RequestMapping(value = "saveRole",method = RequestMethod.POST)
    public ResponseTemplate saveRole(@RequestBody Role role){
        try {
            roleService.saveRole(role);
            return ResponseTemplate.result(200,"添加角色成功",null);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseTemplate.result(401, "添加角色失败", role);
        }
    }

    @RequestMapping(value = "updateRole",method = RequestMethod.POST)
    public ResponseTemplate updateRole(@RequestBody Role role){
        try {
            roleService.updateRole(role);
            return ResponseTemplate.result(200,"更新角色成功",null);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseTemplate.result(401,"更新角色失败",role);
        }
    }


    @RequestMapping("deleteRoleById")
    public ResponseTemplate deleteRoleById(String roleId){
        try {
            roleService.deleteRoleById(roleId);
            return ResponseTemplate.result(200,"删除角色成功",null);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseTemplate.result(401,"删除角色失败",null);
        }
    }


        @RequestMapping("saveRoleMenu")
    public ResponseTemplate saveRoleMenu(String roleId,String menuId){
        try {
            if(roleId!=null && menuId != null){
                roleService.saveRoleMenu(menuId, roleId);
                return ResponseTemplate.result(200,"保存角色菜单成功",null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseTemplate.result(200,"保存角色菜单失败",null);
        }
        return ResponseTemplate.result(401,"数据不合法",null);
    }

}
