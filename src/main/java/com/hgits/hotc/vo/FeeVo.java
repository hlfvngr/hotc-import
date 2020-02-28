package com.hgits.hotc.vo;

public class FeeVo {

    private Integer vType;

    private String feeGroup;

    private Integer tollFee;

    public Integer getvType() {
        return vType;
    }

    public void setvType(Integer vType) {
        this.vType = vType;
    }

    public String getFeeGroup() {
        return feeGroup;
    }

    public void setFeeGroup(String feeGroup) {
        this.feeGroup = feeGroup;
    }

    public Integer getTollFee() {
        return tollFee;
    }

    public void setTollFee(Integer tollFee) {
        this.tollFee = tollFee;
    }
}
