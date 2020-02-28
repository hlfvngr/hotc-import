package com.hgits.hotc.entity;


import java.util.Date;

/**
 * @Author: Simdy
 * @Date: Created on 2020/2/19 19:46
 * @Version: 0.0.1
 * @Modified By:
 * @Description:
 */
public class GantryTransSummationKey  {

    private String collectId;

    private String tollNetRoadId;

    private String tollRoadId;

    private String ganTryId;

    private Integer computerOrder;

    private String collectDate;

    private String collectHourBatch;

    private Integer batchCount;

    private String etcTypeCount;

    private Long cpcCount;

    private Long paperCount;

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


    // 集合属性细分
    private Long etcTypeCounTotal;		// ETC车型交易量 总和
    private Long etcTypeCountCoachTotal;		// ETC车型交易量 客车总和
    private Long etcTypeCountTruckTotal;		// ETC车型交易量 货车总和
    private Long etcTypeCountSpecialTotal;		// ETC车型交易量 专项作业车总和
    private Long etcTypeCountCoach1;		// ETC车型交易量 一型客车
    private Long etcTypeCountCoach2;		// ETC车型交易量 二型客车
    private Long etcTypeCountCoach3;		// ETC车型交易量 三型客车
    private Long etcTypeCountCoach4;		// ETC车型交易量 四型客车
    private Long etcTypeCountTruck1;		// ETC车型交易量 一型货车
    private Long etcTypeCountTruck2;		// ETC车型交易量 二型货车
    private Long etcTypeCountTruck3;		// ETC车型交易量 三型货车
    private Long etcTypeCountTruck4;		// ETC车型交易量 四型货车
    private Long etcTypeCountTruck5;		// ETC车型交易量 五型货车
    private Long etcTypeCountTruck6;		// ETC车型交易量 六型货车
    private Long etcTypeCountSpecial1;		// ETC车型交易量 一型专项作业车
    private Long etcTypeCountSpecial2;		// ETC车型交易量 二型专项作业车
    private Long etcTypeCountSpecial3;		// ETC车型交易量 三型专项作业车
    private Long etcTypeCountSpecial4;		// ETC车型交易量 四型专项作业车
    private Long etcTypeCountSpecial5;		// ETC车型交易量 五型专项作业车
    private Long etcTypeCountSpecial6;		// ETC车型交易量 六型专项作业车

    private Long cpcTypeCountTotal;		// CPC车型交易量 总和
    private Long cpcTypeCountCoachTotal;		// ETC车型交易量 客车总和
    private Long cpcTypeCountTruckTotal;		// ETC车型交易量 货车总和
    private Long cpcTypeCountSpecialTotal;		// ETC车型交易量 专项作业车总和
    private Long cpcTypeCountCoach1;		// CPC车型交易量 一型客车
    private Long cpcTypeCountCoach2;		// CPC车型交易量 二型客车
    private Long cpcTypeCountCoach3;		// CPC车型交易量 三型客车
    private Long cpcTypeCountCoach4;		// CPC车型交易量 四型客车
    private Long cpcTypeCountTruck1;		// CPC车型交易量 一型货车
    private Long cpcTypeCountTruck2;		// CPC车型交易量 二型货车
    private Long cpcTypeCountTruck3;		// CPC车型交易量 三型货车
    private Long cpcTypeCountTruck4;		// CPC车型交易量 四型货车
    private Long cpcTypeCountTruck5;		// CPC车型交易量 五型货车
    private Long cpcTypeCountTruck6;		// CPC车型交易量 六型货车
    private Long cpcTypeCountSpecial1;		// CPC车型交易量 一型专项作业车
    private Long cpcTypeCountSpecial2;		// CPC车型交易量 二型专项作业车
    private Long cpcTypeCountSpecial3;		// CPC车型交易量 三型专项作业车
    private Long cpcTypeCountSpecial4;		// CPC车型交易量 四型专项作业车
    private Long cpcTypeCountSpecial5;		// CPC车型交易量 五型专项作业车
    private Long cpcTypeCountSpecial6;		// CPC车型交易量 六型专项作业车

