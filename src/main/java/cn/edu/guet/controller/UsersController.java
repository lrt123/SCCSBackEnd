package cn.edu.guet.controller;

import cn.edu.guet.model.Menu;
import cn.edu.guet.model.ResponseTemplate;
import cn.edu.guet.model.Users;
import cn.edu.guet.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("users")
public class UsersController {

    @Autowired
    IUserService userService;
    @Autowired
    ResponseTemplate responseTemplate;

    @RequestMapping(value = "saveUser",method = RequestMethod.POST)
    @ResponseBody
    public ResponseTemplate saveUsers(@RequestBody Users users){
        try {
            userService.saveUsers(users);
            responseTemplate.setCode(200);
            responseTemplate.setMessage("添加用户信息成功");
            responseTemplate.setData(null);
        } catch (Exception e) {
            e.printStackTrace();
            responseTemplate.setCode(401);
            responseTemplate.setMessage("添加用户失败");
            responseTemplate.setData(users);
        }
        return responseTemplate;
    }
    @RequestMapping(value = "updateUser" ,method = RequestMethod.POST)
    @ResponseBody
    public ResponseTemplate updateUsers(@RequestBody Users users){
        try{
            userService.updateUsers(users);
            responseTemplate.setCode(200);
            responseTemplate.setMessage("更新用户成功");
            responseTemplate.setData(null);
        }catch (Exception e) {
            e.printStackTrace();
            responseTemplate.setCode(401);
            responseTemplate.setMessage("更新用户失败");
            responseTemplate.setData(users);
        }
        return responseTemplate;
    }

    @RequestMapping(value = "deleteUser" ,method = RequestMethod.GET)
    @ResponseBody
    public ResponseTemplate deleteUsersById(String id){
        try{
            userService.deleteUsersById(id);
            responseTemplate.setCode(200);
            responseTemplate.setMessage("删除用户成功");
            responseTemplate.setData(null);
        }catch (Exception e) {
            e.printStackTrace();
            responseTemplate.setCode(401);
            responseTemplate.setMessage("删除用户失败");
            responseTemplate.setData(null);
        }
        return responseTemplate;
    }

    @RequestMapping("getUserById")
    @ResponseBody
    public ResponseTemplate getUsersById(String id){
        Users user = userService.getUsersById(id);
        responseTemplate.setCode(200);
        responseTemplate.setMessage("查找用户成功");
        responseTemplate.setData(user);
        return responseTemplate;
    }
    @RequestMapping("getAllUser")
    @ResponseBody
    public ResponseTemplate getAllUsers(){
        List<Users> userList = userService.getAllUsers();
        responseTemplate.setCode(200);
        responseTemplate.setMessage("查找所用用户");
        responseTemplate.setData(userList);
        return responseTemplate;
    }

    @RequestMapping("getUserMenu")
    @ResponseBody
    public ResponseTemplate getUserMenusById(String id){
        List<Menu> menuLsit = userService.getUserMenusById(id);
        responseTemplate.setCode(200);
        responseTemplate.setMessage("查找菜单成功");
        responseTemplate.setData(menuLsit);
        return responseTemplate;
    }
}
