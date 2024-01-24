package com.bridgelabz.employeewage;

public class EmployeeWage {
public  String company;
public  int empRate;

public  int workingDays;

public  int maxHoursPerMonth;
public int totalEmployeeWage;


    public EmployeeWage(String company, int empRate, int workingDays, int maxHoursPerMonth, int totalEmployeeWage) {
        this.company = company;
        this.empRate = empRate;
        this.workingDays = workingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
        this.totalEmployeeWage = 0;
    }

    public EmployeeWage(String company, int empRate, int workingDays, int maxHoursPerMonth) {
       this.company=company;
       this.empRate=empRate;
       this.workingDays=workingDays;
       this.maxHoursPerMonth=maxHoursPerMonth;
    }

    public static void computeEmployeeWage() {

    }

    public static String getTotalEmployeeWage(String damrt) {

    }

    public void setTotalEmployeeWage(int totalEmployeeWage)
    {
        this.totalEmployeeWage=totalEmployeeWage;
    }

    @Override
    public String toString() {
        return "EmployeeWage{" +
                "company='" + company + '\'' +
                ", empRate=" + empRate +
                ", workingDays=" + workingDays +
                ", maxHoursPerMonth=" + maxHoursPerMonth +
                ", totalEmployeeWage=" + totalEmployeeWage +
                '}';
    }

}



