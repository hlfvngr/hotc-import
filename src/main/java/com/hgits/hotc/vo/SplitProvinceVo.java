package com.hgits.hotc.vo;

import java.util.List;

public class SplitProvinceVo {

    private Integer index;

    private String prov;

    private Integer count;

    private String group;

    private String mVer;

    private String pVer;

    private List<FeeVo> fees;


    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getmVer() {
        return mVer;
    }

    public void setmVer(String mVer) {
        this.mVer = mVer;
    }

    public String getpVer() {
        return pVer;
    }

    public void setpVer(String pVer) {
        this.pVer = pVer;
    }

    public List<FeeVo> getFees() {
        return fees;
    }

    public void setFees(List<FeeVo> fees) {
        this.fees = fees;
    }

}
