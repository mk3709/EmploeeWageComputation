package com.bridgelabz.employeewagecomputation;

public class employee_wage_Array{
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    private int numOfCompany=0;
    private CompanyEmployeeWage[] companyEmployeeWageArray;

    public employee_wage_Array()
    {
        companyEmployeeWageArray= new CompanyEmployeeWage[5];
    }

    private void addCompanyEmployeeWage(String company, int EMP_RATE_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH)
    {
        companyEmployeeWageArray[numOfCompany]=new CompanyEmployeeWage(company,EMP_RATE_PER_HOUR,NUM_OF_WORKING_DAYS,MAX_HRS_IN_MONTH);
        numOfCompany++;
    }


    private  void  computeEmpWage()
    {
        for(int i=0;i<numOfCompany;i++)
        {
            companyEmployeeWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmployeeWageArray[i]));
            System.out.println(companyEmployeeWageArray[i]);
        }
    }




    private int  computeEmpWage(CompanyEmployeeWage companyEmployeeWage) {
//variables
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
//computation
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
        return totalEmpHrs*companyEmployeeWage.EMP_RATE_PER_HOUR;
    }
    public static void main(String[] args) {

       employee_wage_Array employeeWageArray= new employee_wage_Array();
       employeeWageArray.addCompanyEmployeeWage("dmart",20,2,10);
       employeeWageArray.addCompanyEmployeeWage("reilance",10,4,20);
       employee_wage_Array.computeEmpWage();

    }
}