package com.bridgelabz.employeewagecomputation;


class EmployeeWageManager {
    private List<CompanyEmployeeWage> companyEmployeeWageList;

    public EmployeeWageManager() {
        this.companyEmployeeWageList = new ArrayList<>();
    }

    public void addCompanyEmployeeWage(String company, int EMP_RATE_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH) {
        companyEmployeeWageList.add(new CompanyEmployeeWage(company, EMP_RATE_PER_HOUR, NUM_OF_WORKING_DAYS, MAX_HRS_IN_MONTH));
    }

    public void computeEmpWage() {
        for (CompanyEmployeeWage companyEmployeeWage : companyEmployeeWageList) {
            companyEmployeeWage.setTotalEmpWage(computeEmpWage(companyEmployeeWage));
            System.out.println(companyEmployeeWage);
        }
    }

    private int computeEmpWage(CompanyEmployeeWage companyEmployeeWage) {
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs <= companyEmployeeWage.MAX_HRS_IN_MONTH && totalWorkingDays < companyEmployeeWage.NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case 1:
                    empHrs = 4;
                    break;
                case 2:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day#:" + totalWorkingDays + " Emp Hr:" + empHrs);
        }
        return totalEmpHrs * companyEmployeeWage.EMP_RATE_PER_HOUR;
    }

    public static void main(String[] args) {
        EmployeeWageManager wageManager = new EmployeeWageManager();
        wageManager.addCompanyEmployeeWage("dmart", 20, 2, 10);
        wageManager.addCompanyEmployeeWage("reliance", 10, 4, 20);
        wageManager.computeEmpWage();
    }
}
