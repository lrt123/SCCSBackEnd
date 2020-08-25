package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.InformMapper;
import cn.edu.guet.model.Inform;
import cn.edu.guet.service.IInformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
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

    @Override
    public boolean saveInform(Inform inform) {
        int rownum = informMapper.saveInform(inform);
        if (rownum > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean updateInform(Inform inform) {
        int rownum = informMapper.updateInform(inform);
        if (rownum > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteInform(Inform inform) {
        int rownum = informMapper.deleteInform(inform);
        System.out.println("aaaaa" + rownum);
        if (rownum > 0) {
            return true;
        } else {
            return false;
        }
    }
}
