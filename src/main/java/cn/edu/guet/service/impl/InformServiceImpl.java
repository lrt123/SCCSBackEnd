package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.InformMapper;
import cn.edu.guet.model.Inform;
import cn.edu.guet.service.IInformService;
import org.springframework.beans.factory.annotation.Autowired;

public class InformServiceImpl implements IInformService {

    @Autowired
    InformMapper informMapper;

    @Override
    public Inform getInform() {
        return informMapper.getInform();
    }
}
