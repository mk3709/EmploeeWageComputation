package com.bridgelabz.employeewagecomputation;
import java.util.ArrayList;
import java.util.List;

public class EmployeeWageArray {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    private List<CompanyEmployeeWage> companyEmployeeWageList;

    public EmployeeWageArray() {
        companyEmployeeWageList = new ArrayList<>();
    }

    private void addCompanyEmployeeWage(String company, int EMP_RATE_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH) {
        CompanyEmployeeWage companyEmployeeWage = new CompanyEmployeeWage(company, EMP_RATE_PER_HOUR, NUM_OF_WORKING_DAYS, MAX_HRS_IN_MONTH);
        companyEmployeeWageList.add(companyEmployeeWage);
    }

    private void computeEmpWage() {
        for (CompanyEmployeeWage companyEmployeeWage : companyEmployeeWageList) {
            companyEmployeeWage.setTotalEmpWage(this.computeEmpWage(companyEmployeeWage));
            System.out.println(companyEmployeeWage);
        }
    }

    private int computeEmpWage(CompanyEmployeeWage companyEmployeeWage) {
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs <= companyEmployeeWage.MAX_HRS_IN_MONTH && totalWorkingDays < companyEmployeeWage.NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day#:" + totalWorkingDays + "Emp Hr:" + empHrs);
        }
        return totalEmpHrs * companyEmployeeWage.EMP_RATE_PER_HOUR;
    }

    public static void main(String[] args) {
        EmployeeWageArray employeeWageArray = new EmployeeWageArray();
        employeeWageArray.addCompanyEmployeeWage("dmart", 20, 2, 10);
        employeeWageArray.addCompanyEmployeeWage("reliance", 10, 4, 20);
        employeeWageArray.computeEmpWage();
    }
}
