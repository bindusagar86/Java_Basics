package com.bbtech.solidPrinciple.ocp;

public class Substraction implements CalculateOperation{

    private Common common;
    private double result;

    public Substraction(Common common){
        this.common = common;
    }

    public Common getCommon() {
        return common;
    }

    public void setCommon(Common common) {
        this.common = common;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public void perform() {
        result = common.getNum1() - common.getNum2();
    }
}
