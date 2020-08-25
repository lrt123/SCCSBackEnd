package cn.edu.guet.mapper;

import cn.edu.guet.model.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserInfoMapper {
    void saveUserInfo(UserInfo userInfo) throws Exception;
    void deleteUserInfoById(String id) throws Exception;
    void updateUserInfo(UserInfo userInfo) throws Exception;
    UserInfo getUserInfoById(String id);
    List<UserInfo> getAllUserInfo();
}
