package com.hgits.hotc.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class VehIdInfoSend implements Serializable {

    private static final long serialVersionUID = -42190583101148479L;

    private String msgId;

    private String id;

    private String laneNum;

    private String vehicleId;

    private String tailVehicleId;

    private Integer vehSpeed;

    private Integer identifyType;

    private String vehFeatureCode;

    private String faceFeatureCode;

    private String tollIntervalId;

    private Integer netRoadId;

    private String sectionId;

    private Date squadDate;

    private Date createTime;

    private String matchedVehicleId;

    private String checkedVehicleId;

    private String cpcGantryPassId;

    private String etcGantryPassId;

    private Date passTime;

    private String passId;

    private Integer enExflag;

    private String enPassId;

    private String exPassId;

    private String exEtcTransId;

    private String otherTransId;

    private Date opTime;

    private Integer direction;

    private Integer spare1;

    private Integer spare2;

    private Integer spare3;

    private String spare4;

    private String spare5;

    private String spare6;
}
