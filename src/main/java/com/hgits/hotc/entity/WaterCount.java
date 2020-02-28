package com.hgits.hotc.entity;

/**
 * <p>Title: WaterCount</p>
 * <p>Description: 流水合计数交易</p>
 *
 * @author wenrongyu
 * @date 2019/09/23
 */
public class WaterCount extends BaseCount {
    /**
     * 流水统计现金金额
     */
    private Long cashMoneyList;
    /**
     * 流水统计非现金流水金额
     */
    private Long notCashMoneyList;
    /**
     * 流水统计通行费
     */
    private Long totalPassMoneyList;

    public Long getCashMoneyList() {
        return cashMoneyList;
    }

    public void setCashMoneyList(Long cashMoneyList) {
        this.cashMoneyList = cashMoneyList;
    }

    public Long getNotCashMoneyList() {
        return notCashMoneyList;
    }

    public void setNotCashMoneyList(Long notCashMoneyList) {
        this.notCashMoneyList = notCashMoneyList;
    }

    public Long getTotalPassMoneyList() {
        return totalPassMoneyList;
    }

    public void setTotalPassMoneyList(Long totalPassMoneyList) {
        this.totalPassMoneyList = totalPassMoneyList;
    }
}
