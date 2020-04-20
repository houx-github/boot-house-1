package com.etoak.Mapper;

import com.etoak.bean.Area;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 宋章志 on 2020/4/20.
 */
public interface Areamapper {
    List<Area> queryByPid(@Param("pid")int pid);
}
