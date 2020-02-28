package com.hgits.hotc.entity;

import java.io.Serializable;

/**
 * @author liangshishun
 * @className BaseCount
 * @Date 2019/8/7 13:40
 * @Description 合计数交易基类
 */
public abstract class BaseCount implements Serializable {
    protected Long recordCnt;		// 记录数
    protected String etcTypeCount;		// ETC车型交易量
    protected String etcClassCount;		// ETC车种交易量
    protected Long etcSuccessCount;		// ETC成功交易量
    protected Long etcFailCount;		// ETC失败交易量
    protected String cpcTypeCount;		// CPC车型交易量
    protected String cpcClassCount;		// CPC车种交易量
    protected Long cpcCount;		// CPC发卡量
    protected Long paperCount;		// 纸劵发卡量

    protected Long fee;		// 交易额
    protected Long cpcSuccessCount;		// CPC成功交易量
    protected Long cpcSuccessFee;		// CPC成功交易额
    protected Long cpcFailCount;		// CPC失败交易量
    protected Long cpcFailFee;		// CPC失败交易额
    protected Long paperSuccessCount;		// 纸劵成功交易量
    protected Long paperSuccessFee;		// 纸劵成功交易额
    protected Long paperFailCount;		// 纸劵失败交易量
    protected Long paperFailFee;		// 纸劵失败交易额

    protected Long etcTypeCountTotal;		// ETC车型交易量 总和
    protected Long etcTypeCountCoachTotal;		// ETC车型交易量 客车总和
    protected Long etcTypeCountTruckTotal;		// ETC车型交易量 货车总和
    protected Long etcTypeCountSpecialTotal;	// ETC车型交易量 专项作业车总和
    protected Long etcTypeCountCoach1;		    // ETC车型交易量 一型客车
    protected Long etcTypeCountCoach2;		    // ETC车型交易量 二型客车
    protected Long etcTypeCountCoach3;		    // ETC车型交易量 三型客车
    protected Long etcTypeCountCoach4;		    // ETC车型交易量 四型客车
    protected Long etcTypeCountTruck1;		    // ETC车型交易量 一型货车
    protected Long etcTypeCountTruck2;		    // ETC车型交易量 二型货车
    protected Long etcTypeCountTruck3;		    // ETC车型交易量 三型货车
    protected Long etcTypeCountTruck4;		    // ETC车型交易量 四型货车
    protected Long etcTypeCountTruck5;		    // ETC车型交易量 五型货车
    protected Long etcTypeCountTruck6;		    // ETC车型交易量 六型货车
    protected Long etcTypeCountSpecial1;		// ETC车型交易量 一型专项作业车
    protected Long etcTypeCountSpecial2;		// ETC车型交易量 二型专项作业车
    protected Long etcTypeCountSpecial3;		// ETC车型交易量 三型专项作业车
    protected Long etcTypeCountSpecial4;		// ETC车型交易量 四型专项作业车
    protected Long etcTypeCountSpecial5;		// ETC车型交易量 五型专项作业车
    protected Long etcTypeCountSpecial6;		// ETC车型交易量 六型专项作业车

