package com.huayanginfo.dubbo.model;

import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author wangrd 北京华洋峻峰信息工程股份公司
 * https://www.huayanginfo.com ©2008-2021 huayanginfo.com
 * All Rights Reserved.
 * @since 2021年07月06日 星期二 11:39:27
 */
@Data
@Accessors(chain = true)
@GenericGenerator(name = "jpa-uuid", strategy = "org.hibernate.id.UUIDGenerator")
@Entity
@Table(appliesTo = "jdp_sys_calendar")
public class JdpSysCalendar implements Serializable {
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    private String calendarId;

    private LocalDate calendarDate;

    private boolean calendarType;

    private LocalDateTime initDate;

    private LocalDateTime modifyDate;
}
