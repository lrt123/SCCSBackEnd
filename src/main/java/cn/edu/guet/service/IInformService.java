package cn.edu.guet.service;

import cn.edu.guet.model.Inform;

import java.util.List;

public interface IInformService {
    Inform getInform(String id);
    List<Inform> getInformList();
    boolean saveInform(Inform inform);
    boolean updateInform(Inform inform);
    boolean deleteInform(Inform inform);
}