    private Long etcClassCountTotal;		// ETC车种交易量 总和
    private Long etcClassCountNormal;		// ETC车种交易量 普通
    private Long etcClassCountPolice;		// ETC车种交易量 军警
    private Long etcClassCountUrgency;		// ETC车种交易量 紧急
    private Long etcClassCountFree;
    //ETC列车处理量
    protected Long ecClassCountTrain;
    //CPC免费车处理量
    protected Long cpcClassCountFree;
    //CPC列车处理量
    protected Long cpcClassCountTrain;
    private Long etcClassCountCarGroup;		// ETC车种交易量 车队
    private Long etcClassCountGreenCar;		// ETC车种交易量 绿通车
    private Long etcClassCountCombine;		// ETC车种交易量 联合收割机
    private Long etcClassCountRescue;		// ETC车种交易量 抢险救灾
    private Long etcClassCountContainer;		// ETC车种交易量 集装箱
    private Long etcClassCountLargeTransport;		// ETC车种交易量 大件运输
    private Long etcClassCountEmergencyCar;		// ETC车种交易量 应急车
    private Long etcClassCountTrain;

    private Long cpcClassCountTotal;		// CPC车种交易量 总和
    private Long cpcClassCountNormal;		// CPC车种交易量 普通
    private Long cpcClassCountPolice;		// CPC车种交易量 军警
    private Long cpcClassCountUrgency;		// CPC车种交易量 紧急
    private Long cpcClassCountCarGroup;		// CPC车种交易量 车队
    private Long cpcClassCountGreenCar;		// CPC车种交易量 绿通车
    private Long cpcClassCountCombine;		// CPC车种交易量 联合收割机
    private Long cpcClassCountRescue;		// CPC车种交易量 抢险救灾
    private Long cpcClassCountContainer;		// CPC车种交易量 集装箱
    private Long cpcClassCountLargeTransport;		// CPC车种交易量 大件运输
    private Long cpcClassCountEmergencyCar;		// CPC车种交易量 应急车

    private String roadName;

    private String stationName;

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

    public Long getEtcClassCountTrain() {
        return etcClassCountTrain;
    }

    public void setEtcClassCountTrain(Long etcClassCountTrain) {
        this.etcClassCountTrain = etcClassCountTrain;
    }

    public Long getEtcTypeCounTotal() {
        return etcTypeCounTotal;
    }

    public void setEtcTypeCounTotal(Long etcTypeCounTotal) {
        this.etcTypeCounTotal = etcTypeCounTotal;
    }

    public Long getEtcTypeCountCoachTotal() {
        return etcTypeCountCoachTotal;
    }

    public void setEtcTypeCountCoachTotal(Long etcTypeCountCoachTotal) {
        this.etcTypeCountCoachTotal = etcTypeCountCoachTotal;
    }

    public Long getEtcTypeCountTruckTotal() {
        return etcTypeCountTruckTotal;
    }

    public void setEtcTypeCountTruckTotal(Long etcTypeCountTruckTotal) {
        this.etcTypeCountTruckTotal = etcTypeCountTruckTotal;
    }

    public Long getEtcTypeCountSpecialTotal() {
        return etcTypeCountSpecialTotal;
    }

    public void setEtcTypeCountSpecialTotal(Long etcTypeCountSpecialTotal) {
        this.etcTypeCountSpecialTotal = etcTypeCountSpecialTotal;
    }

    public Long getEtcTypeCountCoach1() {
        return etcTypeCountCoach1;
    }

    public void setEtcTypeCountCoach1(Long etcTypeCountCoach1) {
        this.etcTypeCountCoach1 = etcTypeCountCoach1;
    }

    public Long getEtcTypeCountCoach2() {
        return etcTypeCountCoach2;
    }

