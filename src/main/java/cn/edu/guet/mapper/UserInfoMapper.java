package cn.edu.guet.mapper;

import cn.edu.guet.model.UserInfo;

import java.util.List;

public interface UserInfoMapper {
    UserInfo saveUserInfo(UserInfo userInfo);
    int deleteUserInfo(UserInfo userInfo);
    int updateUserInfo(UserInfo userInfo);
    UserInfo getUserInfoById(String id);
    List<UserInfo> getAllUserInfo();
}
