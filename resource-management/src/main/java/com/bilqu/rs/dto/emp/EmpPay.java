package com.bilqu.rs.dto.emp;

public class EmpPay {

    private long payRate;
    private int payFreq;

    public long getPayRate() {
        return payRate;
    }

    public void setPayRate(long payRate) {
        this.payRate = payRate;
    }

    public int getPayFreq() {
        return payFreq;
    }

    public void setPayFreq(int payFreq) {
        this.payFreq = payFreq;
    }

    @Override
    public String toString() {
        return "EmpPay{" +
                "payRate=" + payRate +
                ", payFreq=" + payFreq +
                '}';
    }
}
