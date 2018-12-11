package com.richard.springcloud.service;

import com.richard.springcloud.entity.TbItem;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "MICROSERVICECLOUD-ITEM",fallbackFactory = ItemClientServiceFallbackFactory.class)
public interface ItemClientServcie {

    @RequestMapping("/item/list")
    public List<TbItem> list();

    @RequestMapping("/item/get/{id}")
    public TbItem get(@PathVariable("id") Long id);

    @RequestMapping("/item/add")
    public boolean add(TbItem tbItem);


}
