package com.hgits.hotc.entity;


import java.util.Date;

public class GantryTrans {
    private String msgId;

    private String tradeId;

    private String gantryId;

    private Short computerOrder;

    private String hourBatchNo;

    private Integer gantryOrderNum;

    private String gantryHex;

    private String gantryHexOpposite;

    private String transTime;

    private Long payFee;

    private Long fee;

    private Long discountFee;

    private Long transFee;

    private Short mediaType;

    private Short obuSign;

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

    private Short serviceType;

    private Short algorithmIdentifier;

    private String keyVersion;

    private Integer antennaId;

    private String rateVersion;

    private Integer consumeTime;

    private Short passState;

    private String enTollLaneId;

    private String enTollStationHex;

    private String enTime;

    private String enLaneType;

    private String passId;

    private String lastGantryHex;

    private String lastGantryTime;

    private String obuMac;

    private String obuIssueId;

    private String obuSn;

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

    private String cpuNetId;

    private String cpuIssueId;

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

    private Short interruptSignal;

    private String vehiclePicId;

    private String vehicleTailPicId;

    private Short matchStatus;

    private Short validStatus;

    private Short dealStatus;

    private String relatedTradeId;

    private String allRelatedTradeId;

    private String stationDBTime;

    private String stationDealTime;

    private String stationValidTime;

    private String stationMatchTime;

    private String vehicleSign;

    private Date squadDate;

    private Byte shiftId;

    private Short roadId;

    private Integer stationId;

    private Date tranStartDate;
    private Date tranEndDate;

    //复合字段
    private String roadName;
    private String stationName;

    private String computerOrderText;
    private String mediaTypeText;
    private String obuSignText;
    private String vehiclePlateText;
    private String cpuVehiclePlateText;
    private String obuVehiclePlateText;
    private String vehicleTypeText;
    private String identifyVehicleTypeText;
    private String cpuVehicleTypeText;
    private String obuVehicleTypeText;
    private String vehicleClassText;
    private String transTypeText;
    private String serviceTypeText;
    private String algorithmIdentifierText;
    private String passStateText;
    private String enLaneTypeText;
    private String vehicleUserTypeText;
    private String cpuCardTypeText;
    private String feeCalcResultText;
    private String holidayStateText;
    private String tradeResultText;
    private String interruptSignalText;
    private String validStatusText;
    private String matchStatusText;
    private String dealStatusText;
    private String payFeeText;
    private String feeText;
    private String discountFeeText;
    private String transFeeText;
    private String payFeeGroupText;
    private String feeGroupText;
    private String discountFeeGroupText;
    private String balanceBeforeText;
    private String balanceAfterText;
    private String feeSumLocalBeforeText;
    private String feeSumLocalAfterText;
    private String consumeTimeText;
    private String obuElectricalText;
    private String obuStartDateText;
    private String obuEndDateText;
    private String vehicleSeatText;
    private String axleCountText;
    private String totalWeightText;
    private String vehicleLengthText;
    private String vehicleWidthText;
    private String vehicleHightText;
    private String cpuStartDateText;
    private String cpuEndDateText;
    private String cpuVersionText;
    private String gantryPassInfoText;
    private String gantryOrderNumText;
    private String transNoText;

    public String getComputerOrderText() {
        return computerOrderText;
    }

    public void setComputerOrderText(String computerOrderText) {
        this.computerOrderText = computerOrderText;
    }

    public String getMediaTypeText() {
        return mediaTypeText;
    }

    public void setMediaTypeText(String mediaTypeText) {
        this.mediaTypeText = mediaTypeText;
    }

    public String getObuSignText() {
        return obuSignText;
    }

    public void setObuSignText(String obuSignText) {
        this.obuSignText = obuSignText;
    }

    public String getVehiclePlateText() {
        return vehiclePlateText;
    }

    public void setVehiclePlateText(String vehiclePlateText) {
        this.vehiclePlateText = vehiclePlateText;
    }



    public String getCpuVehiclePlateText() {
        return cpuVehiclePlateText;
    }

    public void setCpuVehiclePlateText(String cpuVehiclePlateText) {
        this.cpuVehiclePlateText = cpuVehiclePlateText;
    }

    public String getObuVehiclePlateText() {
        return obuVehiclePlateText;
    }

