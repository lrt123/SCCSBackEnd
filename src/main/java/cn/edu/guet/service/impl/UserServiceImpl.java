package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.MenuMapper;
import cn.edu.guet.mapper.RoleMapper;
import cn.edu.guet.mapper.UserInfoMapper;
import cn.edu.guet.mapper.UsersMapper;
import cn.edu.guet.model.Menu;
import cn.edu.guet.model.Role;
import cn.edu.guet.model.UserInfo;
import cn.edu.guet.model.Users;
import cn.edu.guet.service.IUserService;
import cn.edu.guet.util.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UsersMapper usersMapper;
    @Autowired
    UserInfoMapper userInfoMapper;
    @Autowired
    RoleMapper roleMapper;
    @Autowired
    MenuMapper menuMapper;
    @Override
    public void saveUsers(Users users) throws Exception {
        users.setPassword(users.getId());
        usersMapper.saveUsers(users);
        UserInfo ui = users.getUserInfo();
        ui.setId(users.getId());
        userInfoMapper.saveUserInfo(ui);
        for(Role role:users.getRoles()){
            usersMapper.saveRole(users.getId(),role.getRoleid());
        }
    }

    @Override
    public void updateUsers(Users users) throws Exception {
        usersMapper.updateUsers(users);
        userInfoMapper.updateUserInfo(users.getUserInfo());
        for (Role role:users.getRoles()) {
            usersMapper.updateRole(users.getId(),role.getRoleid());
        }
    }

    @Override
    public void deleteUsersById(String id) throws Exception {
        usersMapper.deleteUsersById(id);
    }


    @Override
    public Users getUsersById(String id) {
        return usersMapper.getUsersById(id);
    }

    @Override
    public PageModel<Users> getAllUsers(int rowPerPage, int currentPage) {
        //开始行
        int startRow = (currentPage-1)*rowPerPage+1;
        //结束行
        int endRow = rowPerPage * currentPage;
        List<Users> allUsers = usersMapper.getAllUsers(endRow, startRow);
        PageModel<Users> pageModel = new PageModel<>();
        pageModel.setList(allUsers);
        pageModel.setCurrentPage(currentPage);
        int totalRows = usersMapper.getAllUsersTotal();
        pageModel.setTotalPage(totalRows%rowPerPage==0?(totalRows/rowPerPage):(totalRows/rowPerPage)+1);
        return pageModel;
    }
    @Override
    public List<Menu> getUserMenusById(String id) {
       return  menuMapper.getUserMenu(id);
    }

    @Override
    public List<Users> getUsersByCondition(Map map) {
        return usersMapper.getUsersByCondition(map);
    }

    @Override
    public Users login(String id, String password) {
        return usersMapper.login(id,password);
    }
}
