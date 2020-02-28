package com.hgits.hotc.entity;


import com.hgits.hotc.vo.SplitProvinceVo;

public class AllShortestPath  {
    private String enProv;

    private String enId;

    private String exProv;

    private String exId;

    private Short mutiProvinceSign;

    private String validTime;

    private String splitProvince;

    private String version;

    //补充字段
    private Integer sumOfTollFees;

    public Integer getSumOfTollFees() {
        return sumOfTollFees;
    }

    public void setSumOfTollFees(Integer sumOfTollFees) {
        this.sumOfTollFees = sumOfTollFees;
    }

    private SplitProvinceVo splitProvinceVo;

    public SplitProvinceVo getSplitProvinceVo() {
        return splitProvinceVo;
    }

    public void setSplitProvinceVo(SplitProvinceVo splitProvinceVo) {
        this.splitProvinceVo = splitProvinceVo;
    }

    public String getEnProv() {
        return enProv;
    }

    public void setEnProv(String enProv) {
        this.enProv = enProv;
    }

    public String getExProv() {
        return exProv;
    }

    public void setExProv(String exProv) {
        this.exProv = exProv;
    }

    public Short getMutiProvinceSign() {
        return mutiProvinceSign;
    }

    public void setMutiProvinceSign(Short mutiProvinceSign) {
        this.mutiProvinceSign = mutiProvinceSign;
    }

    public String getValidTime() {
        return validTime;
    }

    public void setValidTime(String validTime) {
        this.validTime = validTime;
    }

    public String getSplitProvince() {
        return splitProvince;
    }

    public void setSplitProvince(String splitProvince) {
        this.splitProvince = splitProvince;
    }

    public String getEnId() {
        return enId;
    }

    public void setEnId(String enId) {
        this.enId = enId;
    }

    public String getExId() {
        return exId;
    }

    public void setExId(String exId) {
        this.exId = exId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String toTxt(){
        return enProv+"\t"+enId+"\t"+
                exProv+"\t"+exId+"\t"+
                1+"\t"+version+"\t"+validTime+"\t"+
                splitProvince+"\r\n";
    }

    public static String toTxtColumn(){
        return "enProv\tenId\texProv\texId\tmutiProvinceSign\tversion\tvalidTime\tsplitProvince\r\n";
    }

    @Override
    public String toString() {
        return "AllShortestPath{" +
                "enProv='" + enProv + '\'' +
                ", enId='" + enId + '\'' +
                ", exProv='" + exProv + '\'' +
                ", exId='" + exId + '\'' +
                ", mutiProvinceSign=" + mutiProvinceSign +
                ", validTime='" + validTime + '\'' +
                ", splitProvince='" + splitProvince + '\'' +
                ", version='" + version + '\'' +
                ", sumOfTollFees=" + sumOfTollFees +
                ", splitProvinceVo=" + splitProvinceVo +
                '}';
    }
}