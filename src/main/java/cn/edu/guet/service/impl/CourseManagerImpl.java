package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.CourseManagerMapper;
import cn.edu.guet.model.LateRegisterBean;
import cn.edu.guet.model.Options;
import cn.edu.guet.service.ICourseManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseManagerImpl implements ICourseManagerService {

    @Autowired
    CourseManagerMapper courseManagerMapper;

    @Override
    public List<Options> getOptions() {
        return courseManagerMapper.getOptions();
    }

    @Override
    public List<LateRegisterBean> getInfoByMajorid(String majorid) {
        return courseManagerMapper.getInfoByMajorid(majorid);
    }

    @Override
    public LateRegisterBean getInfoByLessonNo(String lessonno) {
        return courseManagerMapper.getInfoByLessonNo(lessonno);
    }

    @Override
    public int extendLimit(String lessonno, int limit) {
        return courseManagerMapper.extendLimit(lessonno,limit);
    }

    @Override
    public int addStu(String stuid, String lessonno) {
        return courseManagerMapper.addStu(stuid, lessonno);
    }
}
