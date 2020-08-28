package cn.edu.guet.controller;

import cn.edu.guet.model.Inform;
import cn.edu.guet.model.ResponseTemplate;
import cn.edu.guet.service.IInformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("inform")
public class InformController {


    @Autowired
    IInformService iInformService;
    @RequestMapping(value = "get/{id}", method = RequestMethod.GET)
    public ResponseTemplate getInform(@PathVariable String id) {
        System.out.println("收到参数");
        Inform inform = iInformService.getInform(id);
        if (inform != null) {
            return ResponseTemplate.result(0,"成功",inform);
        } else {
            return ResponseTemplate.result(-1,"无数据",null);
        }
    }

    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ResponseTemplate getInformList() {
        List<Inform> data = iInformService.getInformList();
        if (data != null) {
            return ResponseTemplate.result(0,"成功",data);
        } else {
            return ResponseTemplate.result(-1,"获取数据失败",null);
        }
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public ResponseTemplate saveInform(@RequestBody Inform inform) {
        if (iInformService.saveInform(inform)) {
            return ResponseTemplate.result(0,"成功",null);
        } else {
            return ResponseTemplate.result(-1,"失败",null);
        }
    }

    @RequestMapping(value = "edit", method = RequestMethod.POST)
    public ResponseTemplate updateInform(@RequestBody Inform inform){
        if (iInformService.updateInform(inform)){
            return ResponseTemplate.result(0,"成功更新",null);
        }else {
            return ResponseTemplate.result(-1,"失败",null);
        }
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public ResponseTemplate deleteInform(@RequestBody Inform inform){
        if (iInformService.deleteInform(inform)){
            return ResponseTemplate.result(0,"成功删除",null);
        }
        else {
            return ResponseTemplate.result(-1,"失败",null);
        }
    }
}