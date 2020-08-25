package cn.edu.guet.controller;

import cn.edu.guet.model.ResponseTemplate;
import cn.edu.guet.model.UserInfo;
import cn.edu.guet.service.IUserInfoService;
import cn.edu.guet.service.impl.UserInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("userInfo")
public class UserInfoController {
    @Autowired
    IUserInfoService userInfoService;

    @RequestMapping(value = "updateUserInfo",method = RequestMethod.POST)
    public ResponseTemplate updateUserInfo(@RequestBody UserInfo userInfo){
        try {
            if(userInfo!=null){
                userInfoService.updateUserInfo(userInfo);
                return ResponseTemplate.result(200,"更新成功",null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseTemplate.result(401,"更新失败",userInfo);
        }
        return ResponseTemplate.result(401,"参数为空",null);
    }
    @RequestMapping(value = "getUserInfoById",method = RequestMethod.GET)
    public ResponseTemplate getUserInfoById(String id){
        if (id!=null){
            UserInfo userInfo = userInfoService.getUserInfoById(id);
            return ResponseTemplate.result(200,"查询成功",userInfo);
        }
        return ResponseTemplate.result(200,"参数为空",null);
    }
}
