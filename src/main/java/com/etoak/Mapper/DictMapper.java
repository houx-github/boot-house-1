package com.etoak.Mapper;

import com.etoak.bean.Dict;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 宋章志 on 2020/4/21.
 */
public interface DictMapper {
    List<Dict>queryList(@Param("groupId")String groupId);
}
