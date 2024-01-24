package com.bridgelabz.employeewagecomputation;

public class CompanyEmployeeWage {

    public final String company;
    public final int EMP_RATE_PER_HOUR;
    public final int NUM_OF_WORKING_DAYS;
    public final int MAX_HRS_IN_MONTH;
    public int totalEmpWage;

    public CompanyEmployeeWage(String company, int EMP_RATE_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH) {
        this.company = company;
        this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
        this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
        this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;

    }


    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }


    @Override
    public String toString() {
        return "employee_wage_pract" + "totalEmpWage=" + totalEmpWage;
    }
}


