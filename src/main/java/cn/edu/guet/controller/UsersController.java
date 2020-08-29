package cn.edu.guet.controller;

import cn.edu.guet.model.Menu;
import cn.edu.guet.model.ResponseTemplate;
import cn.edu.guet.model.Users;
import cn.edu.guet.service.IUserService;
import cn.edu.guet.util.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("users")
public class UsersController {

    @Autowired
    IUserService userService;

    @RequestMapping(value = "saveUser",method = RequestMethod.POST)
    public ResponseTemplate saveUsers(@RequestBody Users users){
        try {
            if(users!=null){
                userService.saveUsers(users);
                return ResponseTemplate.result(200,"添加用户信息成功",null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseTemplate.result(401,"添加用户失败",users);
        }
        return ResponseTemplate.result(401,"参数为空",null);
    }
    @RequestMapping(value = "updateUser" ,method = RequestMethod.POST)
    public ResponseTemplate updateUsers(@RequestBody Users users){
        try{
            if(users!=null){
                userService.updateUsers(users);
                return ResponseTemplate.result(200,"更新用户成功",null);
            }

        }catch (Exception e) {
            e.printStackTrace();
            return ResponseTemplate.result(401,"添加用户失败",users);
        }
        return ResponseTemplate.result(401,"参数为空",null);
    }

    @RequestMapping(value = "deleteUser" ,method = RequestMethod.GET)
    public ResponseTemplate deleteUsersById(String id){
        try{
            if(id !=null && id!=""){
                userService.deleteUsersById(id);
                return ResponseTemplate.result(200,"删除用户成功",null);
            }
        }catch (Exception e) {
            e.printStackTrace();
            return ResponseTemplate.result(401,"删除用户失败",null);
        }
        return ResponseTemplate.result(401,"参数为空",null);
    }


    @RequestMapping("getUserById")
    public ResponseTemplate getUsersById(String id){
        if(id!=null && id!=""){
            Users user = userService.getUsersById(id);
            return ResponseTemplate.result(200,"查找用户成功",user);
        }
        return ResponseTemplate.result(200,"参数为空",null);
    }
    @RequestMapping(value = "getAllUser",method = RequestMethod.GET)
    public ResponseTemplate getAllUsers(int currentPage){
        PageModel<Users> pageModel = null;
        if(currentPage>0){
            int rowPerPage = 2;
            pageModel = userService.getAllUsers(rowPerPage, currentPage);
        }
        return ResponseTemplate.result(200,"查找所用用户",pageModel);
    }

    @RequestMapping("getUserMenu")
    public ResponseTemplate getUserMenusById(String id){
        if(id!=null && id!=""){
            List<Menu> menuLsit = userService.getUserMenusById(id);
            return ResponseTemplate.result(200,"查找菜单成功",menuLsit);
        }
        return ResponseTemplate.result(200,"参数为空",null);
    }
    @RequestMapping(value = "getUsersByCondition",method = RequestMethod.GET)
    public ResponseTemplate getUsersByCondition(String condition,String value){
        System.out.println("condition = " + condition);
        System.out.println("value = " + value);
        List<Users> usersByCondition = null;
        if(condition!=null && value !=null){
            Map map = new HashMap<>();
            map.put(condition,value);
            usersByCondition = userService.getUsersByCondition(map);
            if(usersByCondition.isEmpty())
                 return ResponseTemplate.result(200,"没有与之相关的数据",usersByCondition);
            return ResponseTemplate.result(200,"查询成功",usersByCondition);
        }
        return ResponseTemplate.result(401,"查询失败",usersByCondition);
    }
}
