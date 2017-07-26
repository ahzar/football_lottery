package com.azhar.lottery.bean.mybills;

import java.util.Date;

/**
 * Created by azhar on 17/7/5.
 */
public class Mybills {

    private String userID;        //用户ID；
    private String time;              //账单提交时间
    private float income;           // 收入
    private float expenditure;          //支出
    private String type;                // 支出类型

    private int id;       //id


    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public float getIncome() {
        return income;
    }

    public void setIncome(float income) {
        this.income = income;
    }

    public float getExpenditure() {
        return expenditure;
    }

    public void setExpenditure(float expenditure) {
        this.expenditure = expenditure;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
