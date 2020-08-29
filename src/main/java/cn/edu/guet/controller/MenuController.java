package cn.edu.guet.controller;

import cn.edu.guet.model.Menu;
import cn.edu.guet.model.ResponseTemplate;
import cn.edu.guet.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("menu")
public class MenuController {

    @Autowired
    IMenuService menuService;

    @RequestMapping(value = "getMenuById",method = RequestMethod.GET)
    public ResponseTemplate getMenuById(String id){
        Menu menu = menuService.getMenuById(id);
        return ResponseTemplate.result(200,"查找菜单成功",menu);
    }

    @RequestMapping(value = "getAllMenu",method = RequestMethod.GET)
    public ResponseTemplate getAllMenu(){
        List<Menu> allMenu = menuService.getAllMenu();
        return ResponseTemplate.result(200,"查询所有菜单成功",allMenu);
    }

    @RequestMapping(value = "getAllAllMenu",method = RequestMethod.GET)
    public ResponseTemplate getAllAllMenu(){
        List<Menu> allMenu = menuService.getAllAllMenu();
        return ResponseTemplate.result(200,"查询所有菜单成功",allMenu);
    }

    @RequestMapping(value = "saveMenu",method = RequestMethod.POST)
    public ResponseTemplate saveMenu(@RequestBody Menu menu) {
        System.err.println("menu.getMenuname() = " + menu.getMenuname());
        try {
            menuService.saveMenu(menu);
            return ResponseTemplate.result(200,"添加菜单成功",null);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseTemplate.result(401,"添加菜单失败",menu);
        }
    }

    @RequestMapping(value = "deleteMenuById",method = RequestMethod.GET)
    public ResponseTemplate deleteMenuById(String id){
        try {
            menuService.deleteMenuById(id);
            return ResponseTemplate.result(200,"删除菜单成功",null);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseTemplate.result(401,"删除菜单失败",null);
        }
    }

    @RequestMapping(value = "updateMenu",method = RequestMethod.POST)
    public ResponseTemplate updateMenu(@RequestBody Menu menu) {
        try {
            System.out.println("menu="+menu);
            System.out.println(menu.getMenuid());
            System.out.println(menu.getMenuname());
            menuService.updateMenu(menu);
            return ResponseTemplate.result(200,"更新菜单成功",null);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseTemplate.result(401,"更新菜单失败",menu);
        }
    }
}
