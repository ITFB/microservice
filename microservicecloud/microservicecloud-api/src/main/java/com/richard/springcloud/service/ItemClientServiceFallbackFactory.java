package com.richard.springcloud.service;

import com.richard.springcloud.entity.TbItem;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ItemClientServiceFallbackFactory implements FallbackFactory<ItemClientServcie> {
    @Override
    public ItemClientServcie create(Throwable throwable) {
        return new ItemClientServcie() {
            @Override
            public List<TbItem> list() {
                return null;
            }

            @Override
            public TbItem get(Long id) {

                TbItem tbItem = new TbItem();
                tbItem.setId(id);
                tbItem.setTitle("服务降级，该服务不可用");
                return tbItem;
            }

            @Override
            public boolean add(TbItem tbItem) {
                return false;
            }
        };
    }
}
