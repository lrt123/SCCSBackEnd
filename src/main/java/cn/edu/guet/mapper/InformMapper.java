package cn.edu.guet.mapper;

import cn.edu.guet.model.Inform;

import java.util.List;

public interface InformMapper {
    Inform getInform(String id);
    int saveInform(Inform inform);
    List<Inform> getInformList();
}
