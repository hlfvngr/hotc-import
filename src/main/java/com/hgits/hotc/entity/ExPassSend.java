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
@Table(name = "tb_ExPass_Recv")
public class ExPassSend implements Serializable {

    private static final long serialVersionUID = -871767804906136301L;

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

    private Integer obuSign;

    private String terminalTransNo;

    private String obuId;

    private String cardId;

    private String tac;

    private Long transFee;

    private Integer etcCardType;

    private String transType;

    private Integer exWeight;

    private Integer exAxleCount;

    private Long passSpeed;

    private Integer electricalPercentage;

    private Integer signStatus;

    private String description;

    private String specialType;

    private Long specialStatus;

    private Long proSpecialStatus;

    private String vehicleSignId;

    private String passId;

    private String terminalNo;

    private Integer vehCount;

    private String appVer;

    private Integer isTest;

    private String vehicleSign;

    private Integer spare1;

    private Integer spare2;

    private Integer spare3;

    private String spare4;

    private String spare5;

    private String spare6;
}
