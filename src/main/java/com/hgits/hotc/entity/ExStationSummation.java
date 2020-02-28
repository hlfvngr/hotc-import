package com.hgits.hotc.entity;


import java.util.Date;

/**
 * @ClassName ExStationSummation
 * @Description
 * @Author lizurong
 * @Date 13:20 2019/9/7
 * @Version 1.0
 */
public class ExStationSummation  {

    private static final long serialVersionUID = -1908203217923092003L;

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
    private Long cpcSuccessCount;
    private Long cpcSuccessFee;
    private Long cpcFailCount;
    private Long cpcFailFee;
    private Long paperSuccessCount;
    private Long paperSuccessFee;
    private Long paperFailCount;
    private Long paperFailFee;
    private Long etcFieldReplayCount;
    private Long etcFieldReplayFee;
    private Date genTime;
    private String uploadResult;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public Long getCpcSuccessCount() {
        return cpcSuccessCount;
    }

    public void setCpcSuccessCount(Long cpcSuccessCount) {
        this.cpcSuccessCount = cpcSuccessCount;
    }

    public Long getCpcSuccessFee() {
        return cpcSuccessFee;
    }

    public void setCpcSuccessFee(Long cpcSuccessFee) {
        this.cpcSuccessFee = cpcSuccessFee;
    }

    public Long getCpcFailCount() {
        return cpcFailCount;
    }

    public void setCpcFailCount(Long cpcFailCount) {
        this.cpcFailCount = cpcFailCount;
    }

    public Long getCpcFailFee() {
        return cpcFailFee;
    }

    public void setCpcFailFee(Long cpcFailFee) {
        this.cpcFailFee = cpcFailFee;
    }

    public Long getPaperSuccessCount() {
        return paperSuccessCount;
    }

    public void setPaperSuccessCount(Long paperSuccessCount) {
        this.paperSuccessCount = paperSuccessCount;
    }

    public Long getPaperSuccessFee() {
        return paperSuccessFee;
    }

    public void setPaperSuccessFee(Long paperSuccessFee) {
        this.paperSuccessFee = paperSuccessFee;
    }

    public Long getPaperFailCount() {
        return paperFailCount;
    }

    public void setPaperFailCount(Long paperFailCount) {
        this.paperFailCount = paperFailCount;
    }

    public Long getPaperFailFee() {
        return paperFailFee;
    }

    public void setPaperFailFee(Long paperFailFee) {
        this.paperFailFee = paperFailFee;
    }

    public Long getEtcFieldReplayCount() {
        return etcFieldReplayCount;
    }

    public void setEtcFieldReplayCount(Long etcFieldReplayCount) {
        this.etcFieldReplayCount = etcFieldReplayCount;
    }

    public Long getEtcFieldReplayFee() {
        return etcFieldReplayFee;
    }

    public void setEtcFieldReplayFee(Long etcFieldReplayFee) {
        this.etcFieldReplayFee = etcFieldReplayFee;
    }

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

