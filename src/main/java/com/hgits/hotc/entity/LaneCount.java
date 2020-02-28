package com.hgits.hotc.entity;

/**
 * <p>Title: StationCount</p>
 * <p>Description: 车道合计数交易</p>
 *
 * @author wenrongyu
 * @date 2019/09/23
 */
public class LaneCount extends BaseCount {
    /**
     * 车道编号
     */
    private Integer laneId;
    /**
     * 车道编码
     */
    private String laneNo;
    /**
     * 车道类型
     */
    private Integer laneType;
    /**
     * 车道类型名称
     */
    private String laneTypeName;
    /**
     * 车道上传流水统计通行费
     */
    private Long totalPassMoneyLane;

    public Integer getLaneId() {
        return laneId;
    }

    public void setLaneId(Integer laneId) {
        this.laneId = laneId;
    }

    public String getLaneNo() {
        return laneNo;
    }

    public void setLaneNo(String laneNo) {
        this.laneNo = laneNo;
    }

    public Integer getLaneType() {
        return laneType;
    }

    public void setLaneType(Integer laneType) {
        this.laneType = laneType;
    }

    public String getLaneTypeName() {
        return laneTypeName;
    }

    public void setLaneTypeName(String laneTypeName) {
        this.laneTypeName = laneTypeName;
    }

    public Long getTotalPassMoneyLane() {
        return totalPassMoneyLane;
    }

    public void setTotalPassMoneyLane(Long totalPassMoneyLane) {
        this.totalPassMoneyLane = totalPassMoneyLane;
    }
}
