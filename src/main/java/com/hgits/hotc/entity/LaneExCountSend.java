package com.hgits.hotc.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class LaneExCountSend implements Serializable {

    private static final long serialVersionUID = 5981003629520619378L;

    private Integer netRoadID;

    private String roadID;

    private Integer roadNo;

    private String stationId;

    private Integer stationNo;

    private String laneID;

    private Integer laneNo;

    private Date countDate;

    private String etcTypeCount;

    private String etcClassCount;

    private Long etcSuccessCount;

    private Long etcFailCount;

    private String cpcTypeCount;

    private String cpcClassCount;

    private Long cpcSuccessCount;

    private Long cpcSuccessFee;

    private Long cpcFailCount;

    private Long cpcFailFee;

    private Long paperSuccessCount;

    private Long paperSuccessFee;

    private Long paperFailCount;

    private Long paperFailFee;

    private Integer spare1;

    private Integer spare2;

    private Integer spare3;

    private String spare4;

    private String spare5;

    private String spare6;
}
