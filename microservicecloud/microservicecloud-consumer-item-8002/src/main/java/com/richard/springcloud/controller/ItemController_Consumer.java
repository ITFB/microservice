package com.richard.springcloud.controller;

import com.richard.springcloud.entity.TbItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ItemController_Consumer {

    private static final String REST_URL_PREFIX = "http://localhost:8001";
    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping("/consumer/item/list")
    public List<TbItem> list(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/item/list",List.class);
    }

    @RequestMapping("/consumer/item/get/{id}")
    public TbItem get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/item/get/"+id,TbItem.class);
    }

    @RequestMapping("/consumer/item/add")
    public boolean add(TbItem tbItem){
        return restTemplate.postForObject(REST_URL_PREFIX+"/item/add",tbItem,Boolean.class);
    }


    @RequestMapping("/consumer/item/discovery")
    public Object discovery(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/item/discovery",List.class);
    }
}
