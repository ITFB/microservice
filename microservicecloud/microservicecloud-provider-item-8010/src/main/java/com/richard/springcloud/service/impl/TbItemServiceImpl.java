package com.richard.springcloud.service.impl;

import com.richard.springcloud.dao.TbItemMapper;
import com.richard.springcloud.entity.TbItem;
import com.richard.springcloud.service.TbItemServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbItemServiceImpl implements TbItemServcie {

    @Autowired
    private TbItemMapper tbItemMapper;

    @Override
    public boolean add(TbItem item) {
        return tbItemMapper.addItem(item);
    }

    @Override
    public TbItem get(Long id) {
        return tbItemMapper.findById(id);
    }

    @Override
    public List<TbItem> list() {
        return tbItemMapper.findAll();
    }
}
