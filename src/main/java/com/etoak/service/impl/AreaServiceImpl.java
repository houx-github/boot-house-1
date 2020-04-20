package com.etoak.service.impl;

import com.etoak.Mapper.Areamapper;
import com.etoak.bean.Area;
import com.etoak.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 宋章志 on 2020/4/20.
 */
@Service
public class AreaServiceImpl implements AreaService{
   @Autowired
    Areamapper areamapper;
    @Override
    public List<Area> queryByPid(int pid) {
        return areamapper.queryByPid(pid);
    }
}

