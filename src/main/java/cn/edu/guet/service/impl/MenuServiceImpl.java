package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.MenuMapper;
import cn.edu.guet.model.Menu;
import cn.edu.guet.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MenuServiceImpl implements IMenuService {

    @Autowired
    MenuMapper menuMapper;
    @Override
    public Menu getMenuById(String id) {
        return menuMapper.getMenuById(id);
    }

    @Override
    public List<Menu> getAllMenu() {
        return menuMapper.getAllMenu();
    }

    @Override
    public void saveMenu(Menu menu) throws Exception {
        menuMapper.saveMenu(menu);
    }

    @Override
    public void deleteMenuById(String id) throws Exception {
        menuMapper.deleteMenuById(id);
    }

    @Override
    public void updateMenu(Menu menu) throws Exception {
        menuMapper.updateMenu(menu);
    }
}
