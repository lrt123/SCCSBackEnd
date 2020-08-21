package cn.edu.guet;

import cn.edu.guet.mapper.MenuMapper;
import cn.edu.guet.model.Menu;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/applicationContext.xml")
public class MenuTest {

    @Autowired
    MenuMapper  menuMapper;
    @Test
    public void getMenuById(){

        ObjectMapper om = new ObjectMapper();
        Menu menu = menuMapper.getMenuById("M0008");
        try {
            String string = om.writeValueAsString(menu);
            System.out.println(string);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void getAllMenu(){
        ObjectMapper om = new ObjectMapper();
        List<Menu> allMenu = menuMapper.getAllMenu();
        try {
            String string = om.writeValueAsString(allMenu);
            System.err.println(string);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public void saveMenu(){

    }

    public void updateMenu(){

    }

    public void deleteMenu(){

    }
}
