package com.huayanginfo.dubbo.consumer.service;

import com.huayanginfo.dubbo.model.CmsArticleChannel;
import com.huayanginfo.dubbo.api.CacService;
import lombok.extern.log4j.Log4j2;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangrd 北京华洋峻峰信息工程股份公司
 * https://www.huayanginfo.com ©2008-2021 huayanginfo.com
 * All Rights Reserved.
 * @since 2021年07月02日 星期五 17:43:33
 */
@Log4j2
@Service
public class CacServiceImpl {

    @DubboReference
    private CacService cacService;

    public List<CmsArticleChannel> getList() {
        return cacService.getList();
    }
}
