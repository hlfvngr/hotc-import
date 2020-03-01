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
@Table(name = "tb_LaneShift_Recv")
public class LaneShiftSend implements Serializable {

    private static final long serialVersionUID = 2046543391479174843L;

    private Integer laneShiftSerialNum;

    private Integer netRoadID;

    private String roadID;

    private Integer roadNo;

    private String stationID;

    private Integer stationNo;

    private String laneID;

    private Integer laneNo;

    private Integer operatorID;

    private Integer operatorType;

    private String operatorName;

    private Date squadDate;

    private Integer shiftID;

    private Date beginShiftTime;

    private Date endShiftTime;

    private String invStartID;

    private String invEndID;

    private Integer invPrintCnt;

    private Integer badInVoiceCnt;

    private String cpcSnNo;

    private Long cpcInID;

    private Integer vehCnt;

    private Integer listCnt;

    private Integer totalMoney;

    private Integer endShiftFlag;

    private Integer recordType;

    private Integer listName;

    private Integer verifyCode;

    private Integer spare1;

    private Integer spare2;

    private String spare3;

    private String spare4;
}
