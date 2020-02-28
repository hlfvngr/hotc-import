package com.hgits.hotc.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @ClassName EnStationSummation
 * @Description
 * @Author lizurong
 * @Date 13:17 2019/9/7
 * @Version 1.0
 */
public class EnStationSummation  {

    private static final long serialVersionUID = 5945936463010064460L;

    private String id;
    private Date data;
    private Integer roadId;
    private Integer stationId;
    private String operatorId;
    private String operatorName;
    private String etcTypeCount;
    private String etcClassCount;
    private Long etcSuccessCount;
    private Long etcFailCount;
    private String cpcTypeCount;
    private String cpcClassCount;
    private Long cpcCount;
    private Long paperCount;
    private Date genTime;
    private String uploadResult;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Integer getRoadId() {
        return roadId;
    }

    public void setRoadId(Integer roadId) {
        this.roadId = roadId;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getEtcTypeCount() {
        return etcTypeCount;
    }

    public void setEtcTypeCount(String etcTypeCount) {
        this.etcTypeCount = etcTypeCount;
    }

    public String getEtcClassCount() {
        return etcClassCount;
    }

    public void setEtcClassCount(String etcClassCount) {
        this.etcClassCount = etcClassCount;
    }

    public Long getEtcSuccessCount() {
        return etcSuccessCount;
    }

    public void setEtcSuccessCount(Long etcSuccessCount) {
        this.etcSuccessCount = etcSuccessCount;
    }

    public Long getEtcFailCount() {
        return etcFailCount;
    }

    public void setEtcFailCount(Long etcFailCount) {
        this.etcFailCount = etcFailCount;
    }

    public String getCpcTypeCount() {
        return cpcTypeCount;
    }

    public void setCpcTypeCount(String cpcTypeCount) {
        this.cpcTypeCount = cpcTypeCount;
    }

    public String getCpcClassCount() {
        return cpcClassCount;
    }

    public void setCpcClassCount(String cpcClassCount) {
        this.cpcClassCount = cpcClassCount;
    }

    public Long getCpcCount() {
        return cpcCount;
    }

    public void setCpcCount(Long cpcCount) {
        this.cpcCount = cpcCount;
    }

    public Long getPaperCount() {
        return paperCount;
    }

    public void setPaperCount(Long paperCount) {
        this.paperCount = paperCount;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    public Date getGenTime() {
        return genTime;
    }

    public void setGenTime(Date genTime) {
        this.genTime = genTime;
    }



    public String getUploadResult() {
		return uploadResult;
	}

	public void setUploadResult(String uploadResult) {
		this.uploadResult = uploadResult;
	}
}
