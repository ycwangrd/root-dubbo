package com.huayanginfo.dubbo.provider.repository;

import com.huayanginfo.dubbo.model.JdpSysCalendar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author wangrd 北京华洋峻峰信息工程股份公司
 * https://www.huayanginfo.com ©2008-2021 huayanginfo.com
 * All Rights Reserved.
 * @since 2021年07月06日 星期二 11:43:56
 */
@Repository
public interface JscRepository extends JpaRepository<JdpSysCalendar, String> {
}
