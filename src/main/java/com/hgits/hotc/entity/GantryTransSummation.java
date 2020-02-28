package com.hgits.hotc.entity;

import org.apache.commons.lang3.StringUtils;

import java.util.Date;

/**
 * @Author: Simdy
 * @Date: Created on 2020/2/19 19:10
 * @Version: 0.0.1
 * @Modified By:
 * @Description:
 */
public class GantryTransSummation  {

    private String collectId;

    private String tollNetRoadId;

    private String tollRoadId;

    private String ganTryId;

    private Integer computerOrder;

    private String collectDate;

    private String collectHourBatch;

    private Integer batchCount;

    private String etcTypeCount;

    private String etcClassCount;

    private Integer etcSuccessCount;

    private Long etcSuccessFee;

    private Integer etcFailCount;

    private String cpcTypeCount;

    private String cpcClassCount;

    private Integer cpcSuccessCount;

    private Long cpcSuccessFee;

    private Integer cpcFailCount;

    private Date stationTimeFlag;

    private Date roadTimeFlag;

    private Integer roadId;

    private Integer stationId;

    private Integer laneId;

    private String computerOrderText;
    private String mediaTypeText;
    private String obuSignText;
    private String collectEndDate;

    private String collectStartDate;

    public String getCollectEndDate() {
        return collectEndDate;
    }

    public void setCollectEndDate(String collectEndDate) {
        this.collectEndDate = collectEndDate;
    }

    public String getCollectStartDate() {
        return collectStartDate;
    }

    public void setCollectStartDate(String collectStartDate) {
        this.collectStartDate = collectStartDate;
    }

    private static final String TYPE_DEFAULT = "0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0";

    private static final String CLASS_DEFAULT = "0|0|0|0|0|0|0|0|0|0|0|0";

    public Long[] init(String count, String prefix, Long[] array, String type){
        if(array == null) {
            if(StringUtils.isEmpty(count)){
                if("type".equals(type)) count = TYPE_DEFAULT;
                if("class".equals(type)) count = CLASS_DEFAULT;
            }
            String[] splits = count.split("\\|");
            array = new Long[splits.length];

            for (int i = 0; i < splits.length; i++) {
                Long temp = Long.valueOf(splits[i]);
                array[i] = temp;
            }
        }
        return array;
    }

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

    public String getCollectId() {
        return collectId;
    }

    public void setCollectId(String collectId) {
        this.collectId = collectId;
    }

    public String getTollNetRoadId() {
        return tollNetRoadId;
    }

    public void setTollNetRoadId(String tollNetRoadId) {
        this.tollNetRoadId = tollNetRoadId;
    }

    public String getTollRoadId() {
        return tollRoadId;
    }

    public void setTollRoadId(String tollRoadId) {
        this.tollRoadId = tollRoadId;
    }

    public String getGanTryId() {
        return ganTryId;
    }

    public void setGanTryId(String ganTryId) {
        this.ganTryId = ganTryId;
    }

    public Integer getComputerOrder() {
        return computerOrder;
    }

    public void setComputerOrder(Integer computerOrder) {
        this.computerOrder = computerOrder;
    }

    public String getCollectDate() {
        return collectDate;
    }

    public void setCollectDate(String collectDate) {
        this.collectDate = collectDate;
    }

    public String getCollectHourBatch() {
        return collectHourBatch;
    }

    public void setCollectHourBatch(String collectHourBatch) {
        this.collectHourBatch = collectHourBatch;
    }

    public Integer getBatchCount() {
        return batchCount;
    }

    public void setBatchCount(Integer batchCount) {
        this.batchCount = batchCount;
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

    public Integer getEtcSuccessCount() {
        return etcSuccessCount;
    }

    public void setEtcSuccessCount(Integer etcSuccessCount) {
        this.etcSuccessCount = etcSuccessCount;
    }

    public Long getEtcSuccessFee() {
        return etcSuccessFee;
    }

    public void setEtcSuccessFee(Long etcSuccessFee) {
        this.etcSuccessFee = etcSuccessFee;
    }

    public Integer getEtcFailCount() {
        return etcFailCount;
    }

    public void setEtcFailCount(Integer etcFailCount) {
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

    public Integer getCpcSuccessCount() {
        return cpcSuccessCount;
    }

    public void setCpcSuccessCount(Integer cpcSuccessCount) {
        this.cpcSuccessCount = cpcSuccessCount;
    }

    public Long getCpcSuccessFee() {
        return cpcSuccessFee;
    }

    public void setCpcSuccessFee(Long cpcSuccessFee) {
        this.cpcSuccessFee = cpcSuccessFee;
    }

    public Integer getCpcFailCount() {
        return cpcFailCount;
    }

    public void setCpcFailCount(Integer cpcFailCount) {
        this.cpcFailCount = cpcFailCount;
    }

    public Date getStationTimeFlag() {
        return stationTimeFlag;
    }

    public void setStationTimeFlag(Date stationTimeFlag) {
        this.stationTimeFlag = stationTimeFlag;
    }

    public Date getRoadTimeFlag() {
        return roadTimeFlag;
    }

    public void setRoadTimeFlag(Date roadTimeFlag) {
        this.roadTimeFlag = roadTimeFlag;
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

    public Integer getLaneId() {
        return laneId;
    }

    public void setLaneId(Integer laneId) {
        this.laneId = laneId;
    }
}
