package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.UserInfoMapper;
import cn.edu.guet.mapper.UsersMapper;
import cn.edu.guet.model.UserInfo;
import cn.edu.guet.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserInfoServiceImpl implements IUserInfoService {
    @Autowired
    UserInfoMapper userInfoMapper;
    @Autowired
    UsersMapper usersMapper;
    @Override
    public void saveUserInfo(UserInfo userInfo) throws Exception {
        userInfoMapper.saveUserInfo(userInfo);
    }

    @Override
    public void deleteUserInfoById(String id) throws Exception {
        userInfoMapper.deleteUserInfoById(id);
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) throws Exception {
        userInfoMapper.updateUserInfo(userInfo);
    }

    @Override
    public UserInfo getUserInfoById(String id) {
        return userInfoMapper.getUserInfoById(id);
    }

    @Override
    public List<UserInfo> getAllUserInfo() {
        return userInfoMapper.getAllUserInfo();
    }
}
