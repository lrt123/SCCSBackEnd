package cn.edu.guet.controller;

import cn.edu.guet.model.Inform;
import cn.edu.guet.model.ResponseTemplate;
import cn.edu.guet.service.IInformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("inform")
public class InformController {


    @Autowired
    IInformService iInformService;

    @Autowired
    ResponseTemplate responseTemplate;

    @RequestMapping(value = "get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseTemplate getInform(@PathVariable String id) {
        System.out.println("收到参数");
        Inform inform = iInformService.getInform(id);
        if (inform!=null){
            responseTemplate.setCode(0);
            responseTemplate.setMessage("成功");
            responseTemplate.setData(inform);
        }
        else {
            responseTemplate.setCode(-1);
            responseTemplate.setMessage("无数据");
            responseTemplate.setData(null);
        }
        return responseTemplate;
    }

    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    @ResponseBody
    public ResponseTemplate getInformList(){
        List<Inform> data = iInformService.getInformList();
        responseTemplate.setCode(0);
        responseTemplate.setMessage("成功");
        responseTemplate.setData(data);
        return responseTemplate;
    }


}