    public void setEtcTypeCountCoach2(Long etcTypeCountCoach2) {
        this.etcTypeCountCoach2 = etcTypeCountCoach2;
    }

    public Long getEtcTypeCountCoach3() {
        return etcTypeCountCoach3;
    }

    public void setEtcTypeCountCoach3(Long etcTypeCountCoach3) {
        this.etcTypeCountCoach3 = etcTypeCountCoach3;
    }

    public Long getEtcTypeCountCoach4() {
        return etcTypeCountCoach4;
    }

    public void setEtcTypeCountCoach4(Long etcTypeCountCoach4) {
        this.etcTypeCountCoach4 = etcTypeCountCoach4;
    }

    public Long getEtcTypeCountTruck1() {
        return etcTypeCountTruck1;
    }

    public void setEtcTypeCountTruck1(Long etcTypeCountTruck1) {
        this.etcTypeCountTruck1 = etcTypeCountTruck1;
    }

    public Long getEtcTypeCountTruck2() {
        return etcTypeCountTruck2;
    }

    public void setEtcTypeCountTruck2(Long etcTypeCountTruck2) {
        this.etcTypeCountTruck2 = etcTypeCountTruck2;
    }

    public Long getEtcTypeCountTruck3() {
        return etcTypeCountTruck3;
    }

    public void setEtcTypeCountTruck3(Long etcTypeCountTruck3) {
        this.etcTypeCountTruck3 = etcTypeCountTruck3;
    }

    public Long getEtcTypeCountTruck4() {
        return etcTypeCountTruck4;
    }

    public void setEtcTypeCountTruck4(Long etcTypeCountTruck4) {
        this.etcTypeCountTruck4 = etcTypeCountTruck4;
    }

    public Long getEtcTypeCountTruck5() {
        return etcTypeCountTruck5;
    }

    public void setEtcTypeCountTruck5(Long etcTypeCountTruck5) {
        this.etcTypeCountTruck5 = etcTypeCountTruck5;
    }

    public Long getEtcTypeCountTruck6() {
        return etcTypeCountTruck6;
    }

    public void setEtcTypeCountTruck6(Long etcTypeCountTruck6) {
        this.etcTypeCountTruck6 = etcTypeCountTruck6;
    }

    public Long getEtcTypeCountSpecial1() {
        return etcTypeCountSpecial1;
    }

    public void setEtcTypeCountSpecial1(Long etcTypeCountSpecial1) {
        this.etcTypeCountSpecial1 = etcTypeCountSpecial1;
    }

    public Long getEtcTypeCountSpecial2() {
        return etcTypeCountSpecial2;
    }

    public void setEtcTypeCountSpecial2(Long etcTypeCountSpecial2) {
        this.etcTypeCountSpecial2 = etcTypeCountSpecial2;
    }

    public Long getEtcTypeCountSpecial3() {
        return etcTypeCountSpecial3;
    }

    public void setEtcTypeCountSpecial3(Long etcTypeCountSpecial3) {
        this.etcTypeCountSpecial3 = etcTypeCountSpecial3;
    }

    public Long getEtcTypeCountSpecial4() {
        return etcTypeCountSpecial4;
    }

    public void setEtcTypeCountSpecial4(Long etcTypeCountSpecial4) {
        this.etcTypeCountSpecial4 = etcTypeCountSpecial4;
    }

    public Long getEtcTypeCountSpecial5() {
        return etcTypeCountSpecial5;
    }

    public void setEtcTypeCountSpecial5(Long etcTypeCountSpecial5) {
        this.etcTypeCountSpecial5 = etcTypeCountSpecial5;
    }

    public Long getEtcTypeCountSpecial6() {
        return etcTypeCountSpecial6;
    }

    public void setEtcTypeCountSpecial6(Long etcTypeCountSpecial6) {
        this.etcTypeCountSpecial6 = etcTypeCountSpecial6;
    }

    public Long getCpcTypeCountTotal() {
        return cpcTypeCountTotal;
    }

