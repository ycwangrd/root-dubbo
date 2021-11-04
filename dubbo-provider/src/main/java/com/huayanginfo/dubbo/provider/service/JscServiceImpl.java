package com.huayanginfo.dubbo.provider.service;

import com.huayanginfo.dubbo.model.JdpSysCalendar;
import com.huayanginfo.dubbo.provider.repository.JscRepository;
import com.huayanginfo.dubbo.api.JscService;
import lombok.extern.log4j.Log4j2;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * @author wangrd 北京华洋峻峰信息工程股份公司
 * https://www.huayanginfo.com ©2008-2021 huayanginfo.com
 * All Rights Reserved.
 * @since 2021年07月06日 星期二 11:48:20
 */
@Log4j2
@DubboService
public class JscServiceImpl implements JscService {

    @Autowired
    private JscRepository repository;

    @Override
    public List<JdpSysCalendar> getList() {
        PageRequest pageRequest = PageRequest.of(1, 50, Sort.by(Sort.Direction.DESC, "modifyDate"));
        return repository.findAll(pageRequest).getContent();
    }
}
