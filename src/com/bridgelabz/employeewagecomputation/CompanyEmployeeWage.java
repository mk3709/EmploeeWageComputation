package com.bridgelabz.employeewagecomputation;

import java.util.ArrayList;
import java.util.List;

public class CompanyEmployeeWage {
    public final String company;
    public final int EMP_RATE_PER_HOUR;
    public final int NUM_OF_WORKING_DAYS;
    public final int MAX_HRS_IN_MONTH;
    private int totalEmpWage;
    private List<Integer> dailyWageList;

    public CompanyEmployeeWage(String company, int EMP_RATE_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH) {
        this.company = company;
        this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
        this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
        this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
        this.dailyWageList = new ArrayList<>();
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    public void addDailyWage(int dailyWage) {
        dailyWageList.add(dailyWage);
    }

    @Override
    public String toString() {
        return "CompanyEmployeeWage{" +
                "company='" + company + '\'' +
                ", totalEmpWage=" + totalEmpWage +
                ", dailyWageList=" + dailyWageList +
                '}';
    }
}
