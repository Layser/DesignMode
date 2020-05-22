package com.ayser.simplefactory.third;


public abstract class Operator {
    private int num1;
    private int num2;
    private String opt;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getOpt() {
        return opt;
    }

    public void setOpt(String opt) {
        this.opt = opt;
    }



    abstract int getResult(int num1, int num2, String opt);
}