    public void setObuVehiclePlateText(String obuVehiclePlateText) {
        this.obuVehiclePlateText = obuVehiclePlateText;
    }

    public String getVehicleTypeText() {
        return vehicleTypeText;
    }

    public void setVehicleTypeText(String vehicleTypeText) {
        this.vehicleTypeText = vehicleTypeText;
    }

    public String getIdentifyVehicleTypeText() {
        return identifyVehicleTypeText;
    }

    public void setIdentifyVehicleTypeText(String identifyVehicleTypeText) {
        this.identifyVehicleTypeText = identifyVehicleTypeText;
    }

    public String getCpuVehicleTypeText() {
        return cpuVehicleTypeText;
    }

    public void setCpuVehicleTypeText(String cpuVehicleTypeText) {
        this.cpuVehicleTypeText = cpuVehicleTypeText;
    }

    public String getObuVehicleTypeText() {
        return obuVehicleTypeText;
    }

    public void setObuVehicleTypeText(String obuVehicleTypeText) {
        this.obuVehicleTypeText = obuVehicleTypeText;
    }

    public String getVehicleClassText() {
        return vehicleClassText;
    }

    public void setVehicleClassText(String vehicleClassText) {
        this.vehicleClassText = vehicleClassText;
    }

    public String getTransTypeText() {
        return transTypeText;
    }

    public void setTransTypeText(String transTypeText) {
        this.transTypeText = transTypeText;
    }

    public String getServiceTypeText() {
        return serviceTypeText;
    }

    public void setServiceTypeText(String serviceTypeText) {
        this.serviceTypeText = serviceTypeText;
    }

    public String getAlgorithmIdentifierText() {
        return algorithmIdentifierText;
    }

    public void setAlgorithmIdentifierText(String algorithmIdentifierText) {
        this.algorithmIdentifierText = algorithmIdentifierText;
    }

    public String getPassStateText() {
        return passStateText;
    }

    public void setPassStateText(String passStateText) {
        this.passStateText = passStateText;
    }

    public String getEnLaneTypeText() {
        return enLaneTypeText;
    }

    public void setEnLaneTypeText(String enLaneTypeText) {
        this.enLaneTypeText = enLaneTypeText;
    }

    public String getVehicleUserTypeText() {
        return vehicleUserTypeText;
    }

    public void setVehicleUserTypeText(String vehicleUserTypeText) {
        this.vehicleUserTypeText = vehicleUserTypeText;
    }

    public String getCpuCardTypeText() {
        return cpuCardTypeText;
    }

    public void setCpuCardTypeText(String cpuCardTypeText) {
        this.cpuCardTypeText = cpuCardTypeText;
    }

    public String getFeeCalcResultText() {
        return feeCalcResultText;
    }

    public void setFeeCalcResultText(String feeCalcResultText) {
        this.feeCalcResultText = feeCalcResultText;
    }

    public String getHolidayStateText() {
        return holidayStateText;
    }

    public void setHolidayStateText(String holidayStateText) {
        this.holidayStateText = holidayStateText;
    }

    public String getTradeResultText() {
        return tradeResultText;
    }

    public void setTradeResultText(String tradeResultText) {
        this.tradeResultText = tradeResultText;
    }

    public String getInterruptSignalText() {
        return interruptSignalText;
    }

    public void setInterruptSignalText(String interruptSignalText) {
        this.interruptSignalText = interruptSignalText;
    }

    public String getValidStatusText() {
        return validStatusText;
    }

    public void setValidStatusText(String validStatusText) {
        this.validStatusText = validStatusText;
    }

    public String getMatchStatusText() {
        return matchStatusText;
    }

    public void setMatchStatusText(String matchStatusText) {
        this.matchStatusText = matchStatusText;
    }

    public String getDealStatusText() {
        return dealStatusText;
    }

    public void setDealStatusText(String dealStatusText) {
        this.dealStatusText = dealStatusText;
    }


    public String getPayFeeText() {
        return payFeeText;
    }

    public void setPayFeeText(String payFeeText) {
        this.payFeeText = payFeeText;
    }

    public String getFeeText() {
        return feeText;
    }

    public void setFeeText(String feeText) {
        this.feeText = feeText;
    }

    public String getDiscountFeeText() {
        return discountFeeText;
    }

