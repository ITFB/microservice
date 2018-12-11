package com.richard.springcloud.service;

import com.richard.springcloud.entity.TbItem;

import java.util.List;

public interface TbItemServcie {
    boolean add(TbItem item);

    TbItem get(Long id);

    List<TbItem> list();
}
