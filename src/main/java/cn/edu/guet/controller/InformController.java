package cn.edu.guet.controller;

import cn.edu.guet.model.Inform;
import cn.edu.guet.model.ResponseTemplate;
import cn.edu.guet.service.IInformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("inform")
public class InformController {


    @Autowired
    IInformService iInformService;

    @Autowired
    ResponseTemplate responseTemplate;

    @RequestMapping(value = "get", method = RequestMethod.GET)
    @ResponseBody
    public ResponseTemplate getInform(){
        System.out.println("收到参数");
        Inform inform=iInformService.getInform();
        responseTemplate.setCode(0);
        responseTemplate.setMessage("成功");
        responseTemplate.setData(inform);
        return responseTemplate;
    }
    @RequestMapping("saveUser")
    public void saveUser(String user){

    }
}