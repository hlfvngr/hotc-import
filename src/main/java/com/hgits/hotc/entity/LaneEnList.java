package com.hgits.hotc.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class LaneEnList   {

    private static final long serialVersionUID = 1146026869313698723L;

    private String msgId;

    private Short enNetRoadId;

    private String enSectionId;

    private Short enRoadNo;

    private String enStationId;

    private Integer enStationNo;

    private String enTollLaneId;

    private Short enTollLaneNo;

    private String enTollLaneHex;

    private Byte enTollLaneType;

    private String loadGantryId;

    private Long enOperatorId;

    private String enOperatorName;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date squadDate;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date naturalDate;

    private Integer squadNo;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date squadOn;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date enTime;

    private String enVehicleId;

    private String enIdentifyVehicleId;

    private String enCardVehPlate;

    private Short enVehicleType;

    private Short enVehicleClass;

    private Short mediaType;

    private Short obuSign;

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

    private Short signStatus;

    private String specialType;

    private Long specialStatus;

    private Long proSpecialStatus;

    private String vehicleSignId;

    private String passId;

    private String enOpCardNo;

    private Long enOpCardId;

    private Byte enShiftId;

    private Integer cardBoxNo;

    private Integer cardTrunkNo;

    private String appVer;

    private Short vehCount;

    private Short isTest;

    private String vehicleSign;

    private Integer spare1;

    private Integer spare2;

    private Integer spare3;

    private String spare4;

    private String spare5;

    private String spare6;

    private Date squadStartDate;
    private Date squadEndDate;

    private String roadName;
    private String stationName;
    private String squadName;

    //合并字段
    private String mediaTypeText;
    private String enShiftIdText;
    private String enOperatorIdText;
    private String enVehicleTypeText;
    private String enVehicleClassText;
    private String enRoadNameText;
    private String enStationNameText;

    public String getEnRoadNameText() {
        if (null == enRoadNo || null == roadName) {
            return null;
        }
        return "[" + enRoadNo + "]" + roadName;
    }

    public String getEnStationNameText() {
        if (null == enStationNo || null == stationName) {
            return null;
        }
        return "[" + enStationNo + "]" + stationName;
    }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getMediaTypeText() {
        return mediaTypeText;
    }

    public void setMediaTypeText(String mediaTypeText) {
        this.mediaTypeText = mediaTypeText;
    }

    public String getEnShiftIdText() {
        return enShiftIdText;
    }

    public void setEnShiftIdText(String enShiftIdText) {
        this.enShiftIdText = enShiftIdText;
    }

    public String getEnOperatorIdText() {
        return enOperatorIdText;
    }

    public void setEnOperatorIdText(String enOperatorIdText) {
        this.enOperatorIdText = enOperatorIdText;
    }

    public String getEnVehicleTypeText() {
        return enVehicleTypeText;
    }

    public void setEnVehicleTypeText(String enVehicleTypeText) {
        this.enVehicleTypeText = enVehicleTypeText;
    }

    public String getEnVehicleClassText() {
        return enVehicleClassText;
    }

    public void setEnVehicleClassText(String enVehicleClassText) {
        this.enVehicleClassText = enVehicleClassText;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public Short getEnNetRoadId() {
        return enNetRoadId;
    }

    public void setEnNetRoadId(Short enNetRoadId) {
        this.enNetRoadId = enNetRoadId;
    }

    public String getEnSectionId() {
        return enSectionId;
    }

    public void setEnSectionId(String enSectionId) {
        this.enSectionId = enSectionId;
    }

    public Short getEnRoadNo() {
        return enRoadNo;
    }

    public void setEnRoadNo(Short enRoadNo) {
        this.enRoadNo = enRoadNo;
    }

    public String getEnStationId() {
        return enStationId;
    }

    public void setEnStationId(String enStationId) {
        this.enStationId = enStationId;
    }

    public Integer getEnStationNo() {
        return enStationNo;
    }

    public void setEnStationNo(Integer enStationNo) {
        this.enStationNo = enStationNo;
    }

    public String getEnTollLaneId() {
        return enTollLaneId;
    }

    public void setEnTollLaneId(String enTollLaneId) {
        this.enTollLaneId = enTollLaneId;
    }

    public Short getEnTollLaneNo() {
        return enTollLaneNo;
    }

    public void setEnTollLaneNo(Short enTollLaneNo) {
        this.enTollLaneNo = enTollLaneNo;
    }

    public String getEnTollLaneHex() {
        return enTollLaneHex;
    }

    public void setEnTollLaneHex(String enTollLaneHex) {
        this.enTollLaneHex = enTollLaneHex;
    }

    public Byte getEnTollLaneType() {
        return enTollLaneType;
    }

    public void setEnTollLaneType(Byte enTollLaneType) {
        this.enTollLaneType = enTollLaneType;
    }

    public String getLoadGantryId() {
        return loadGantryId;
    }

    public void setLoadGantryId(String loadGantryId) {
        this.loadGantryId = loadGantryId;
    }

    public Long getEnOperatorId() {
        return enOperatorId;
    }

    public void setEnOperatorId(Long enOperatorId) {
        this.enOperatorId = enOperatorId;
    }

    public String getEnOperatorName() {
        return enOperatorName;
    }

    public void setEnOperatorName(String enOperatorName) {
        this.enOperatorName = enOperatorName;
    }

    public Date getSquadDate() {
        return squadDate;
    }

    public void setSquadDate(Date squadDate) {
        this.squadDate = squadDate;
    }

    public Date getNaturalDate() {
        return naturalDate;
    }

    public void setNaturalDate(Date naturalDate) {
        this.naturalDate = naturalDate;
    }

    public Integer getSquadNo() {
        return squadNo;
    }

    public void setSquadNo(Integer squadNo) {
        this.squadNo = squadNo;
    }

    public Date getSquadOn() {
        return squadOn;
    }

    public void setSquadOn(Date squadOn) {
        this.squadOn = squadOn;
    }

    public Date getEnTime() {
        return enTime;
    }

    public void setEnTime(Date enTime) {
        this.enTime = enTime;
    }

    public String getEnVehicleId() {
        return enVehicleId;
    }

    public void setEnVehicleId(String enVehicleId) {
        this.enVehicleId = enVehicleId;
    }

    public String getEnIdentifyVehicleId() {
        return enIdentifyVehicleId;
    }

    public void setEnIdentifyVehicleId(String enIdentifyVehicleId) {
        this.enIdentifyVehicleId = enIdentifyVehicleId;
    }

    public String getEnCardVehPlate() {
        return enCardVehPlate;
    }

    public void setEnCardVehPlate(String enCardVehPlate) {
        this.enCardVehPlate = enCardVehPlate;
    }

    public Short getEnVehicleType() {
        return enVehicleType;
    }

    public void setEnVehicleType(Short enVehicleType) {
        this.enVehicleType = enVehicleType;
    }

    public Short getEnVehicleClass() {
        return enVehicleClass;
    }

    public void setEnVehicleClass(Short enVehicleClass) {
        this.enVehicleClass = enVehicleClass;
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

    public String getTerminalTransNo() {
        return terminalTransNo;
    }

    public void setTerminalTransNo(String terminalTransNo) {
        this.terminalTransNo = terminalTransNo;
    }

    public String getObuId() {
        return obuId;
    }

    public void setObuId(String obuId) {
        this.obuId = obuId;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getTac() {
        return tac;
    }

    public void setTac(String tac) {
        this.tac = tac;
    }

    public Long getTransFee() {
        return transFee;
    }

    public void setTransFee(Long transFee) {
        this.transFee = transFee;
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

    public Long getEnWeight() {
        return enWeight;
    }

    public void setEnWeight(Long enWeight) {
        this.enWeight = enWeight;
    }

    public Integer getEnAxleCount() {
        return enAxleCount;
    }

    public void setEnAxleCount(Integer enAxleCount) {
        this.enAxleCount = enAxleCount;
    }

    public Integer getElectricalPercentage() {
        return electricalPercentage;
    }

    public void setElectricalPercentage(Integer electricalPercentage) {
        this.electricalPercentage = electricalPercentage;
    }

    public Short getSignStatus() {
        return signStatus;
    }

    public void setSignStatus(Short signStatus) {
        this.signStatus = signStatus;
    }

    public String getSpecialType() {
        return specialType;
    }

    public void setSpecialType(String specialType) {
        this.specialType = specialType;
    }

    public Long getSpecialStatus() {
        return specialStatus;
    }

    public void setSpecialStatus(Long specialStatus) {
        this.specialStatus = specialStatus;
    }

    public Long getProSpecialStatus() {
        return proSpecialStatus;
    }

    public void setProSpecialStatus(Long proSpecialStatus) {
        this.proSpecialStatus = proSpecialStatus;
    }

    public String getVehicleSignId() {
        return vehicleSignId;
    }

    public void setVehicleSignId(String vehicleSignId) {
        this.vehicleSignId = vehicleSignId;
    }

    public String getPassId() {
        return passId;
    }

    public void setPassId(String passId) {
        this.passId = passId;
    }

    public String getEnOpCardNo() {
        return enOpCardNo;
    }

    public void setEnOpCardNo(String enOpCardNo) {
        this.enOpCardNo = enOpCardNo;
    }

    public Long getEnOpCardId() {
        return enOpCardId;
    }

    public void setEnOpCardId(Long enOpCardId) {
        this.enOpCardId = enOpCardId;
    }

    public Byte getEnShiftId() {
        return enShiftId;
    }

    public void setEnShiftId(Byte enShiftId) {
        this.enShiftId = enShiftId;
    }

    public Integer getCardBoxNo() {
        return cardBoxNo;
    }

    public void setCardBoxNo(Integer cardBoxNo) {
        this.cardBoxNo = cardBoxNo;
    }

    public Integer getCardTrunkNo() {
        return cardTrunkNo;
    }

    public void setCardTrunkNo(Integer cardTrunkNo) {
        this.cardTrunkNo = cardTrunkNo;
    }

    public String getAppVer() {
        return appVer;
    }

    public void setAppVer(String appVer) {
        this.appVer = appVer;
    }

    public Short getVehCount() {
        return vehCount;
    }

    public void setVehCount(Short vehCount) {
        this.vehCount = vehCount;
    }

    public Short getIsTest() {
        return isTest;
    }

    public void setIsTest(Short isTest) {
        this.isTest = isTest;
    }

    public String getVehicleSign() {
        return vehicleSign;
    }

    public void setVehicleSign(String vehicleSign) {
        this.vehicleSign = vehicleSign;
    }

    public Integer getSpare1() {
        return spare1;
    }

    public void setSpare1(Integer spare1) {
        this.spare1 = spare1;
    }

    public Integer getSpare2() {
        return spare2;
    }

    public void setSpare2(Integer spare2) {
        this.spare2 = spare2;
    }

    public Integer getSpare3() {
        return spare3;
    }

    public void setSpare3(Integer spare3) {
        this.spare3 = spare3;
    }

    public String getSpare4() {
        return spare4;
    }

    public void setSpare4(String spare4) {
        this.spare4 = spare4;
    }

    public String getSpare5() {
        return spare5;
    }

    public void setSpare5(String spare5) {
        this.spare5 = spare5;
    }

    public String getSpare6() {
        return spare6;
    }

    public void setSpare6(String spare6) {
        this.spare6 = spare6;
    }

    public Date getSquadStartDate() {
        return squadStartDate;
    }

    public void setSquadStartDate(Date squadStartDate) {
        this.squadStartDate = squadStartDate;
    }

    public Date getSquadEndDate() {
        return squadEndDate;
    }

    public void setSquadEndDate(Date squadEndDate) {
        this.squadEndDate = squadEndDate;
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

    public String getSquadName() {
        return squadName;
    }

    public void setSquadName(String squadName) {
        this.squadName = squadName;
    }


}