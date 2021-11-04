package com.huayanginfo.dubbo.api;

import com.huayanginfo.dubbo.model.JdpSysCalendar;

import java.util.List;

/**
 * @author wangrd 北京华洋峻峰信息工程股份公司
 * https://www.huayanginfo.com ©2008-2021 huayanginfo.com
 * All Rights Reserved.
 * @since 2021年07月06日 星期二 11:42:00
 */
public interface JscService {

    /**
     * 查询日期列表
     *
     * @return
     */
    List<JdpSysCalendar> getList();
}