    public void setCpcTypeCountTotal(Long cpcTypeCountTotal) {
        this.cpcTypeCountTotal = cpcTypeCountTotal;
    }

    public Long getCpcTypeCountCoachTotal() {
        return cpcTypeCountCoachTotal;
    }

    public void setCpcTypeCountCoachTotal(Long cpcTypeCountCoachTotal) {
        this.cpcTypeCountCoachTotal = cpcTypeCountCoachTotal;
    }

    public Long getCpcTypeCountTruckTotal() {
        return cpcTypeCountTruckTotal;
    }

    public void setCpcTypeCountTruckTotal(Long cpcTypeCountTruckTotal) {
        this.cpcTypeCountTruckTotal = cpcTypeCountTruckTotal;
    }

    public Long getCpcTypeCountSpecialTotal() {
        return cpcTypeCountSpecialTotal;
    }

    public void setCpcTypeCountSpecialTotal(Long cpcTypeCountSpecialTotal) {
        this.cpcTypeCountSpecialTotal = cpcTypeCountSpecialTotal;
    }

    public Long getCpcTypeCountCoach1() {
        return cpcTypeCountCoach1;
    }

    public void setCpcTypeCountCoach1(Long cpcTypeCountCoach1) {
        this.cpcTypeCountCoach1 = cpcTypeCountCoach1;
    }

    public Long getCpcTypeCountCoach2() {
        return cpcTypeCountCoach2;
    }

    public void setCpcTypeCountCoach2(Long cpcTypeCountCoach2) {
        this.cpcTypeCountCoach2 = cpcTypeCountCoach2;
    }

    public Long getCpcTypeCountCoach3() {
        return cpcTypeCountCoach3;
    }

    public void setCpcTypeCountCoach3(Long cpcTypeCountCoach3) {
        this.cpcTypeCountCoach3 = cpcTypeCountCoach3;
    }

    public Long getCpcTypeCountCoach4() {
        return cpcTypeCountCoach4;
    }

    public void setCpcTypeCountCoach4(Long cpcTypeCountCoach4) {
        this.cpcTypeCountCoach4 = cpcTypeCountCoach4;
    }

    public Long getCpcTypeCountTruck1() {
        return cpcTypeCountTruck1;
    }

    public void setCpcTypeCountTruck1(Long cpcTypeCountTruck1) {
        this.cpcTypeCountTruck1 = cpcTypeCountTruck1;
    }

    public Long getCpcTypeCountTruck2() {
        return cpcTypeCountTruck2;
    }

    public void setCpcTypeCountTruck2(Long cpcTypeCountTruck2) {
        this.cpcTypeCountTruck2 = cpcTypeCountTruck2;
    }

    public Long getCpcTypeCountTruck3() {
        return cpcTypeCountTruck3;
    }

    public void setCpcTypeCountTruck3(Long cpcTypeCountTruck3) {
        this.cpcTypeCountTruck3 = cpcTypeCountTruck3;
    }

    public Long getCpcTypeCountTruck4() {
        return cpcTypeCountTruck4;
    }

    public void setCpcTypeCountTruck4(Long cpcTypeCountTruck4) {
        this.cpcTypeCountTruck4 = cpcTypeCountTruck4;
    }

    public Long getCpcTypeCountTruck5() {
        return cpcTypeCountTruck5;
    }

    public void setCpcTypeCountTruck5(Long cpcTypeCountTruck5) {
        this.cpcTypeCountTruck5 = cpcTypeCountTruck5;
    }

    public Long getCpcTypeCountTruck6() {
        return cpcTypeCountTruck6;
    }

    public void setCpcTypeCountTruck6(Long cpcTypeCountTruck6) {
        this.cpcTypeCountTruck6 = cpcTypeCountTruck6;
    }

    public Long getCpcTypeCountSpecial1() {
        return cpcTypeCountSpecial1;
    }

