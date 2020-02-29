package com.hgits.hotc.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class GantryTransSend implements Serializable {

    private static final long serialVersionUID = 4220589053396152568L;

    private String msgId;

    private String tradeId;

    private String gantryId;

    private Integer computerOrder;

    private String hourBatchNo;

    private Integer gantryOrderNum;

    private String gantryHex;

    private String gantryHexOpposite;

    private String transTime;

    private Long payFee;

    private Long fee;

    private Long discountFee;

    private Long transFee;

    private Integer mediaType;

    private Integer obuSign;

    private String tollIntervalId;

    private String payFeeGroup;

    private String feeGroup;

    private String discountFeeGroup;

    private String vehiclePlate;

    private Integer vehicleType;

    private Integer identifyVehicleType;

    private Integer vehicleClass;

    private String tac;

    private String transType;

    private String terminalNo;

    private String terminalTransNo;

    private Integer transNo;

    private Integer serviceType;

    private Integer algorithmIdentifier;

    private String keyVersion;

    private Integer antennaId;

    private String rateVersion;

    private Long consumeTime;

    private Integer passState;

    private String enTollLaneId;

    private String enTollStationHex;

    private String enTime;

    private String enLaneType;

    private String passId;

    private String lastGantryHex;

    private String lastGantryTime;

    private String obuMac;

    private String obuIssueID;

    private String obuSN;

    private Integer obuVersion;

    private Integer obuStartDate;

    private Integer obuEndDate;

    private Integer obuElectrical;

    private String obuState;

    private String obuVehiclePlate;

    private Integer obuVehicleType;

    private Integer vehicleUserType;

    private Integer vehicleSeat;

    private Integer axleCount;

    private Integer totalWeight;

    private Integer vehicleLength;

    private Integer vehicleWidth;

    private Integer vehicleHight;

    private String cpuNetID;

    private String cpuIssueID;

    private String cpuVehiclePlate;

    private Integer cpuVehicleType;

    private Integer cpuStartDate;

    private Integer cpuEndDate;

    private Integer cpuVersion;

    private Integer cpuCardType;

    private String cpuCardId;

    private Long balanceBefore;

    private Long balanceAfter;

    private Integer gantryPassCount;

    private String gantryPassInfo;

    private String feeProvInfo;

    private Long feeSumLocalBefore;

    private Long feeSumLocalAfter;

    private Integer feeCalcResult;

    private String feeInfo1;

    private String feeInfo2;

    private String feeInfo3;

    private Integer holidayState;

    private Integer tradeResult;

    private String specialType;

    private String verifyCode;

    private Integer interruptSignal;

    private String vehiclePicId;

    private String vehicleTailPicId;

    private Integer matchStatus;

    private Integer validStatus;

    private Integer dealStatus;

    private String relatedTradeId;

    private String allRelatedTradeId;

    private String stationDBTime;

    private String stationDealTime;

    private String stationValidTime;

    private String stationMatchTime;

    private String vehicleSign;
}
