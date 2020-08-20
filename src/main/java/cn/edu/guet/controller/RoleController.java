package cn.edu.guet.controller;

import cn.edu.guet.model.ResponseTemplate;
import cn.edu.guet.model.Role;
import cn.edu.guet.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    ResponseTemplate getRoleById(String roleId){
        Role role = roleService.getRoleById(roleId);
        responseTemplate.setCode(200);
        responseTemplate.setMessage("查找角色成功");
        responseTemplate.setData(role);
        return responseTemplate;
    }

    @ResponseBody
    @RequestMapping("getAllRoles")
    ResponseTemplate getAllRole(){
        List<Role> allRole = roleService.getAllRole();
        responseTemplate.setMessage("查找角色成功");
        responseTemplate.setData(allRole);
        return responseTemplate;
    }


}