    public void setCpcTypeCountSpecial1(Long cpcTypeCountSpecial1) {
        this.cpcTypeCountSpecial1 = cpcTypeCountSpecial1;
    }

    public Long getCpcTypeCountSpecial2() {
        return cpcTypeCountSpecial2;
    }

    public void setCpcTypeCountSpecial2(Long cpcTypeCountSpecial2) {
        this.cpcTypeCountSpecial2 = cpcTypeCountSpecial2;
    }

    public Long getCpcTypeCountSpecial3() {
        return cpcTypeCountSpecial3;
    }

    public void setCpcTypeCountSpecial3(Long cpcTypeCountSpecial3) {
        this.cpcTypeCountSpecial3 = cpcTypeCountSpecial3;
    }

    public Long getCpcTypeCountSpecial4() {
        return cpcTypeCountSpecial4;
    }

    public void setCpcTypeCountSpecial4(Long cpcTypeCountSpecial4) {
        this.cpcTypeCountSpecial4 = cpcTypeCountSpecial4;
    }

    public Long getCpcTypeCountSpecial5() {
        return cpcTypeCountSpecial5;
    }

    public void setCpcTypeCountSpecial5(Long cpcTypeCountSpecial5) {
        this.cpcTypeCountSpecial5 = cpcTypeCountSpecial5;
    }

    public Long getCpcTypeCountSpecial6() {
        return cpcTypeCountSpecial6;
    }

    public void setCpcTypeCountSpecial6(Long cpcTypeCountSpecial6) {
        this.cpcTypeCountSpecial6 = cpcTypeCountSpecial6;
    }

    public Long getEtcClassCountTotal() {
        return etcClassCountTotal;
    }

    public void setEtcClassCountTotal(Long etcClassCountTotal) {
        this.etcClassCountTotal = etcClassCountTotal;
    }

    public Long getEtcClassCountNormal() {
        return etcClassCountNormal;
    }

    public void setEtcClassCountNormal(Long etcClassCountNormal) {
        this.etcClassCountNormal = etcClassCountNormal;
    }

    public Long getEtcClassCountPolice() {
        return etcClassCountPolice;
    }

    public void setEtcClassCountPolice(Long etcClassCountPolice) {
        this.etcClassCountPolice = etcClassCountPolice;
    }

    public Long getEtcClassCountUrgency() {
        return etcClassCountUrgency;
    }

    public void setEtcClassCountUrgency(Long etcClassCountUrgency) {
        this.etcClassCountUrgency = etcClassCountUrgency;
    }

    public Long getEtcClassCountFree() {
        return etcClassCountFree;
    }

    public void setEtcClassCountFree(Long etcClassCountFree) {
        this.etcClassCountFree = etcClassCountFree;
    }

    public Long getEcClassCountTrain() {
        return ecClassCountTrain;
    }

    public void setEcClassCountTrain(Long ecClassCountTrain) {
        this.ecClassCountTrain = ecClassCountTrain;
    }

    public Long getCpcClassCountFree() {
        return cpcClassCountFree;
    }

    public void setCpcClassCountFree(Long cpcClassCountFree) {
        this.cpcClassCountFree = cpcClassCountFree;
    }

    public Long getCpcClassCountTrain() {
        return cpcClassCountTrain;
    }

    public void setCpcClassCountTrain(Long cpcClassCountTrain) {
        this.cpcClassCountTrain = cpcClassCountTrain;
    }

    public Long getEtcClassCountCarGroup() {
        return etcClassCountCarGroup;
    }

    public void setEtcClassCountCarGroup(Long etcClassCountCarGroup) {
        this.etcClassCountCarGroup = etcClassCountCarGroup;
    }

    public Long getEtcClassCountGreenCar() {
        return etcClassCountGreenCar;
    }

    public void setEtcClassCountGreenCar(Long etcClassCountGreenCar) {
        this.etcClassCountGreenCar = etcClassCountGreenCar;
    }

    public Long getEtcClassCountCombine() {
        return etcClassCountCombine;
    }

