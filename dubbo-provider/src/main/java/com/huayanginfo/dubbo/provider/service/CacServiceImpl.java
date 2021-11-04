package com.huayanginfo.dubbo.provider.service;

import com.huayanginfo.dubbo.model.CmsArticleChannel;
import com.huayanginfo.dubbo.provider.repository.CacRepository;
import com.huayanginfo.dubbo.api.CacService;
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
 * @since 2021年07月02日 星期五 17:43:33
 */
@Log4j2
@DubboService
public class CacServiceImpl implements CacService {

    @Autowired
    private CacRepository repository;

    @Override
    public List<CmsArticleChannel> getList() {
        PageRequest pageRequest = PageRequest.of(1, 50, Sort.Direction.DESC, "articleFileCreateTime");
        return repository.findAll(pageRequest).getContent();
    }
}