    public void setDiscountFeeText(String discountFeeText) {
        this.discountFeeText = discountFeeText;
    }

    public String getTransFeeText() {
        return transFeeText;
    }

    public void setTransFeeText(String transFeeText) {
        this.transFeeText = transFeeText;
    }

    public String getPayFeeGroupText() {
        return payFeeGroupText;
    }

    public void setPayFeeGroupText(String payFeeGroupText) {
        this.payFeeGroupText = payFeeGroupText;
    }

    public String getFeeGroupText() {
        return feeGroupText;
    }

    public void setFeeGroupText(String feeGroupText) {
        this.feeGroupText = feeGroupText;
    }

    public String getDiscountFeeGroupText() {
        return discountFeeGroupText;
    }

    public void setDiscountFeeGroupText(String discountFeeGroupText) {
        this.discountFeeGroupText = discountFeeGroupText;
    }

    public String getBalanceBeforeText() {
        return balanceBeforeText;
    }

    public void setBalanceBeforeText(String balanceBeforeText) {
        this.balanceBeforeText = balanceBeforeText;
    }

    public String getBalanceAfterText() {
        return balanceAfterText;
    }

    public void setBalanceAfterText(String balanceAfterText) {
        this.balanceAfterText = balanceAfterText;
    }

    public String getFeeSumLocalBeforeText() {
        return feeSumLocalBeforeText;
    }

    public void setFeeSumLocalBeforeText(String feeSumLocalBeforeText) {
        this.feeSumLocalBeforeText = feeSumLocalBeforeText;
    }

    public String getFeeSumLocalAfterText() {
        return feeSumLocalAfterText;
    }

    public void setFeeSumLocalAfterText(String feeSumLocalAfterText) {
        this.feeSumLocalAfterText = feeSumLocalAfterText;
    }

    public String getConsumeTimeText() {
        return consumeTimeText;
    }

    public void setConsumeTimeText(String consumeTimeText) {
        this.consumeTimeText = consumeTimeText;
    }

    public String getObuElectricalText() {
        return obuElectricalText;
    }

    public void setObuElectricalText(String obuElectricalText) {
        this.obuElectricalText = obuElectricalText;
    }

    public String getObuStartDateText() {
        return obuStartDateText;
    }

    public void setObuStartDateText(String obuStartDateText) {
        this.obuStartDateText = obuStartDateText;
    }

    public String getObuEndDateText() {
        return obuEndDateText;
    }

    public void setObuEndDateText(String obuEndDateText) {
        this.obuEndDateText = obuEndDateText;
    }

    public String getVehicleSeatText() {
        return vehicleSeatText;
    }

    public void setVehicleSeatText(String vehicleSeatText) {
        this.vehicleSeatText = vehicleSeatText;
    }

    public String getAxleCountText() {
        return axleCountText;
    }

    public void setAxleCountText(String axleCountText) {
        this.axleCountText = axleCountText;
    }

    public String getTotalWeightText() {
        return totalWeightText;
    }

    public void setTotalWeightText(String totalWeightText) {
        this.totalWeightText = totalWeightText;
    }

    public String getVehicleLengthText() {
        return vehicleLengthText;
    }

    public void setVehicleLengthText(String vehicleLengthText) {
        this.vehicleLengthText = vehicleLengthText;
    }

    public String getVehicleWidthText() {
        return vehicleWidthText;
    }

    public void setVehicleWidthText(String vehicleWidthText) {
        this.vehicleWidthText = vehicleWidthText;
    }

    public String getVehicleHightText() {
        return vehicleHightText;
    }

    public void setVehicleHightText(String vehicleHightText) {
        this.vehicleHightText = vehicleHightText;
    }

    public String getCpuStartDateText() {
        return cpuStartDateText;
    }

    public void setCpuStartDateText(String cpuStartDateText) {
        this.cpuStartDateText = cpuStartDateText;
    }

    public String getCpuEndDateText() {
        return cpuEndDateText;
    }

    public void setCpuEndDateText(String cpuEndDateText) {
        this.cpuEndDateText = cpuEndDateText;
    }

    public String getCpuVersionText() {
        return cpuVersionText;
    }

    public void setCpuVersionText(String cpuVersionText) {
        this.cpuVersionText = cpuVersionText;
    }

    public String getGantryPassInfoText() {
        return gantryPassInfoText;
    }

