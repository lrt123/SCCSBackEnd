package cn.edu.guet.mapper;

import cn.edu.guet.model.LateRegisterBean;
import cn.edu.guet.model.Options;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CourseManagerMapper {
    List<Options> getOptions();
    List<LateRegisterBean> getInfoByMajorid(String majorid);
    LateRegisterBean getInfoByLessonNo(String lessonno);
    int extendLimit(String lessonno, int limit);
    int addStu(String stuid, String lessonno);
}
