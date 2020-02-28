package com.hgits.hotc.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class DataPointSumSend implements Serializable {

    private static final long serialVersionUID = -2680207796889109948L;

    private String collectId;

    private Integer dataPointType;

    private Integer dataType;

    private String dataDate;

    private String dataHourBatch;

    private Long dataSum;

    private Integer netRoadId;

    private String sectionId;

    private Integer roadNo;

    private String dataPointID;

    private Integer spare1;

    private Integer spare2;

    private Integer spare3;

    private String spare4;

    private String spare5;

    private String spare6;
}
