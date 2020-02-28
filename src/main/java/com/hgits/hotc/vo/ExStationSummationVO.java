package com.hgits.hotc.vo;

import com.hgits.hotc.entity.*;
import com.hgits.hotc.utils.BaseCountUtil;
import com.hgits.hotc.utils.StringUtil;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

/**
 * <p>Title: ExStationSummationVO</p>
 * <p>Description: 出口站级合计数VO对象</p>
 *
 * @author wenrongyu
 * @date 2019/10/12
 */
public class ExStationSummationVO extends ExStationSummation {

    private StationCount selfCount;		// 自身合计

    /**
     * 检查、生成、补生成合计开始 -----------------------------------------------------
     */
    private Integer laneId;		// 车道编码
    private String laneNo;		// 车道编号
    private Integer laneType;		// 车道类型
    private String laneTypeName;		// 车道类型名称
    private Long currentRecordCnt;		// 当前流水记录数
    private LaneCount laneCount;		// 车道流水合计
    private WaterCount waterCount;		// 出口流水合计
    /**
     * 检查、生成、补生成合计结束 -----------------------------------------------------
     */


    // 查询条件
    private Integer stationStatus;		// 站状态
    private Integer sumStatus;		// 合计状态
    private String beginCountDate;		// 开始统计日期
    private String endCountDate;		// 结束统计日期
    private String dataStr;		// 统计日期
    private String genTimeStr;		// 操作时间字符串
    private Integer opType;		// 操作类型

    // 附加属性
    private Long totalRecordCnt;	// 总流水记录数
    private Long totalFee;	// 总金额
    private List<Map<String, Object>> laneSumDetailList; 	// 各车道流水记录详情
    private String roadName;		// 路段名称
    private String stationName;		// 收费站名称

    // 移动支付特殊查询字段
    // private String stationStr;
    // private String roadStr;
    
    // 上传结果
    private String uploadResult;

    public StationCount getSelfCount() {
        return selfCount;
    }

    public void setSelfCount(StationCount selfCount) {
        this.selfCount = selfCount;
    }

    public LaneCount getLaneCount() {
        return laneCount;
    }

    public void setLaneCount(LaneCount laneCount) {
        this.laneCount = laneCount;
    }

    public WaterCount getWaterCount() {
        return waterCount;
    }

    public void setWaterCount(WaterCount waterCount) {
        this.waterCount = waterCount;
    }

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

    public Long getCurrentRecordCnt() {
        return currentRecordCnt;
    }

    public void setCurrentRecordCnt(Long currentRecordCnt) {
        this.currentRecordCnt = currentRecordCnt;
    }

    public List<Map<String, Object>> getLaneSumDetailList() {
        return laneSumDetailList;
    }

    public void setLaneSumDetailList(List<Map<String, Object>> laneSumDetailList) {
        this.laneSumDetailList = laneSumDetailList;
    }

    public Integer getStationStatus() {
        return stationStatus;
    }

    public void setStationStatus(Integer stationStatus) {
        this.stationStatus = stationStatus;
    }

    public Integer getSumStatus() {
        return sumStatus;
    }

    public void setSumStatus(Integer sumStatus) {
        this.sumStatus = sumStatus;
    }

    public String getBeginCountDate() {
        return beginCountDate;
    }

    public void setBeginCountDate(String beginCountDate) {
        this.beginCountDate = beginCountDate;
    }

    public String getEndCountDate() {
        return endCountDate;
    }

    public void setEndCountDate(String endCountDate) {
        this.endCountDate = endCountDate;
    }

    public String getDataStr() {
        if (null != getData()) {
            return new SimpleDateFormat("yyyy-MM-dd").format(getData());
        }

        return dataStr;
    }

    public void setDataStr(String dataStr) {
        this.dataStr = dataStr;
    }

    public void setGenTimeStr(String genTimeStr) {
        this.genTimeStr = genTimeStr;
    }

    public String getGenTimeStr() {
        if (null != getGenTime()) {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(getGenTime());
        }

        return genTimeStr;
    }

    public Integer getOpType() {
        return opType;
    }

    public void setOpType(Integer opType) {
        this.opType = opType;
    }

    public Long getTotalRecordCnt() {
        Long etcSuccessCount = getEtcSuccessCount() == null ? 0 : getEtcSuccessCount();
        Long etcFailCount = getEtcFailCount() == null ? 0 : getEtcFailCount();
        Long cpcSuccessCount = getCpcSuccessCount() == null ? 0 : getCpcSuccessCount();
        Long cpcFailCount = getCpcFailCount() == null ? 0 : getCpcFailCount();
        Long paperSuccessCount = getPaperSuccessCount() == null ? 0 : getPaperSuccessCount();
        Long paperFailCount = getPaperFailCount() == null ? 0 : getPaperFailCount();
        totalRecordCnt = etcSuccessCount+etcFailCount+cpcSuccessCount+cpcFailCount
                +paperSuccessCount+paperFailCount;
        return totalRecordCnt;
    }

    public void setTotalRecordCnt(Long totalRecordCnt) {
        this.totalRecordCnt = totalRecordCnt;
    }

    public Long getTotalFee() {
        Long cpcSuccessFee = getCpcSuccessFee() == null ? 0 : getCpcSuccessFee();
        Long cpcFailFee = getCpcFailFee() == null ? 0 : getCpcFailFee();
        Long paperSuccessFee = getPaperSuccessFee() == null ? 0 : getPaperSuccessFee();
        Long paperFailFee = getPaperFailFee() == null ? 0 : getPaperFailFee();
        totalFee = cpcSuccessFee + cpcFailFee + paperSuccessFee + paperFailFee;
        return totalFee;
    }

    public void setTotalFee(Long totalFee) {
        this.totalFee = totalFee;
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

    public String getStationStatusText() {
        String text = "";
        Integer stationStatus = getStationStatus();
        if (null == stationStatus){
            text = "";
        } else if (0 == stationStatus) {
            text = "待生成";
        } else if (1 == stationStatus) {
            text = "补生成";
        }

        return text;
    }

    public BaseCount getBaseCount(String countType) {
        switch (countType) {
            case BaseCountUtil.SELF_COUNT :
                return this.selfCount;
            case BaseCountUtil.WATER_COUNT :
                return this.waterCount;
            case BaseCountUtil.LANE_COUNT :
                return this.laneCount;
            default:
                return null;
        }
    }

    public String getStationStr() {
        if (null == getStationId()) {
            return null;
        }
        return StringUtil.format('0', 2, getStationId().toString());
    }

    public String getRoadStr() {
        if (null == getRoadId()) {
            return null;
        }
        return StringUtil.format('0', 2, getRoadId().toString());
    }
    
    @Override
    public String getUploadResult() {
		return uploadResult;
	}

	@Override
    public void setUploadResult(String uploadResult) {
		this.uploadResult = uploadResult;
	}
}
