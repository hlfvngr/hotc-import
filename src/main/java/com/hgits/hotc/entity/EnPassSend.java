package com.hgits.hotc.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class EnPassSend implements Serializable {

    private static final long serialVersionUID = 18548013626999287L;

    private String msgId;

    private String id;

    private Integer enNetRoadID;

    private String enSectionId;

    private Integer enRoadNo;

    private String enStationId;

    private Integer enStationNo;

    private String enTollLaneId;

    private Integer enTollLaneNo;

    private String enTollLaneHex;

    private Integer enTollLaneType;

    private String loadGantryId;

    private Long enOperatorID;

    private String enOperatorName;

    private Date squadDate;

    private Date naturalDate;

    private Integer squadNo;

    private Date squadOn;

    private Date enTime;

    private String enVehicleId;

    private String enIdentifyVehicleId;

    private String enCardVehPlate;

    private Integer enVehicleType;

    private Integer enVehicleClass;

    private Integer mediaType;

    private Integer obuSign;

    private String terminalTransNo;

    private String obuId;

    private String cardId;

    private String tac;

    private Long transFee;

    private String transType;

    private String terminalNo;

    private Long enWeight;

    private Integer enAxleCount;

    private Integer electricalPercentage;

    private Integer signStatus;

    private String specialType;

    private Long specialStatus;

    private Long proSpecialStatus;

    private String vehicleSignId;

    private String passId;

    private String enOpCardNo;

    private Long enOpCardID;

    private Integer enShiftID;

    private Integer cardBoxNo;

    private Integer cardTrunkNo;

    private String appVer;

    private Integer vehCount;

    private Integer isTest;

    private String vehicleSign;

    private Integer spare1;

    private Integer spare2;

    private Integer spare3;

    private String spare4;

    private String spare5;

    private String spare6;
}
