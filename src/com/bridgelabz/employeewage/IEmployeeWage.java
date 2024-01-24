package com.bridgelabz.employeewage;

public interface IEmployeeWage {
void addCompanyEmployeeWage(String company,int empRate,int workingDays,int maxHoursPerMonth);

void computeEmployeeWage();

int getTotalEmployeeWage(String company);

}
