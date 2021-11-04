package com.huayanginfo.dubbo.api;

import com.huayanginfo.dubbo.model.CmsArticleChannel;

import java.util.List;

/**
 * @author wangrd 北京华洋峻峰信息工程股份公司
 * https://www.huayanginfo.com ©2008-2021 huayanginfo.com
 * All Rights Reserved.
 * @since 2021年07月02日 星期五 17:56:32
 */
public interface CacService {
    /**
     * 获取分页列表
     *
     * @return
     */
    List<CmsArticleChannel> getList();
}
