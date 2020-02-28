package com.hgits.hotc.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class VehIdInfo  {

    private String msgId;

    private String laneNum;

    private String vehicleId;

    private String tailVehicleId;

    private Integer vehSpeed;

    private Short identifyType;

    private String vehFeatureCode;

    private String faceFeatureCode;

    private String tollIntervalId;

    private Short netRoadId;

    private String sectionId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date squadDate;

    private Byte shiftId;

    private String matchedVehicleId;

    private String checkedVehicleId;

    private String cpcGantryPassId;

    private String etcGantryPassId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date passTime;

    private String passId;

    private Byte enExflag;

    private String enPassId;

    private String exPassId;

    private String exEtcTransId;

    private String otherTransId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date opTime;

    private Integer direction;

    private Integer spare1;

    private Integer spare2;

    private Integer spare3;

    private String vehiclePlate;

    private String spare4;

    private String spare5;

    private String spare6;

    private Short roadId;

    private Integer stationId;

    //复合字段
    private String roadName;
    private String squadName;
    private String identifyTypeText;
    private Date catchStartDate;
    private Date catchEndDate;

    public String getVehiclePlate() {
        return vehiclePlate;
    }

    public void setVehiclePlate(String vehiclePlate) {
        this.vehiclePlate = vehiclePlate;
    }

    public String getIdentifyTypeText() {
        return identifyTypeText;
    }

    public void setIdentifyTypeText(String identifyTypeText) {
        this.identifyTypeText = identifyTypeText;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getLaneNum() {
        return laneNum;
    }

    public void setLaneNum(String laneNum) {
        this.laneNum = laneNum;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getTailVehicleId() {
        return tailVehicleId;
    }

    public void setTailVehicleId(String tailVehicleId) {
        this.tailVehicleId = tailVehicleId;
    }

    public Integer getVehSpeed() {
        return vehSpeed;
    }

    public void setVehSpeed(Integer vehSpeed) {
        this.vehSpeed = vehSpeed;
    }

    public Short getIdentifyType() {
        return identifyType;
    }

    public void setIdentifyType(Short identifyType) {
        this.identifyType = identifyType;
    }

    public String getVehFeatureCode() {
        return vehFeatureCode;
    }

    public void setVehFeatureCode(String vehFeatureCode) {
        this.vehFeatureCode = vehFeatureCode;
    }

    public String getFaceFeatureCode() {
        return faceFeatureCode;
    }

    public void setFaceFeatureCode(String faceFeatureCode) {
        this.faceFeatureCode = faceFeatureCode;
    }

    public String getTollIntervalId() {
        return tollIntervalId;
    }

    public void setTollIntervalId(String tollIntervalId) {
        this.tollIntervalId = tollIntervalId;
    }

    public Short getNetRoadId() {
        return netRoadId;
    }

    public void setNetRoadId(Short netRoadId) {
        this.netRoadId = netRoadId;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
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

    public String getMatchedVehicleId() {
        return matchedVehicleId;
    }

    public void setMatchedVehicleId(String matchedVehicleId) {
        this.matchedVehicleId = matchedVehicleId;
    }

    public String getCheckedVehicleId() {
        return checkedVehicleId;
    }

    public void setCheckedVehicleId(String checkedVehicleId) {
        this.checkedVehicleId = checkedVehicleId;
    }

    public String getCpcGantryPassId() {
        return cpcGantryPassId;
    }

    public void setCpcGantryPassId(String cpcGantryPassId) {
        this.cpcGantryPassId = cpcGantryPassId;
    }

    public String getEtcGantryPassId() {
        return etcGantryPassId;
    }

    public void setEtcGantryPassId(String etcGantryPassId) {
        this.etcGantryPassId = etcGantryPassId;
    }

    public Date getPassTime() {
        return passTime;
    }

    public void setPassTime(Date passTime) {
        this.passTime = passTime;
    }

    public String getPassId() {
        return passId;
    }

    public void setPassId(String passId) {
        this.passId = passId;
    }

    public Byte getEnExflag() {
        return enExflag;
    }

    public void setEnExflag(Byte enExflag) {
        this.enExflag = enExflag;
    }

    public String getEnPassId() {
        return enPassId;
    }

    public void setEnPassId(String enPassId) {
        this.enPassId = enPassId;
    }

    public String getExPassId() {
        return exPassId;
    }

    public void setExPassId(String exPassId) {
        this.exPassId = exPassId;
    }

    public String getExEtcTransId() {
        return exEtcTransId;
    }

    public void setExEtcTransId(String exEtcTransId) {
        this.exEtcTransId = exEtcTransId;
    }

    public String getOtherTransId() {
        return otherTransId;
    }

    public void setOtherTransId(String otherTransId) {
        this.otherTransId = otherTransId;
    }

    public Date getOpTime() {
        return opTime;
    }

    public void setOpTime(Date opTime) {
        this.opTime = opTime;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
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

    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName;
    }

    public String getSquadName() {
        return squadName;
    }

    public void setSquadName(String squadName) {
        this.squadName = squadName;
    }

    public Date getCatchStartDate() {
        return catchStartDate;
    }

    public void setCatchStartDate(Date catchStartDate) {
        this.catchStartDate = catchStartDate;
    }

    public Date getCatchEndDate() {
        return catchEndDate;
    }

    public void setCatchEndDate(Date catchEndDate) {
        this.catchEndDate = catchEndDate;
    }
}