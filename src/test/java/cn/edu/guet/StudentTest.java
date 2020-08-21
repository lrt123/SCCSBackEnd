package cn.edu.guet;

import cn.edu.guet.model.Clazz;
import cn.edu.guet.model.MajorInfo;
import cn.edu.guet.model.Student;
import cn.edu.guet.service.IStudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

    @Test
    public void  getStudentById(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        IStudentService studentService = (IStudentService)ctx.getBean("StudentService");
        Student student = studentService.getStudentById("XS0001");
        System.out.println("student = " + student);
    }
    @Test
    public void updateStudent() throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        IStudentService studentService = (IStudentService)ctx.getBean("StudentService");
        Student student = new Student();
        student.setId("XS0005");
        Clazz clazz = new Clazz();
        clazz.setClassid("BJ0001");
        clazz.setHeadteacher("");
        clazz.setGrade("一班");
        clazz.setGradeid("");
        student.setClazz(clazz);
        MajorInfo mi = new MajorInfo();
        mi.setMajorid("ZY0001");
        mi.setMajorname("");
        mi.setMajorleader("");
        student.setMajorInfo(mi);
        studentService.updateStudent(student);
    }
}
