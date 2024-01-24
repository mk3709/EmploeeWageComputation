package com.bridgelabz.employeewagecomputation;

public class employee_wage_pract {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    private   final String company;
    private    final int EMP_RATE_PER_HOUR;
    private  final  int NUM_OF_WORKING_DAYS;
    private  final  int MAX_HRS_IN_MONTH;
    private int totalEmpWage;

   public employee_wage_pract(String company ,int EMP_RATE_PER_HOUR,int NUM_OF_WORKING_DAYS,int MAX_HRS_IN_MONTH)
   {
       this.company=company;
       this.EMP_RATE_PER_HOUR=EMP_RATE_PER_HOUR;
       this.NUM_OF_WORKING_DAYS=NUM_OF_WORKING_DAYS;
       this.MAX_HRS_IN_MONTH=MAX_HRS_IN_MONTH;

   }


    public void computeEmpWage() {
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
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
        totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;

    }


    @Override
    public String toString() {
        return "employee_wage "+company+" totalEmpWage=" + totalEmpWage;
    }

    public static void main(String[] args)
    {

        employee_wage_pract dmart=new employee_wage_pract("Dmart",20,2,10);
        employee_wage_pract reliance= new employee_wage_pract("Reliance",10,4,20);
        dmart.computeEmpWage();
        System.out.println(dmart);
        reliance.computeEmpWage();
        System.out.println(reliance);

    }

}
