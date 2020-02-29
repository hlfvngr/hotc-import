package com.hgits.hotc.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class ExEtcTransSend implements Serializable {

    private static final long serialVersionUID = 4910609124952161937L;

    private String msgId;

    private String id;

    private Integer enNetRoadID;

    private String enSectionId;

    private Integer enRoadNo;

    private String enStationId;

    private Integer enStationNo;

    private String enTollStationName;

    private String enTollLaneId;

    private Integer enTollLaneNo;

    private String enTollLaneHex;

    private Integer enTollLaneType;

    private Integer enOperatorID;

    private String enOperatorName;

    private Date enTime;

    private Integer enShiftID;

    private String enVehicleId;

    private Integer enVehicleClass;

    private Integer enVehicleType;

    private Integer enWeight;

    private Integer enAxleCount;

    private Integer exNetRoadID;

    private String exSectionId;

    private Integer exRoadNo;

    private String exStationID;

    private Integer exStationNo;

    private String exTollStationName;

    private String exTollLaneId;

    private Integer exTollLaneNo;

    private String exTollLaneHex;

    private Integer exTollLaneType;

    private String loadGantryId;

    private Date exTime;

    private Integer exOperatorID;

    private String exOperatorName;

    private String exOpCardNo;

    private Long exOpCardID;

    private Date squadDate;

    private Integer exShiftID;

    private Date naturalDate;

    private Integer squadNo;

    private Date squadOn;

    private String exVehicleId;

    private String exIdentifyVehicleId;

    private Integer exVehicleClass;

    private Integer exVehicleType;

    private String terminalTransNo;

    private String tac;

    private String transType;

    private Integer exWeight;

    private Integer exAxleCount;

    private Long passSpeed;

    private String description;

    private String specialType;

    private Long specialStatus;

    private Long proSpecialStatus;

    private String vehicleSignId;

    private String passId;

    private Integer identification;

    private Integer mediaType;

    private String mediaNo;

    private Integer payType;

    private String terminalNo;

    private Integer serviceType;

    private Integer algorithmIdentifier;

    private Integer multiProvince;

    private Integer detailCnt;

    private Integer vehCount;

    private Integer payFee;

    private Integer fee;

    private Long payCardBalanceBefore;

    private Long payCardBalanceAfter;

    private Integer discountFee;

    private Integer cardBoxNo;

    private Integer cardTrunkNo;

    private String appVer;

    private String exCPUCardSnNo;

    private Integer etcCardType;

    private String chargingIn;

    private Date sectionRequestTime;

    private Date sectionResponseTime;

    private Date proRequestTime;

    private Date proResponseTime;

    private String proReturnCode;

    private String proReturnMemo;

    private String proChargingVersion;

    private String priceVersionGroup;

    private String proChargingSN;

    private String minChargingSN;

    private Date minRequestTime;

    private Date minResponseTime;

    private String shortestPathVersion;

    private String disputeFlag;

    private String disputeResult;

    private String delPassGantrys;

    private String delVehInfoIds;

    private String delGantryPassIds;

    private String delTollIntervals;

    private String addPassGantrys;

    private String addTollIntervals;

    private Integer tollSupportDetails;

    private String chargingMac;

    private String passGantrys;

    private String splitProvince;

    private Integer isTest;

    private Integer spare1;

    private Integer spare2;

    private Integer spare3;

    private String spare4;

    private String spare5;

    private String spare6;
}
