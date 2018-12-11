package com.richard.springcloud.dao;

import com.richard.springcloud.entity.TbItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TbItemMapper {
    TbItem findById(Long id);

    List<TbItem> findAll();

    boolean addItem(TbItem item);

}
