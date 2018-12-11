package com.richard.springcloud.controller;

import com.richard.springcloud.entity.TbItem;
import com.richard.springcloud.service.ItemClientServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ItemController_Consumer {


    @Autowired
    private ItemClientServcie itemClientServcie;


    @RequestMapping("/consumer/item/list")
    public List<TbItem> list(){

        return this.itemClientServcie.list();
    }

    @RequestMapping("/consumer/item/get/{id}")
    public TbItem get(@PathVariable("id") Long id){
        return this.itemClientServcie.get(id);
    }

    @RequestMapping("/consumer/item/add")
    public boolean add(TbItem tbItem){
        return this.itemClientServcie.add(tbItem);
    }


    /*@RequestMapping("/consumer/item/discovery")
    public Object discovery(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/item/discovery",List.class);
    }*/
}
