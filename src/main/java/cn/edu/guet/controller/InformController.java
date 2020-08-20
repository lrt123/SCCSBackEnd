package cn.edu.guet.controller;

import cn.edu.guet.model.Inform;
import cn.edu.guet.model.ResponseTemplate;
import cn.edu.guet.service.IInformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
        if (inform != null) {
            responseTemplate.setCode(0);
            responseTemplate.setMessage("成功");
            responseTemplate.setData(inform);
        } else {
            responseTemplate.setCode(-1);
            responseTemplate.setMessage("无数据");
            responseTemplate.setData(null);
        }
        return responseTemplate;
    }

    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    @ResponseBody
    public ResponseTemplate getInformList() {
        List<Inform> data = iInformService.getInformList();
        if (data != null) {
            responseTemplate.setCode(0);
            responseTemplate.setMessage("成功");
            responseTemplate.setData(data);
        } else {
            responseTemplate.setCode(-1);
            responseTemplate.setMessage("获取数据失败");
            responseTemplate.setData(null);
        }
        return responseTemplate;
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    @ResponseBody
    public ResponseTemplate saveInform(@RequestBody Inform inform) {
        if (iInformService.saveInform(inform)) {
            responseTemplate.setCode(0);
            responseTemplate.setMessage("成功插入");
        } else {
            responseTemplate.setCode(-1);
            responseTemplate.setMessage("失败");
        }
        return responseTemplate;
    }

    @RequestMapping(value = "edit", method = RequestMethod.POST)
    @ResponseBody
    public ResponseTemplate updateInform(@RequestBody Inform inform){
        if (iInformService.updateInform(inform)){
            responseTemplate.setCode(0);
            responseTemplate.setMessage("成功更新");
        }else {
            responseTemplate.setCode(-1);
            responseTemplate.setMessage("失败");
        }
        return responseTemplate;
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    @ResponseBody
    public ResponseTemplate deleteInform(@RequestBody Inform inform){
        if (iInformService.deleteInform(inform)){
            responseTemplate.setCode(0);
            responseTemplate.setMessage("成功删除");
        }
        else {
            responseTemplate.setCode(-1);
            responseTemplate.setMessage("失败");
        }
        return responseTemplate;
    }
}