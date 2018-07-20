package com.example.controller;

import javax.annotation.Resource;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.Device;


@Controller
@RequestMapping("/device")
public class DeviceController {
    @Resource
    private DeivceService deviceService;

    @RequestMapping("getDevice")
    @ResponseBody
    public Device getDevice(HttpServletRequest request){
        return null;
    }
    
}
