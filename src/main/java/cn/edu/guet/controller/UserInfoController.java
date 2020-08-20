package cn.edu.guet.controller;

import cn.edu.guet.model.ResponseTemplate;
import cn.edu.guet.model.UserInfo;
import cn.edu.guet.service.IUserInfoService;
import cn.edu.guet.service.impl.UserInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("userInfo")
public class UserInfoController {
    @Autowired
    IUserInfoService userInfoService;
    @Autowired
    ResponseTemplate responseTemplate;

    @RequestMapping(value = "updateUserInfo",method = RequestMethod.POST)
    @ResponseBody
    public ResponseTemplate updateUserInfo(@RequestBody UserInfo userInfo){
        try {
            userInfoService.updateUserInfo(userInfo);
            responseTemplate.setCode(200);
            responseTemplate.setMessage("更新成功");
            responseTemplate.setData(userInfo);
        } catch (Exception e) {
            e.printStackTrace();
            responseTemplate.setCode(401);
            responseTemplate.setMessage("更新失败");
            responseTemplate.setData(userInfo);
        }
        return responseTemplate;
    }
    @RequestMapping(value = "getUserInfoById",method = RequestMethod.GET)
    @ResponseBody
    public ResponseTemplate getUserInfoById(String id){

        UserInfo userInfo = userInfoService.getUserInfoById(id);
        responseTemplate.setCode(200);
        responseTemplate.setMessage("查询成功");
        responseTemplate.setData(userInfo);
        return responseTemplate;
    }
}
