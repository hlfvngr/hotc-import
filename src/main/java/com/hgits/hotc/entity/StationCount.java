package com.hgits.hotc.entity;

/**
 * <p>Title: StationCount</p>
 * <p>Description: 站合计数交易</p>
 *
 * @author wenrongyu
 * @date 2019/10/05
 */
public class StationCount extends BaseCount {
    private String stationId;		// 站编号
    private String stationName;		// 收费站名称

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }
}
