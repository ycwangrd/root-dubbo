package com.huayanginfo.dubbo.consumer.controller;

import com.huayanginfo.dubbo.consumer.service.CacServiceImpl;
import com.huayanginfo.dubbo.model.CmsArticleChannel;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wangrd 北京华洋峻峰信息工程股份公司
 * https://www.huayanginfo.com ©2008-2021 huayanginfo.com
 * All Rights Reserved.
 * @since 2021年07月02日 星期五 17:43:17
 */
@Log4j2
@RestController
public class CacController {
    @Autowired
    private CacServiceImpl cacServiceImpl;

    @RequestMapping("/getCacList")
    public List<CmsArticleChannel> getList() {
        return cacServiceImpl.getList();
    }
}