    public void setGantryPassInfoText(String gantryPassInfoText) {
        this.gantryPassInfoText = gantryPassInfoText;
    }

    public String getGantryOrderNumText() {
        return gantryOrderNumText;
    }

    public void setGantryOrderNumText(String gantryOrderNumText) {
        this.gantryOrderNumText = gantryOrderNumText;
    }

    public String getTransNoText() {
        return transNoText;
    }

    public void setTransNoText(String transNoText) {
        this.transNoText = transNoText;
    }


    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getGantryId() {
        return gantryId;
    }

    public void setGantryId(String gantryId) {
        this.gantryId = gantryId;
    }

    public Short getComputerOrder() {
        return computerOrder;
    }

    public void setComputerOrder(Short computerOrder) {
        this.computerOrder = computerOrder;
    }

    public String getHourBatchNo() {
        return hourBatchNo;
    }

    public void setHourBatchNo(String hourBatchNo) {
        this.hourBatchNo = hourBatchNo;
    }

    public Integer getGantryOrderNum() {
        return gantryOrderNum;
    }

    public void setGantryOrderNum(Integer gantryOrderNum) {
        this.gantryOrderNum = gantryOrderNum;
    }

    public String getGantryHex() {
        return gantryHex;
    }

    public void setGantryHex(String gantryHex) {
        this.gantryHex = gantryHex;
    }

    public String getGantryHexOpposite() {
        return gantryHexOpposite;
    }

    public void setGantryHexOpposite(String gantryHexOpposite) {
        this.gantryHexOpposite = gantryHexOpposite;
    }

    public String getTransTime() {
        return transTime;
    }

    public void setTransTime(String transTime) {
        this.transTime = transTime;
    }

    public Long getPayFee() {
        return payFee;
    }

    public void setPayFee(Long payFee) {
        this.payFee = payFee;
    }

    public Long getFee() {
        return fee;
    }

    public void setFee(Long fee) {
        this.fee = fee;
    }

    public Long getDiscountFee() {
        return discountFee;
    }

    public void setDiscountFee(Long discountFee) {
        this.discountFee = discountFee;
    }

    public Long getTransFee() {
        return transFee;
    }

    public void setTransFee(Long transFee) {
        this.transFee = transFee;
    }

    public Short getMediaType() {
        return mediaType;
    }

    public void setMediaType(Short mediaType) {
        this.mediaType = mediaType;
    }

    public Short getObuSign() {
        return obuSign;
    }

    public void setObuSign(Short obuSign) {
        this.obuSign = obuSign;
    }

    public String getTollIntervalId() {
        return tollIntervalId;
    }

    public void setTollIntervalId(String tollIntervalId) {
        this.tollIntervalId = tollIntervalId;
    }

    public String getPayFeeGroup() {
        return payFeeGroup;
    }

    public void setPayFeeGroup(String payFeeGroup) {
        this.payFeeGroup = payFeeGroup;
    }

    public String getFeeGroup() {
        return feeGroup;
    }

    public void setFeeGroup(String feeGroup) {
        this.feeGroup = feeGroup;
    }

    public String getDiscountFeeGroup() {
        return discountFeeGroup;
    }

    public void setDiscountFeeGroup(String discountFeeGroup) {
        this.discountFeeGroup = discountFeeGroup;
    }

    public String getVehiclePlate() {
        return vehiclePlate;
    }

    public void setVehiclePlate(String vehiclePlate) {
        this.vehiclePlate = vehiclePlate;
    }

