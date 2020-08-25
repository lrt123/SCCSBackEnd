package cn.edu.guet.mapper;

import cn.edu.guet.model.Inform;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface InformMapper {
    Inform getInform(String id);
    int saveInform(Inform inform);
    List<Inform> getInformList();
    int updateInform(Inform inform);
    int deleteInform(Inform inform);
}
