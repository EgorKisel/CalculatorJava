package com.geekbrains.mycalculatorjava;

import java.io.Serializable;

public class Calculator implements Serializable {
    private String strCount = "";
    private int count;
    private int q;
    private String zero = "0";
    private String one = "1";
    private String two = "2";
    private String three = "3";
    private String four = "4";
    private String five = "5";
    private String six = "6";
    private String seven = "7";
    private String eight = "8";
    private String nine = "9";


    private String point = ".";

    public void delChar() {
        strCount = strCount.substring(0, strCount.length() - 1);
    }

    public int sum(int a, int b) {
        count = a + b;
        return count;
    }

    public int min(int a, int b) {
        count = a - b;
        return count;
    }

    public int multip(int a, int b) {
        count = a * b;
        return count;
    }

    public int div(int a, int b) {
        count = a / b;
        return count;
    }


    public String getStrCount() {
        return strCount;
    }

    public void setStrCount(String strCount) {
        this.strCount = strCount;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }

    public String getZero() {
        return zero;
    }

    public void setZero(String zero) {
        this.zero = zero;
    }

    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one;
    }

    public String getTwo() {
        return two;
    }

    public void setTwo(String two) {
        this.two = two;
    }

    public String getThree() {
        return three;
    }

    public void setThree(String three) {
        this.three = three;
    }

    public String getFour() {
        return four;
    }

    public void setFour(String four) {
        this.four = four;
    }

    public String getFive() {
        return five;
    }

    public void setFive(String five) {
        this.five = five;
    }

    public String getSix() {
        return six;
    }

    public void setSix(String six) {
        this.six = six;
    }

    public String getSeven() {
        return seven;
    }

    public void setSeven(String seven) {
        this.seven = seven;
    }

    public String getEight() {
        return eight;
    }

    public void setEight(String eight) {
        this.eight = eight;
    }

    public String getNine() {
        return nine;
    }

    public void setNine(String nine) {
        this.nine = nine;
    }

    public String getPoint() { return point; }

    public void setPoint(String point) { this.point = point; }


}
