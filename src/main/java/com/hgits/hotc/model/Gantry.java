package com.hgits.hotc.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 文件名称(File Name)：Gantry
 * 功能描述(Description)：此模块的功能描述与大概流程说明
 * 数据表(Tables)：本文件中所操作过的数据表
 * 作者(Author)：  zerro
 * 日期(Create Date)：2020/2/24
 * 修改记录(Revision History)：
 */
@Data
@Table(name = "dfs_gantry")
public class Gantry implements Serializable {
    private static final long serialVersionUID = -7790334862410409053L;

    @Id
    @Column(name = "GantryId")
    private String gantryId;

    @Column(name = "GantryHex")
    private String gantryHex;

    @Column(name = "ChargeUnit")
    private String chargeUnit;
}
