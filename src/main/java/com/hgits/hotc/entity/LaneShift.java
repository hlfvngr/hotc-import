package com.hgits.hotc.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class LaneShift  {

    private Integer laneShiftSerialNum;

    private Short netRoadId;

    private String roadId;

    private Short roadNo;

    private String stationId;

    private Short stationNo;

    private String laneId;

    private Short laneNo;

    private Integer operatorId;

    private Byte operatorType;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date squadDate;

    private Byte shiftId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date beginShiftTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endShiftTime;

    private String invStartId;

    private String invEndId;

    private Integer invPrintCnt;

    private Integer badInVoiceCnt;

    private String cpcSnNo;

    private Long cpcInId;

    private Integer vehCnt;

    private Integer listCnt;

    private Integer totalMoney;

    private Byte endShiftFlag;

    private Short recordType;

    private Short listName;

    private Integer verifyCode;

    private Integer spare1;

    private Integer spare2;

    private String spare3;

    private String spare4;



    public Short getNetRoadId() {
        return netRoadId;
    }

    public void setNetRoadId(Short netRoadId) {
        this.netRoadId = netRoadId;
    }

    public String getRoadId() {
        return roadId;
    }

    public void setRoadId(String roadId) {
        this.roadId = roadId;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getLaneId() {
        return laneId;
    }

    public void setLaneId(String laneId) {
        this.laneId = laneId;
    }

    public Byte getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(Byte operatorType) {
        this.operatorType = operatorType;
    }

    public Date getSquadDate() {
        return squadDate;
    }

    public void setSquadDate(Date squadDate) {
        this.squadDate = squadDate;
    }

    public Date getEndShiftTime() {
        return endShiftTime;
    }

    public void setEndShiftTime(Date endShiftTime) {
        this.endShiftTime = endShiftTime;
    }

    public String getInvStartId() {
        return invStartId;
    }

    public void setInvStartId(String invStartId) {
        this.invStartId = invStartId;
    }

    public String getInvEndId() {
        return invEndId;
    }

    public void setInvEndId(String invEndId) {
        this.invEndId = invEndId;
    }

    public Integer getInvPrintCnt() {
        return invPrintCnt;
    }

    public void setInvPrintCnt(Integer invPrintCnt) {
        this.invPrintCnt = invPrintCnt;
    }

    public Integer getBadInVoiceCnt() {
        return badInVoiceCnt;
    }

    public void setBadInVoiceCnt(Integer badInVoiceCnt) {
        this.badInVoiceCnt = badInVoiceCnt;
    }

    public String getCpcSnNo() {
        return cpcSnNo;
    }

    public void setCpcSnNo(String cpcSnNo) {
        this.cpcSnNo = cpcSnNo;
    }

    public Long getCpcInId() {
        return cpcInId;
    }

    public void setCpcInId(Long cpcInId) {
        this.cpcInId = cpcInId;
    }

    public Integer getVehCnt() {
        return vehCnt;
    }

    public void setVehCnt(Integer vehCnt) {
        this.vehCnt = vehCnt;
    }

    public Integer getListCnt() {
        return listCnt;
    }

    public void setListCnt(Integer listCnt) {
        this.listCnt = listCnt;
    }

    public Integer getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Integer totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Byte getEndShiftFlag() {
        return endShiftFlag;
    }

    public void setEndShiftFlag(Byte endShiftFlag) {
        this.endShiftFlag = endShiftFlag;
    }

    public Short getRecordType() {
        return recordType;
    }

    public void setRecordType(Short recordType) {
        this.recordType = recordType;
    }

    public Short getListName() {
        return listName;
    }

    public void setListName(Short listName) {
        this.listName = listName;
    }

    public Integer getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(Integer verifyCode) {
        this.verifyCode = verifyCode;
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

    public String getSpare3() {
        return spare3;
    }

    public void setSpare3(String spare3) {
        this.spare3 = spare3;
    }

    public String getSpare4() {
        return spare4;
    }

    public void setSpare4(String spare4) {
        this.spare4 = spare4;
    }

    public Integer getLaneShiftSerialNum() {
        return laneShiftSerialNum;
    }

    public void setLaneShiftSerialNum(Integer laneShiftSerialNum) {
        this.laneShiftSerialNum = laneShiftSerialNum;
    }

    public Short getRoadNo() {
        return roadNo;
    }

    public void setRoadNo(Short roadNo) {
        this.roadNo = roadNo;
    }

    public Short getStationNo() {
        return stationNo;
    }

    public void setStationNo(Short stationNo) {
        this.stationNo = stationNo;
    }

    public Short getLaneNo() {
        return laneNo;
    }

    public void setLaneNo(Short laneNo) {
        this.laneNo = laneNo;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Byte getShiftId() {
        return shiftId;
    }

    public void setShiftId(Byte shiftId) {
        this.shiftId = shiftId;
    }

    public Date getBeginShiftTime() {
        return beginShiftTime;
    }

    public void setBeginShiftTime(Date beginShiftTime) {
        this.beginShiftTime = beginShiftTime;
    }



}