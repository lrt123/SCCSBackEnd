package cn.edu.guet.controller;

import cn.edu.guet.model.Menu;
import cn.edu.guet.model.ResponseTemplate;
import cn.edu.guet.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("menu")
public class MenuController {

    @Autowired
    IMenuService menuService;

    @Autowired
    ResponseTemplate responseTemplate;

    @ResponseBody
    @RequestMapping(value = "getMenuById",method = RequestMethod.GET)
    public ResponseTemplate getMenuById(String id){
        Menu menu = menuService.getMenuById(id);
        responseTemplate.setCode(200);
        responseTemplate.setMessage("查找菜单成功");
        responseTemplate.setData(menu);
        return responseTemplate;
    }
    public ResponseTemplate getAllMenu(){
        List<Menu> allMenu = menuService.getAllMenu();
        responseTemplate.setCode(200);
        responseTemplate.setMessage("查询所有菜单成功");
        responseTemplate.setData(allMenu);
        return responseTemplate;
    }
    public void saveMenu(Menu menu) {
        try {
            menuService.saveMenu(menu);
            responseTemplate.setCode(200);
            responseTemplate.setMessage("添加菜单成功");
            responseTemplate.setData(null);
        } catch (Exception e) {
            e.printStackTrace();
            responseTemplate.setCode(401);
            responseTemplate.setMessage("添加菜单失败");
            responseTemplate.setData(menu);
        }
    }
    public void deleteMenuById(String id){
        try {
            menuService.deleteMenuById(id);
            responseTemplate.setCode(200);
            responseTemplate.setMessage("删除菜单成功");
            responseTemplate.setData(null);
        } catch (Exception e) {
            e.printStackTrace();
            responseTemplate.setCode(401);
            responseTemplate.setMessage("删除菜单失败");
            responseTemplate.setData(null);
        }
    }
    public void updateMenu(Menu menu) {
        try {
            menuService.updateMenu(menu);
            responseTemplate.setCode(200);
            responseTemplate.setMessage("更新菜单成功");
            responseTemplate.setData(null);
        } catch (Exception e) {
            e.printStackTrace();
            responseTemplate.setCode(401);
            responseTemplate.setMessage("更新菜单失败");
            responseTemplate.setData(menu);
        }
    }
}
