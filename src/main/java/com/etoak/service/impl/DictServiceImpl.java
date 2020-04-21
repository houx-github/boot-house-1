package com.etoak.service.impl;

import com.etoak.Mapper.DictMapper;
import com.etoak.bean.Dict;
import com.etoak.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by 宋章志 on 2020/4/21.
 */
public class DictServiceImpl implements DictService{
    @Autowired
    DictMapper dictMapper;
    @Override
    public List<Dict> queryList(String groupId) {
        return dictMapper.queryList(groupId);
    }
}
