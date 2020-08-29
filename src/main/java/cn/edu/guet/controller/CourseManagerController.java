package cn.edu.guet.controller;

import cn.edu.guet.model.ResponseTemplate;
import cn.edu.guet.service.ICourseManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("courseManager")
public class CourseManagerController {

    @Autowired
    ICourseManagerService courseManagerService;


    @RequestMapping(value = "options", method = RequestMethod.GET)
    public ResponseTemplate getOptions(){

        return ResponseTemplate.success(courseManagerService.getOptions());
    }

    @RequestMapping(value = "courseinfo/{majorid}")
    public ResponseTemplate getInfoByMajorid(@PathVariable String majorid){
        return ResponseTemplate.success(courseManagerService.getInfoByMajorid(majorid));
    }

    @RequestMapping(value = "courseinfol/{lessonno}")
    public ResponseTemplate getInfoByLessonNo(@PathVariable String lessonno){
        return ResponseTemplate.success(courseManagerService.getInfoByLessonNo(lessonno));
    }

    @PostMapping(value = "extend")
    public ResponseTemplate extendLimit(@RequestBody Map params){
        String lessonno = (String) params.get("lessonno");
        int limit = (int) params.get("limit");
        if (courseManagerService.extendLimit(lessonno,limit) > 0){
            return ResponseTemplate.success("更新成功");
        }
        else {
            return ResponseTemplate.fail("更新失败");
        }
    }

    @PostMapping(value = "add")
    public ResponseTemplate addStu(@RequestBody Map params){
        String lessonno = (String) params.get("lessonno");
        String stuid = (String) params.get("stuid");
        if (courseManagerService.addStu(stuid,lessonno) > 0){
            return ResponseTemplate.success("添加成功");
        }
        else {
            return ResponseTemplate.fail("添加失败");
        }
    }
}
