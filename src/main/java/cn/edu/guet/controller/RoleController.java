package cn.edu.guet.controller;

import cn.edu.guet.model.ResponseTemplate;
import cn.edu.guet.model.Role;
import cn.edu.guet.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("role")
public class RoleController {
    @Autowired
    IRoleService roleService;
    @Autowired
    ResponseTemplate responseTemplate;
    @ResponseBody
    @RequestMapping(value = "getRoleById",method = RequestMethod.GET)
    public ResponseTemplate getRoleById(String roleId){
        Role role = roleService.getRoleById(roleId);
        responseTemplate.setCode(200);
        responseTemplate.setMessage("查找角色成功");
        responseTemplate.setData(role);
        return responseTemplate;
    }

    @ResponseBody
    @RequestMapping("getAllRoles")
    public ResponseTemplate getAllRole(){
        List<Role> allRole = roleService.getAllRole();
        responseTemplate.setCode(200);
        responseTemplate.setMessage("查找角色成功");
        responseTemplate.setData(allRole);
        return responseTemplate;
    }
    @ResponseBody
    @RequestMapping(value = "saveRole",method = RequestMethod.POST)
    public ResponseTemplate saveRole(@RequestBody Role role){
        try {
            roleService.saveRole(role);
            responseTemplate.setCode(200);
            responseTemplate.setMessage("添加角色成功");
            responseTemplate.setData(null);
        } catch (Exception e) {
            e.printStackTrace();
            responseTemplate.setCode(401);
            responseTemplate.setMessage("添加角色失败");
            responseTemplate.setData(role);
        }
        return responseTemplate;
    }
    @ResponseBody
    @RequestMapping(value = "updateRole",method = RequestMethod.POST)
    public ResponseTemplate updateRole(@RequestBody Role role){
        try {
            roleService.updateRole(role);
            responseTemplate.setCode(200);
            responseTemplate.setMessage("更新角色成功");
            responseTemplate.setData(null);
        } catch (Exception e) {
            e.printStackTrace();
            responseTemplate.setCode(401);
            responseTemplate.setMessage("更新角色失败");
            responseTemplate.setData(role);
        }
        return responseTemplate;
    }

    @ResponseBody
    @RequestMapping("deleteRoleById")
    public ResponseTemplate deleteRoleById(String roleId){
        try {
            roleService.deleteRoleById(roleId);
            responseTemplate.setCode(200);
            responseTemplate.setMessage("删除角色成功");
            responseTemplate.setData(null);
        } catch (Exception e) {
            e.printStackTrace();
            responseTemplate.setCode(401);
            responseTemplate.setMessage("删除角色失败");
            responseTemplate.setData(null);
        }
        return responseTemplate;
    }

    @ResponseBody
        @RequestMapping("saveRoleMenu")
    public ResponseTemplate saveRoleMenu(String roleId,String menuId){
        try {
            roleService.saveRoleMenu(menuId, roleId);
            responseTemplate.setCode(200);
            responseTemplate.setMessage("角色成功");
            responseTemplate.setData(null);
        } catch (Exception e) {
            e.printStackTrace();
            responseTemplate.setCode(401);
            responseTemplate.setMessage("删除角色失败");
            responseTemplate.setData(null);
        }
        return responseTemplate;
    }

}
