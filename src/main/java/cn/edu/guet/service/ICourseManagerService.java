package cn.edu.guet.service;

import cn.edu.guet.model.LateRegisterBean;
import cn.edu.guet.model.Options;

import java.util.List;

public interface ICourseManagerService {
    List<Options> getOptions();
    List<LateRegisterBean> getInfoByMajorid(String majorid);
    LateRegisterBean getInfoByLessonNo(String lessonno);
    int extendLimit(String lessonno, int limit);
    int addStu(String stuid, String lessonno);
}
