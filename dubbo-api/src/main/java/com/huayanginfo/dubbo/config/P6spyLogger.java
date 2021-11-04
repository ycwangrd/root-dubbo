package com.huayanginfo.dubbo.config;

import cn.hutool.db.sql.SqlUtil;
import com.p6spy.engine.spy.appender.MessageFormattingStrategy;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author wangrd 北京华洋峻峰信息工程股份公司
 * https://www.huayanginfo.com ©2008-2021 huayanginfo.com
 * All Rights Reserved.
 * @since 2021年07月06日 星期二 10:53:39
 */

/**
 * @author wangrd
 * 北京华洋峻峰信息工程股份公司
 * https://www.huayanginfo.com ©2008-2020 huayanginfo.com
 * All Rights Reserved.
 * @see MessageFormattingStrategy
 * @since 2020年06月15日 星期一 15:40:51
 * p6spy的日志格式化类
 */
@Log4j2
public class P6spyLogger implements MessageFormattingStrategy {
    private final DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
    /**
     * 慢查询超时警告时间
     */
    private final int slowQueryTimeout = 5000;

    @Override
    public String formatMessage(int connectionId, String now, long elapsed, String category, String prepared, String sql, String url) {
        if (StringUtils.isNotBlank(sql)) {
            String sqlInfo = "\n---# " + format.format(LocalDateTime.now()) + " | took " + elapsed + "ms | category " + category + " | connection " + connectionId
                    + "\n" + formatSql(sql) + ";";
            if (elapsed > slowQueryTimeout) {
                log.warn("此SQL查询时间为【" + elapsed + "】ms,超过5秒,请注意!!!");
            }
            return sqlInfo;
        }
        return null;
    }

    /**
     * 格式化SQL语句
     *
     * @param sql SQL语句
     * @return
     */
    private String formatSql(String sql) {
        try {
            sql = SqlUtil.formatSql(sql);
        } catch (Exception e) {
            log.warn("SQL语句格式化失败:" + sql);
        }
        return sql;
    }
}

