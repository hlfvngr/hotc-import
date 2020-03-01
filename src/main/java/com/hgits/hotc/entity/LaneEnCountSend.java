package com.hgits.hotc.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "tb_LaneEnCount_Recv")
public class LaneEnCountSend implements Serializable {

    private static final long serialVersionUID = -3555833844199803841L;

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

    private Long cpcCount;

    private Long paperCount;

    private Integer spare1;

    private Integer spare2;

    private Integer spare3;

    private String spare4;

    private String spare5;

    private String spare6;
}
