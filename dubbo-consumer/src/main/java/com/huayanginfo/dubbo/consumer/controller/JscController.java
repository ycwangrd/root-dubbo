package com.huayanginfo.dubbo.consumer.controller;

import com.huayanginfo.dubbo.consumer.service.JscServiceImpl;
import com.huayanginfo.dubbo.model.JdpSysCalendar;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wangrd 北京华洋峻峰信息工程股份公司
 * https://www.huayanginfo.com ©2008-2021 huayanginfo.com
 * All Rights Reserved.
 * @since 2021年07月06日 星期二 11:50:29
 */
@Log4j2
@RestController
public class JscController {

    @Autowired
    private JscServiceImpl jscServiceImpl;

    @GetMapping(value = "/getJscList")
    public List<JdpSysCalendar> getList() {
        return jscServiceImpl.getList();
    }
}
