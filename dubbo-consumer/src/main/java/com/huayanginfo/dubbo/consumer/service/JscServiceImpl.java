package com.huayanginfo.dubbo.consumer.service;

import com.huayanginfo.dubbo.model.JdpSysCalendar;
import com.huayanginfo.dubbo.api.JscService;
import lombok.extern.log4j.Log4j2;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangrd 北京华洋峻峰信息工程股份公司
 * https://www.huayanginfo.com ©2008-2021 huayanginfo.com
 * All Rights Reserved.
 * @since 2021年07月06日 星期二 11:44:59
 */
@Log4j2
@Service
public class JscServiceImpl {

    @DubboReference
    private JscService jscService;

    public List<JdpSysCalendar> getList() {
        return jscService.getList();
    }
}