    public void setEtcClassCountCombine(Long etcClassCountCombine) {
        this.etcClassCountCombine = etcClassCountCombine;
    }

    public Long getEtcClassCountRescue() {
        return etcClassCountRescue;
    }

    public void setEtcClassCountRescue(Long etcClassCountRescue) {
        this.etcClassCountRescue = etcClassCountRescue;
    }

    public Long getEtcClassCountContainer() {
        return etcClassCountContainer;
    }

    public void setEtcClassCountContainer(Long etcClassCountContainer) {
        this.etcClassCountContainer = etcClassCountContainer;
    }

    public Long getEtcClassCountLargeTransport() {
        return etcClassCountLargeTransport;
    }

    public void setEtcClassCountLargeTransport(Long etcClassCountLargeTransport) {
        this.etcClassCountLargeTransport = etcClassCountLargeTransport;
    }

    public Long getEtcClassCountEmergencyCar() {
        return etcClassCountEmergencyCar;
    }

    public void setEtcClassCountEmergencyCar(Long etcClassCountEmergencyCar) {
        this.etcClassCountEmergencyCar = etcClassCountEmergencyCar;
    }

    public Long getCpcClassCountTotal() {
        return cpcClassCountTotal;
    }

    public void setCpcClassCountTotal(Long cpcClassCountTotal) {
        this.cpcClassCountTotal = cpcClassCountTotal;
    }

    public Long getCpcClassCountNormal() {
        return cpcClassCountNormal;
    }

    public void setCpcClassCountNormal(Long cpcClassCountNormal) {
        this.cpcClassCountNormal = cpcClassCountNormal;
    }

    public Long getCpcClassCountPolice() {
        return cpcClassCountPolice;
    }

    public void setCpcClassCountPolice(Long cpcClassCountPolice) {
        this.cpcClassCountPolice = cpcClassCountPolice;
    }

    public Long getCpcClassCountUrgency() {
        return cpcClassCountUrgency;
    }

    public void setCpcClassCountUrgency(Long cpcClassCountUrgency) {
        this.cpcClassCountUrgency = cpcClassCountUrgency;
    }

    public Long getCpcClassCountCarGroup() {
        return cpcClassCountCarGroup;
    }

    public void setCpcClassCountCarGroup(Long cpcClassCountCarGroup) {
        this.cpcClassCountCarGroup = cpcClassCountCarGroup;
    }

    public Long getCpcClassCountGreenCar() {
        return cpcClassCountGreenCar;
    }

    public void setCpcClassCountGreenCar(Long cpcClassCountGreenCar) {
        this.cpcClassCountGreenCar = cpcClassCountGreenCar;
    }

    public Long getCpcClassCountCombine() {
        return cpcClassCountCombine;
    }

    public void setCpcClassCountCombine(Long cpcClassCountCombine) {
        this.cpcClassCountCombine = cpcClassCountCombine;
    }

    public Long getCpcClassCountRescue() {
        return cpcClassCountRescue;
    }

    public void setCpcClassCountRescue(Long cpcClassCountRescue) {
        this.cpcClassCountRescue = cpcClassCountRescue;
    }

    public Long getCpcClassCountContainer() {
        return cpcClassCountContainer;
    }

    public void setCpcClassCountContainer(Long cpcClassCountContainer) {
        this.cpcClassCountContainer = cpcClassCountContainer;
    }

    public Long getCpcClassCountLargeTransport() {
        return cpcClassCountLargeTransport;
    }

    public void setCpcClassCountLargeTransport(Long cpcClassCountLargeTransport) {
        this.cpcClassCountLargeTransport = cpcClassCountLargeTransport;
    }

    public Long getCpcClassCountEmergencyCar() {
        return cpcClassCountEmergencyCar;
    }

    public void setCpcClassCountEmergencyCar(Long cpcClassCountEmergencyCar) {
        this.cpcClassCountEmergencyCar = cpcClassCountEmergencyCar;
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
