package com.hgits.hotc.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class LaneExList  {

    private String msgId;

    private Short enNetRoadId;

    private String enSectionId;

    private Short enRoadNo;

    private String enStationId;

    private Integer enStationNo;

    private String enTollStationName;

    private String enTollLaneId;

    private Short enTollLaneNo;

    private String enTollLaneHex;

    private Byte enTollLaneType;

    private Integer enOperatorId;

    private String enOperatorName;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date enTime;

    private Byte enShiftId;

    private String enVehicleId;

    private Short enVehicleClass;

    private Short enVehicleType;

    private Byte enVehicleFlag;

    private Integer enWeight;

    private Integer enAxleCount;

    private Short exNetRoadId;

    private String exSectionId;

    private Short exRoadNo;

    private String exStationId;

    private Short exStationNo;

    private String exTollStationName;

    private String exTollLaneId;

    private Short exTollLaneNo;

    private String exTollLaneHex;

    private Byte exTollLaneType;

    private String loadGantryId;

    private Date exTime;

    private Integer exOperatorId;

    private String exOperatorName;

    private String exOpCardNo;

    private Long exOpCardId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date squadDate;

    private Byte exShiftId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date naturalDate;

    private Integer squadNo;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date squadOn;

    private String exVehicleId;

    private String exIdentifyVehicleId;

    private Short exVehicleClass;

    private Short exVehicleType;

    private Short obuSign;

    private String terminalTransNo;

    private String obuId;

    private String cardId;

    private String tac;

    private Long transFee;

    private String transType;

    private Integer exWeight;

    private Integer exAxleCount;

    private Long passSpeed;

    private Integer electricalPercentage;

    private Short signStatus;

    private String description;

    private String specialType;

    private Long specialStatus;

    private Long proSpecialStatus;

    private String vehicleSignId;

    private String passId;

    private String invoiceId;

    private Byte identification;

    private Short mediaType;

    private String mediaNo;

    private Integer payType;

    private String terminalNo;

    private Short serviceType;

    private Short algorithmIdentifier;

    private Short multiProvince;

    private Short detailCnt;

    private Integer vehCount;

    private Integer payFee;

    private Integer fee;

    private Long payCardBalanceBefore;

    private Long payCardBalanceAfter;

    private Integer discountFee;

    private Integer cardBoxNo;

    private Integer cardTrunkNo;

    private String appVer;

    private String exCpuCardSnNo;

    private Byte etcCardType;

    private String payOrderListNo;

    private String payTac;

    private Byte manualFlag;

    private String chargingIn;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date sectionRequestTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date sectionResponseTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date proRequestTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date proResponseTime;

    private String proReturnCode;

    private String proReturnMemo;

    private String proChargingVersion;

    private String priceVersionGroup;

    private String proChargingSN;

    private String minChargingSN;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date minRequestTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date minResponseTime;

    private String shortestPathVersion;

    private String disputeFlag;

    private String disputeResult;

    private String delPassGantrys;

    private String delVehInfoIds;

    private String delGantryPassIds;

    private String delTollIntervals;

    private String addPassGantrys;

    private String addTollIntervals;

    private Short tollSupportDetails;

    private String chargingMac;

    private String passGantrys;

    private String splitProvince;

    private Short isTest;

    private String vehicleSign;

    private Integer spare1;

    private Integer spare2;

    private Integer spare3;

    private String spare4;

    private String spare5;

    private String spare6;

    private String exRoadIdName;
    private String exRoadNoName;
    private String enRoadIdName;
    private String enRoadNoName;

    private String squadName;
    private Date squadStartDate;
    private Date squadEndDate;

    //合并字段
    private String mediaTypeText;
    private String enShiftIdText;
    private String enOperatorIdText;
    private String enVehicleTypeText;
    private String enVehicleClassText;
    private String exOperatorIdText;
    private String exVehicleTypeText;
    private String exVehicleClassText;

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

    public String getExOperatorIdText() {
        return exOperatorIdText;
    }

    public void setExOperatorIdText(String exOperatorIdText) {
        this.exOperatorIdText = exOperatorIdText;
    }

    public String getExVehicleTypeText() {
        return exVehicleTypeText;
    }

    public void setExVehicleTypeText(String exVehicleTypeText) {
        this.exVehicleTypeText = exVehicleTypeText;
    }

    public String getExVehicleClassText() {
        return exVehicleClassText;
    }

    public void setExVehicleClassText(String exVehicleClassText) {
        this.exVehicleClassText = exVehicleClassText;
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

    public String getEnTollStationName() {
        return enTollStationName;
    }

    public void setEnTollStationName(String enTollStationName) {
        this.enTollStationName = enTollStationName;
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

    public Integer getEnOperatorId() {
        return enOperatorId;
    }

    public void setEnOperatorId(Integer enOperatorId) {
        this.enOperatorId = enOperatorId;
    }

    public String getEnOperatorName() {
        return enOperatorName;
    }

    public void setEnOperatorName(String enOperatorName) {
        this.enOperatorName = enOperatorName;
    }

    public Date getEnTime() {
        return enTime;
    }

    public void setEnTime(Date enTime) {
        this.enTime = enTime;
    }

    public Byte getEnShiftId() {
        return enShiftId;
    }

    public void setEnShiftId(Byte enShiftId) {
        this.enShiftId = enShiftId;
    }

    public String getEnVehicleId() {
        return enVehicleId;
    }

    public void setEnVehicleId(String enVehicleId) {
        this.enVehicleId = enVehicleId;
    }

    public Short getEnVehicleClass() {
        return enVehicleClass;
    }

    public void setEnVehicleClass(Short enVehicleClass) {
        this.enVehicleClass = enVehicleClass;
    }

    public Short getEnVehicleType() {
        return enVehicleType;
    }

    public void setEnVehicleType(Short enVehicleType) {
        this.enVehicleType = enVehicleType;
    }

    public Byte getEnVehicleFlag() {
        return enVehicleFlag;
    }

    public void setEnVehicleFlag(Byte enVehicleFlag) {
        this.enVehicleFlag = enVehicleFlag;
    }

    public Integer getEnWeight() {
        return enWeight;
    }

    public void setEnWeight(Integer enWeight) {
        this.enWeight = enWeight;
    }

    public Integer getEnAxleCount() {
        return enAxleCount;
    }

    public void setEnAxleCount(Integer enAxleCount) {
        this.enAxleCount = enAxleCount;
    }

    public Short getExNetRoadId() {
        return exNetRoadId;
    }

    public void setExNetRoadId(Short exNetRoadId) {
        this.exNetRoadId = exNetRoadId;
    }

    public String getExSectionId() {
        return exSectionId;
    }

    public void setExSectionId(String exSectionId) {
        this.exSectionId = exSectionId;
    }

    public Short getExRoadNo() {
        return exRoadNo;
    }

    public void setExRoadNo(Short exRoadNo) {
        this.exRoadNo = exRoadNo;
    }

    public String getExStationId() {
        return exStationId;
    }

    public void setExStationId(String exStationId) {
        this.exStationId = exStationId;
    }

    public Short getExStationNo() {
        return exStationNo;
    }

    public void setExStationNo(Short exStationNo) {
        this.exStationNo = exStationNo;
    }

    public String getExTollStationName() {
        return exTollStationName;
    }

    public void setExTollStationName(String exTollStationName) {
        this.exTollStationName = exTollStationName;
    }

    public String getExTollLaneId() {
        return exTollLaneId;
    }

    public void setExTollLaneId(String exTollLaneId) {
        this.exTollLaneId = exTollLaneId;
    }

    public Short getExTollLaneNo() {
        return exTollLaneNo;
    }

    public void setExTollLaneNo(Short exTollLaneNo) {
        this.exTollLaneNo = exTollLaneNo;
    }

    public String getExTollLaneHex() {
        return exTollLaneHex;
    }

    public void setExTollLaneHex(String exTollLaneHex) {
        this.exTollLaneHex = exTollLaneHex;
    }

    public Byte getExTollLaneType() {
        return exTollLaneType;
    }

    public void setExTollLaneType(Byte exTollLaneType) {
        this.exTollLaneType = exTollLaneType;
    }

    public String getLoadGantryId() {
        return loadGantryId;
    }

    public void setLoadGantryId(String loadGantryId) {
        this.loadGantryId = loadGantryId;
    }

    public Date getExTime() {
        return exTime;
    }

    public void setExTime(Date exTime) {
        this.exTime = exTime;
    }

    public Integer getExOperatorId() {
        return exOperatorId;
    }

    public void setExOperatorId(Integer exOperatorId) {
        this.exOperatorId = exOperatorId;
    }

    public String getExOperatorName() {
        return exOperatorName;
    }

    public void setExOperatorName(String exOperatorName) {
        this.exOperatorName = exOperatorName;
    }

    public String getExOpCardNo() {
        return exOpCardNo;
    }

    public void setExOpCardNo(String exOpCardNo) {
        this.exOpCardNo = exOpCardNo;
    }

    public Long getExOpCardId() {
        return exOpCardId;
    }

    public void setExOpCardId(Long exOpCardId) {
        this.exOpCardId = exOpCardId;
    }

    public Date getSquadDate() {
        return squadDate;
    }

    public void setSquadDate(Date squadDate) {
        this.squadDate = squadDate;
    }

    public Byte getExShiftId() {
        return exShiftId;
    }

    public void setExShiftId(Byte exShiftId) {
        this.exShiftId = exShiftId;
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

    public String getExVehicleId() {
        return exVehicleId;
    }

    public void setExVehicleId(String exVehicleId) {
        this.exVehicleId = exVehicleId;
    }

    public String getExIdentifyVehicleId() {
        return exIdentifyVehicleId;
    }

    public void setExIdentifyVehicleId(String exIdentifyVehicleId) {
        this.exIdentifyVehicleId = exIdentifyVehicleId;
    }

    public Short getExVehicleClass() {
        return exVehicleClass;
    }

    public void setExVehicleClass(Short exVehicleClass) {
        this.exVehicleClass = exVehicleClass;
    }

    public Short getExVehicleType() {
        return exVehicleType;
    }

    public void setExVehicleType(Short exVehicleType) {
        this.exVehicleType = exVehicleType;
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

    public Integer getExWeight() {
        return exWeight;
    }

    public void setExWeight(Integer exWeight) {
        this.exWeight = exWeight;
    }

    public Integer getExAxleCount() {
        return exAxleCount;
    }

    public void setExAxleCount(Integer exAxleCount) {
        this.exAxleCount = exAxleCount;
    }

    public Long getPassSpeed() {
        return passSpeed;
    }

    public void setPassSpeed(Long passSpeed) {
        this.passSpeed = passSpeed;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Byte getIdentification() {
        return identification;
    }

    public void setIdentification(Byte identification) {
        this.identification = identification;
    }

    public Short getMediaType() {
        return mediaType;
    }

    public void setMediaType(Short mediaType) {
        this.mediaType = mediaType;
    }

    public String getMediaNo() {
        return mediaNo;
    }

    public void setMediaNo(String mediaNo) {
        this.mediaNo = mediaNo;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getTerminalNo() {
        return terminalNo;
    }

    public void setTerminalNo(String terminalNo) {
        this.terminalNo = terminalNo;
    }

    public Short getServiceType() {
        return serviceType;
    }

    public void setServiceType(Short serviceType) {
        this.serviceType = serviceType;
    }

    public Short getAlgorithmIdentifier() {
        return algorithmIdentifier;
    }

    public void setAlgorithmIdentifier(Short algorithmIdentifier) {
        this.algorithmIdentifier = algorithmIdentifier;
    }

    public Short getMultiProvince() {
        return multiProvince;
    }

    public void setMultiProvince(Short multiProvince) {
        this.multiProvince = multiProvince;
    }

    public Short getDetailCnt() {
        return detailCnt;
    }

    public void setDetailCnt(Short detailCnt) {
        this.detailCnt = detailCnt;
    }

    public Integer getVehCount() {
        return vehCount;
    }

    public void setVehCount(Integer vehCount) {
        this.vehCount = vehCount;
    }

    public Integer getPayFee() {
        return payFee;
    }

    public void setPayFee(Integer payFee) {
        this.payFee = payFee;
    }

    public Integer getFee() {
        return fee;
    }

    public void setFee(Integer fee) {
        this.fee = fee;
    }

    public Long getPayCardBalanceBefore() {
        return payCardBalanceBefore;
    }

    public void setPayCardBalanceBefore(Long payCardBalanceBefore) {
        this.payCardBalanceBefore = payCardBalanceBefore;
    }

    public Long getPayCardBalanceAfter() {
        return payCardBalanceAfter;
    }

    public void setPayCardBalanceAfter(Long payCardBalanceAfter) {
        this.payCardBalanceAfter = payCardBalanceAfter;
    }

    public Integer getDiscountFee() {
        return discountFee;
    }

    public void setDiscountFee(Integer discountFee) {
        this.discountFee = discountFee;
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

    public String getExCpuCardSnNo() {
        return exCpuCardSnNo;
    }

    public void setExCpuCardSnNo(String exCpuCardSnNo) {
        this.exCpuCardSnNo = exCpuCardSnNo;
    }

    public Byte getEtcCardType() {
        return etcCardType;
    }

    public void setEtcCardType(Byte etcCardType) {
        this.etcCardType = etcCardType;
    }

    public String getPayOrderListNo() {
        return payOrderListNo;
    }

    public void setPayOrderListNo(String payOrderListNo) {
        this.payOrderListNo = payOrderListNo;
    }

    public String getPayTac() {
        return payTac;
    }

    public void setPayTac(String payTac) {
        this.payTac = payTac;
    }

    public Byte getManualFlag() {
        return manualFlag;
    }

    public void setManualFlag(Byte manualFlag) {
        this.manualFlag = manualFlag;
    }

    public String getChargingIn() {
        return chargingIn;
    }

    public void setChargingIn(String chargingIn) {
        this.chargingIn = chargingIn;
    }

    public Date getSectionRequestTime() {
        return sectionRequestTime;
    }

    public void setSectionRequestTime(Date sectionRequestTime) {
        this.sectionRequestTime = sectionRequestTime;
    }

    public Date getSectionResponseTime() {
        return sectionResponseTime;
    }

    public void setSectionResponseTime(Date sectionResponseTime) {
        this.sectionResponseTime = sectionResponseTime;
    }

    public Date getProRequestTime() {
        return proRequestTime;
    }

    public void setProRequestTime(Date proRequestTime) {
        this.proRequestTime = proRequestTime;
    }

    public Date getProResponseTime() {
        return proResponseTime;
    }

    public void setProResponseTime(Date proResponseTime) {
        this.proResponseTime = proResponseTime;
    }

    public String getProReturnCode() {
        return proReturnCode;
    }

    public void setProReturnCode(String proReturnCode) {
        this.proReturnCode = proReturnCode;
    }

    public String getProReturnMemo() {
        return proReturnMemo;
    }

    public void setProReturnMemo(String proReturnMemo) {
        this.proReturnMemo = proReturnMemo;
    }

    public String getProChargingVersion() {
        return proChargingVersion;
    }

    public void setProChargingVersion(String proChargingVersion) {
        this.proChargingVersion = proChargingVersion;
    }

    public String getPriceVersionGroup() {
        return priceVersionGroup;
    }

    public void setPriceVersionGroup(String priceVersionGroup) {
        this.priceVersionGroup = priceVersionGroup;
    }

    public String getProChargingSN() {
        return proChargingSN;
    }

    public void setProChargingSN(String proChargingSN) {
        this.proChargingSN = proChargingSN;
    }

    public String getMinChargingSN() {
        return minChargingSN;
    }

    public void setMinChargingSN(String minChargingSN) {
        this.minChargingSN = minChargingSN;
    }

    public Date getMinRequestTime() {
        return minRequestTime;
    }

    public void setMinRequestTime(Date minRequestTime) {
        this.minRequestTime = minRequestTime;
    }

    public Date getMinResponseTime() {
        return minResponseTime;
    }

    public void setMinResponseTime(Date minResponseTime) {
        this.minResponseTime = minResponseTime;
    }

    public String getShortestPathVersion() {
        return shortestPathVersion;
    }

    public void setShortestPathVersion(String shortestPathVersion) {
        this.shortestPathVersion = shortestPathVersion;
    }

    public String getDisputeFlag() {
        return disputeFlag;
    }

    public void setDisputeFlag(String disputeFlag) {
        this.disputeFlag = disputeFlag;
    }

    public String getDisputeResult() {
        return disputeResult;
    }

    public void setDisputeResult(String disputeResult) {
        this.disputeResult = disputeResult;
    }

    public String getDelPassGantrys() {
        return delPassGantrys;
    }

    public void setDelPassGantrys(String delPassGantrys) {
        this.delPassGantrys = delPassGantrys;
    }

    public String getDelVehInfoIds() {
        return delVehInfoIds;
    }

    public void setDelVehInfoIds(String delVehInfoIds) {
        this.delVehInfoIds = delVehInfoIds;
    }

    public String getDelGantryPassIds() {
        return delGantryPassIds;
    }

    public void setDelGantryPassIds(String delGantryPassIds) {
        this.delGantryPassIds = delGantryPassIds;
    }

    public String getDelTollIntervals() {
        return delTollIntervals;
    }

    public void setDelTollIntervals(String delTollIntervals) {
        this.delTollIntervals = delTollIntervals;
    }

    public String getAddPassGantrys() {
        return addPassGantrys;
    }

    public void setAddPassGantrys(String addPassGantrys) {
        this.addPassGantrys = addPassGantrys;
    }

    public String getAddTollIntervals() {
        return addTollIntervals;
    }

    public void setAddTollIntervals(String addTollIntervals) {
        this.addTollIntervals = addTollIntervals;
    }

    public Short getTollSupportDetails() {
        return tollSupportDetails;
    }

    public void setTollSupportDetails(Short tollSupportDetails) {
        this.tollSupportDetails = tollSupportDetails;
    }

    public String getChargingMac() {
        return chargingMac;
    }

    public void setChargingMac(String chargingMac) {
        this.chargingMac = chargingMac;
    }

    public String getPassGantrys() {
        return passGantrys;
    }

    public void setPassGantrys(String passGantrys) {
        this.passGantrys = passGantrys;
    }

    public String getSplitProvince() {
        return splitProvince;
    }

    public void setSplitProvince(String splitProvince) {
        this.splitProvince = splitProvince;
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

    public String getExRoadIdName() {
        return exRoadIdName;
    }

    public void setExRoadIdName(String exRoadIdName) {
        this.exRoadIdName = exRoadIdName;
    }

    public String getExRoadNoName() {
        return exRoadNoName;
    }

    public void setExRoadNoName(String exRoadNoName) {
        this.exRoadNoName = exRoadNoName;
    }

    public String getEnRoadIdName() {
        return enRoadIdName;
    }

    public void setEnRoadIdName(String enRoadIdName) {
        this.enRoadIdName = enRoadIdName;
    }

    public String getEnRoadNoName() {
        return enRoadNoName;
    }

    public void setEnRoadNoName(String enRoadNoName) {
        this.enRoadNoName = enRoadNoName;
    }

    public String getSquadName() {
        return squadName;
    }

    public void setSquadName(String squadName) {
        this.squadName = squadName;
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
}