    public Integer getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(Integer vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Integer getIdentifyVehicleType() {
        return identifyVehicleType;
    }

    public void setIdentifyVehicleType(Integer identifyVehicleType) {
        this.identifyVehicleType = identifyVehicleType;
    }

    public Integer getVehicleClass() {
        return vehicleClass;
    }

    public void setVehicleClass(Integer vehicleClass) {
        this.vehicleClass = vehicleClass;
    }

    public String getTac() {
        return tac;
    }

    public void setTac(String tac) {
        this.tac = tac;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getTerminalNo() {
        return terminalNo;
    }

    public void setTerminalNo(String terminalNo) {
        this.terminalNo = terminalNo;
    }

    public String getTerminalTransNo() {
        return terminalTransNo;
    }

    public void setTerminalTransNo(String terminalTransNo) {
        this.terminalTransNo = terminalTransNo;
    }

    public Integer getTransNo() {
        return transNo;
    }

    public void setTransNo(Integer transNo) {
        this.transNo = transNo;
    }

    public Short getServiceType() {
        return serviceType;
    }

    public void setServiceType(Short serviceType) {
        this.serviceType = serviceType;
    }

    public Short getAlgorithmIdentifier() {
        return algorithmIdentifier;
    }

    public void setAlgorithmIdentifier(Short algorithmIdentifier) {
        this.algorithmIdentifier = algorithmIdentifier;
    }

    public String getKeyVersion() {
        return keyVersion;
    }

    public void setKeyVersion(String keyVersion) {
        this.keyVersion = keyVersion;
    }

    public Integer getAntennaId() {
        return antennaId;
    }

    public void setAntennaId(Integer antennaId) {
        this.antennaId = antennaId;
    }

    public String getRateVersion() {
        return rateVersion;
    }

    public void setRateVersion(String rateVersion) {
        this.rateVersion = rateVersion;
    }

    public Integer getConsumeTime() {
        return consumeTime;
    }

    public void setConsumeTime(Integer consumeTime) {
        this.consumeTime = consumeTime;
    }

    public Short getPassState() {
        return passState;
    }

    public void setPassState(Short passState) {
        this.passState = passState;
    }

    public String getEnTollLaneId() {
        return enTollLaneId;
    }

    public void setEnTollLaneId(String enTollLaneId) {
        this.enTollLaneId = enTollLaneId;
    }

    public String getEnTollStationHex() {
        return enTollStationHex;
    }

    public void setEnTollStationHex(String enTollStationHex) {
        this.enTollStationHex = enTollStationHex;
    }

    public String getEnTime() {
        return enTime;
    }

    public void setEnTime(String enTime) {
        this.enTime = enTime;
    }

    public String getEnLaneType() {
        return enLaneType;
    }

    public void setEnLaneType(String enLaneType) {
        this.enLaneType = enLaneType;
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getPassId() {
        return passId;
    }

    public void setPassId(String passId) {
        this.passId = passId;
    }

    public String getLastGantryHex() {
        return lastGantryHex;
    }

    public void setLastGantryHex(String lastGantryHex) {
        this.lastGantryHex = lastGantryHex;
    }

    public String getLastGantryTime() {
        return lastGantryTime;
    }

    public void setLastGantryTime(String lastGantryTime) {
        this.lastGantryTime = lastGantryTime;
    }

    public String getObuMac() {
        return obuMac;
    }

    public void setObuMac(String obuMac) {
        this.obuMac = obuMac;
    }

    public String getObuIssueId() {
        return obuIssueId;
    }

    public void setObuIssueId(String obuIssueId) {
        this.obuIssueId = obuIssueId;
    }

    public String getObuSn() {
        return obuSn;
    }

    public void setObuSn(String obuSn) {
        this.obuSn = obuSn;
    }

    public Integer getObuVersion() {
        return obuVersion;
    }

    public void setObuVersion(Integer obuVersion) {
        this.obuVersion = obuVersion;
    }

    public Integer getObuStartDate() {
        return obuStartDate;
    }

    public void setObuStartDate(Integer obuStartDate) {
        this.obuStartDate = obuStartDate;
    }

    public Integer getObuEndDate() {
        return obuEndDate;
    }

    public void setObuEndDate(Integer obuEndDate) {
        this.obuEndDate = obuEndDate;
    }

    public Integer getObuElectrical() {
        return obuElectrical;
    }

    public void setObuElectrical(Integer obuElectrical) {
        this.obuElectrical = obuElectrical;
    }

    public String getObuState() {
        return obuState;
    }

    public void setObuState(String obuState) {
        this.obuState = obuState;
    }

    public String getObuVehiclePlate() {
        return obuVehiclePlate;
    }

    public void setObuVehiclePlate(String obuVehiclePlate) {
        this.obuVehiclePlate = obuVehiclePlate;
    }

    public Integer getObuVehicleType() {
        return obuVehicleType;
    }

    public void setObuVehicleType(Integer obuVehicleType) {
        this.obuVehicleType = obuVehicleType;
    }

    public Integer getVehicleUserType() {
        return vehicleUserType;
    }

    public void setVehicleUserType(Integer vehicleUserType) {
        this.vehicleUserType = vehicleUserType;
    }

    public Integer getVehicleSeat() {
        return vehicleSeat;
    }

    public void setVehicleSeat(Integer vehicleSeat) {
        this.vehicleSeat = vehicleSeat;
    }

    public Integer getAxleCount() {
        return axleCount;
    }

    public void setAxleCount(Integer axleCount) {
        this.axleCount = axleCount;
    }

    public Integer getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(Integer totalWeight) {
        this.totalWeight = totalWeight;
    }

    public Integer getVehicleLength() {
        return vehicleLength;
    }

    public void setVehicleLength(Integer vehicleLength) {
        this.vehicleLength = vehicleLength;
    }

    public Integer getVehicleWidth() {
        return vehicleWidth;
    }

    public void setVehicleWidth(Integer vehicleWidth) {
        this.vehicleWidth = vehicleWidth;
    }

    public Integer getVehicleHight() {
        return vehicleHight;
    }

    public void setVehicleHight(Integer vehicleHight) {
        this.vehicleHight = vehicleHight;
    }

    public String getCpuNetId() {
        return cpuNetId;
    }

    public void setCpuNetId(String cpuNetId) {
        this.cpuNetId = cpuNetId;
    }

    public String getCpuIssueId() {
        return cpuIssueId;
    }

    public void setCpuIssueId(String cpuIssueId) {
        this.cpuIssueId = cpuIssueId;
    }

    public String getCpuVehiclePlate() {
        return cpuVehiclePlate;
    }

    public void setCpuVehiclePlate(String cpuVehiclePlate) {
        this.cpuVehiclePlate = cpuVehiclePlate;
    }

    public Integer getCpuVehicleType() {
        return cpuVehicleType;
    }

    public void setCpuVehicleType(Integer cpuVehicleType) {
        this.cpuVehicleType = cpuVehicleType;
    }

    public Integer getCpuStartDate() {
        return cpuStartDate;
    }

    public void setCpuStartDate(Integer cpuStartDate) {
        this.cpuStartDate = cpuStartDate;
    }

    public Integer getCpuEndDate() {
        return cpuEndDate;
    }

    public void setCpuEndDate(Integer cpuEndDate) {
        this.cpuEndDate = cpuEndDate;
    }

    public Integer getCpuVersion() {
        return cpuVersion;
    }

    public void setCpuVersion(Integer cpuVersion) {
        this.cpuVersion = cpuVersion;
    }

    public Integer getCpuCardType() {
        return cpuCardType;
    }

    public void setCpuCardType(Integer cpuCardType) {
        this.cpuCardType = cpuCardType;
    }

    public String getCpuCardId() {
        return cpuCardId;
    }

    public void setCpuCardId(String cpuCardId) {
        this.cpuCardId = cpuCardId;
    }

    public Long getBalanceBefore() {
        return balanceBefore;
    }

    public void setBalanceBefore(Long balanceBefore) {
        this.balanceBefore = balanceBefore;
    }

    public Long getBalanceAfter() {
        return balanceAfter;
    }

    public void setBalanceAfter(Long balanceAfter) {
        this.balanceAfter = balanceAfter;
    }

    public Integer getGantryPassCount() {
        return gantryPassCount;
    }

    public void setGantryPassCount(Integer gantryPassCount) {
        this.gantryPassCount = gantryPassCount;
    }

    public String getGantryPassInfo() {
        return gantryPassInfo;
    }

    public void setGantryPassInfo(String gantryPassInfo) {
        this.gantryPassInfo = gantryPassInfo;
    }

    public String getFeeProvInfo() {
        return feeProvInfo;
    }

    public void setFeeProvInfo(String feeProvInfo) {
        this.feeProvInfo = feeProvInfo;
    }

    public Long getFeeSumLocalBefore() {
        return feeSumLocalBefore;
    }

    public void setFeeSumLocalBefore(Long feeSumLocalBefore) {
        this.feeSumLocalBefore = feeSumLocalBefore;
    }

    public Long getFeeSumLocalAfter() {
        return feeSumLocalAfter;
    }

    public void setFeeSumLocalAfter(Long feeSumLocalAfter) {
        this.feeSumLocalAfter = feeSumLocalAfter;
    }

    public Integer getFeeCalcResult() {
        return feeCalcResult;
    }

    public void setFeeCalcResult(Integer feeCalcResult) {
        this.feeCalcResult = feeCalcResult;
    }

    public String getFeeInfo1() {
        return feeInfo1;
    }

    public void setFeeInfo1(String feeInfo1) {
        this.feeInfo1 = feeInfo1;
    }

    public String getFeeInfo2() {
        return feeInfo2;
    }

    public void setFeeInfo2(String feeInfo2) {
        this.feeInfo2 = feeInfo2;
    }

    public String getFeeInfo3() {
        return feeInfo3;
    }

    public void setFeeInfo3(String feeInfo3) {
        this.feeInfo3 = feeInfo3;
    }

    public Integer getHolidayState() {
        return holidayState;
    }

    public void setHolidayState(Integer holidayState) {
        this.holidayState = holidayState;
    }

    public Integer getTradeResult() {
        return tradeResult;
    }

    public void setTradeResult(Integer tradeResult) {
        this.tradeResult = tradeResult;
    }

    public String getSpecialType() {
        return specialType;
    }

    public void setSpecialType(String specialType) {
        this.specialType = specialType;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public Short getInterruptSignal() {
        return interruptSignal;
    }

    public void setInterruptSignal(Short interruptSignal) {
        this.interruptSignal = interruptSignal;
    }

    public String getVehiclePicId() {
        return vehiclePicId;
    }

    public void setVehiclePicId(String vehiclePicId) {
        this.vehiclePicId = vehiclePicId;
    }

    public String getVehicleTailPicId() {
        return vehicleTailPicId;
    }

    public void setVehicleTailPicId(String vehicleTailPicId) {
        this.vehicleTailPicId = vehicleTailPicId;
    }

    public Short getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(Short matchStatus) {
        this.matchStatus = matchStatus;
    }

    public Short getValidStatus() {
        return validStatus;
    }

    public void setValidStatus(Short validStatus) {
        this.validStatus = validStatus;
    }

    public Short getDealStatus() {
        return dealStatus;
    }

    public void setDealStatus(Short dealStatus) {
        this.dealStatus = dealStatus;
    }

    public String getRelatedTradeId() {
        return relatedTradeId;
    }

    public void setRelatedTradeId(String relatedTradeId) {
        this.relatedTradeId = relatedTradeId;
    }

    public String getAllRelatedTradeId() {
        return allRelatedTradeId;
    }

    public void setAllRelatedTradeId(String allRelatedTradeId) {
        this.allRelatedTradeId = allRelatedTradeId;
    }

    public String getStationDBTime() {
        return stationDBTime;
    }

    public void setStationDBTime(String stationDBTime) {
        this.stationDBTime = stationDBTime;
    }

    public String getStationDealTime() {
        return stationDealTime;
    }

    public void setStationDealTime(String stationDealTime) {
        this.stationDealTime = stationDealTime;
    }

    public String getStationValidTime() {
        return stationValidTime;
    }

    public void setStationValidTime(String stationValidTime) {
        this.stationValidTime = stationValidTime;
    }

    public String getStationMatchTime() {
        return stationMatchTime;
    }

    public void setStationMatchTime(String stationMatchTime) {
        this.stationMatchTime = stationMatchTime;
    }

    public String getVehicleSign() {
        return vehicleSign;
    }

    public void setVehicleSign(String vehicleSign) {
        this.vehicleSign = vehicleSign;
    }

    public Date getSquadDate() {
        return squadDate;
    }

    public void setSquadDate(Date squadDate) {
        this.squadDate = squadDate;
    }

    public Byte getShiftId() {
        return shiftId;
    }

    public void setShiftId(Byte shiftId) {
        this.shiftId = shiftId;
    }

    public Short getRoadId() {
        return roadId;
    }

    public void setRoadId(Short roadId) {
        this.roadId = roadId;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public Date getTranStartDate() {
        return tranStartDate;
    }

    public void setTranStartDate(Date tranStartDate) {
        this.tranStartDate = tranStartDate;
    }

    public Date getTranEndDate() {
        return tranEndDate;
    }

    public void setTranEndDate(Date tranEndDate) {
        this.tranEndDate = tranEndDate;
    }

    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }
}