    protected Long cpcTypeCountTotal;		// CPC车型交易量 总和
    protected Long cpcTypeCountCoachTotal;		// ETC车型交易量 客车总和
    protected Long cpcTypeCountTruckTotal;		// ETC车型交易量 货车总和
    protected Long cpcTypeCountSpecialTotal;		// ETC车型交易量 专项作业车总和
    protected Long cpcTypeCountCoach1;		    // CPC车型交易量 一型客车
    protected Long cpcTypeCountCoach2;		    // CPC车型交易量 二型客车
    protected Long cpcTypeCountCoach3;		    // CPC车型交易量 三型客车
    protected Long cpcTypeCountCoach4;		    // CPC车型交易量 四型客车
    protected Long cpcTypeCountTruck1;		    // CPC车型交易量 一型货车
    protected Long cpcTypeCountTruck2;		    // CPC车型交易量 二型货车
    protected Long cpcTypeCountTruck3;		    // CPC车型交易量 三型货车
    protected Long cpcTypeCountTruck4;		    // CPC车型交易量 四型货车
    protected Long cpcTypeCountTruck5;		    // CPC车型交易量 五型货车
    protected Long cpcTypeCountTruck6;		    // CPC车型交易量 六型货车
    protected Long cpcTypeCountSpecial1;		// CPC车型交易量 一型专项作业车
    protected Long cpcTypeCountSpecial2;		// CPC车型交易量 二型专项作业车
    protected Long cpcTypeCountSpecial3;		// CPC车型交易量 三型专项作业车
    protected Long cpcTypeCountSpecial4;		// CPC车型交易量 四型专项作业车
    protected Long cpcTypeCountSpecial5;		// CPC车型交易量 五型专项作业车
    protected Long cpcTypeCountSpecial6;		// CPC车型交易量 六型专项作业车

    protected Long etcClassCountTotal;		// ETC车种交易量 总和
    protected Long etcClassCountNormal;		// ETC车种交易量 普通
    protected Long etcClassCountPolice;		// ETC车种交易量 军警
    protected Long etcClassCountUrgency;		// ETC车种交易量 紧急
    //ETC免费车处理量
    protected Long etcClassCountFree;
    protected Long etcClassCountCarGroup;		// ETC车种交易量 车队
    protected Long etcClassCountGreenCar;		// ETC车种交易量 绿通车
    protected Long etcClassCountCombine;		// ETC车种交易量 联合收割机
    protected Long etcClassCountRescue;		// ETC车种交易量 抢险救灾
    protected Long etcClassCountContainer;		// ETC车种交易量 集装箱
    protected Long etcClassCountLargeTransport;		// ETC车种交易量 大件运输
    protected Long etcClassCountEmergencyCar;		// ETC车种交易量 应急车
    //ETC列车处理量
    protected Long etcClassCountTrain;

    protected Long cpcClassCountTotal;		// CPC车种交易量 总和
    protected Long cpcClassCountNormal;		// CPC车种交易量 普通
    protected Long cpcClassCountPolice;		// CPC车种交易量 军警
    protected Long cpcClassCountUrgency;		// CPC车种交易量 紧急
    protected Long cpcClassCountCarGroup;		// CPC车种交易量 车队
    protected Long cpcClassCountGreenCar;		// CPC车种交易量 绿通车
    protected Long cpcClassCountCombine;		// CPC车种交易量 联合收割机
    protected Long cpcClassCountRescue;		// CPC车种交易量 抢险救灾
    protected Long cpcClassCountContainer;		// CPC车种交易量 集装箱
    protected Long cpcClassCountLargeTransport;		// CPC车种交易量 大件运输
    protected Long cpcClassCountEmergencyCar;		// CPC车种交易量 应急车
    //CPC免费车处理量
    protected Long cpcClassCountFree;
    //CPC列车处理量
    protected Long cpcClassCountTrain;

    public Long getRecordCnt() {
        return recordCnt;
    }

    public void setRecordCnt(Long recordCnt) {
        this.recordCnt = recordCnt;
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

    public Long getFee() {
        return fee;
    }

    public void setFee(Long fee) {
        this.fee = fee;
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

    public Long getEtcTypeCountTotal() {
        return etcTypeCountTotal;
    }

    public void setEtcTypeCountTotal(Long etcTypeCountTotal) {
        this.etcTypeCountTotal = etcTypeCountTotal;
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

    public Long getEtcClassCountFree() {
        return etcClassCountFree;
    }

    public void setEtcClassCountFree(Long etcClassCountFree) {
        this.etcClassCountFree = etcClassCountFree;
    }

    public Long getEtcClassCountTrain() {
        return etcClassCountTrain;
    }

    public void setEtcClassCountTrain(Long etcClassCountTrain) {
        this.etcClassCountTrain = etcClassCountTrain;
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
}
