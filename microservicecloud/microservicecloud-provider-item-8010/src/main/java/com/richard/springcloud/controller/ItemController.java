package com.richard.springcloud.controller;

import com.richard.springcloud.entity.TbItem;
import com.richard.springcloud.service.TbItemServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private TbItemServcie itemServcie;

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/item/add",method = RequestMethod.POST)
    public boolean add(TbItem item){
        return itemServcie.add(item);
    }


    @RequestMapping(value = "/item/get/{id}",method = RequestMethod.GET)
    public TbItem get(@PathVariable("id") Long id){
        return itemServcie.get(id);
    }

    @RequestMapping(value = "/item/list",method = RequestMethod.GET)
    public List<TbItem> list(){
        return itemServcie.list();
    }

    @RequestMapping("/item/discovery")
    public Object discovery(){
        List<String> list = client.getServices();
        System.out.println("list==>"+list);

        List<ServiceInstance> instances = client.getInstances("MICROSERVICECLOUD-ITEM");

        return instances;
    }

}
