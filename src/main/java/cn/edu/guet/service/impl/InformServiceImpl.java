package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.InformMapper;
import cn.edu.guet.model.Inform;
import cn.edu.guet.service.IInformService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class InformServiceImpl implements IInformService {

    @Autowired
    InformMapper informMapper;

    @Override
    public Inform getInform(String id) {
        return informMapper.getInform(id);
    }

    @Override
    public List<Inform> getInformList() {
        return informMapper.getInformList();
    }
}
