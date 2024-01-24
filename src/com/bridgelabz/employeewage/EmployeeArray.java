package com.bridgelabz.employeewage;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class EmployeeArray implements IEmployeeWage{

    public static final int IS_FULL_TIME=1;
    public static final int IS_PART_TIME=2;

    public int numberOfCompany=0;
    private LinkedList<EmployeeWage> companyEmployeeWageList;
    private Map<String, EmployeeWage> companyEmployeeWageMap;


   public EmployeeArray()
   {
       companyEmployeeWageList= new LinkedList<>();
       companyEmployeeWageMap =new HashMap<>();
   }



    @Override
   public void addCompanyEmployeeWage(String company, int empRate, int workingDays, int maxHoursPerMonth)
    {
         EmployeeWage employeeWage = new EmployeeWage(company,empRate,workingDays,maxHoursPerMonth);
         companyEmployeeWageList.add(employeeWage);
         companyEmployeeWageMap.put(company,employeeWage);
    }
    @Override
    public void computeEmployeeWage()
    {

        for(int i=0;i<companyEmployeeWageList.size();i++)
        {
            EmployeeWage employeeWage = companyEmployeeWageList.get(i);
            employeeWage.setTotalEmployeeWage(this.computeEmployeeWage(employeeWage));
            System.out.println(employeeWage);
        }
    }


    private int computeEmployeeWage(EmployeeWage employeeWage)
    {
        return 0;
    }
    @Override
    public int getTotalEmployeeWage(String company) {
        return companyEmployeeWageMap.get(company).totalEmployeeWage;
    }


    public static void main(String[] args) {
       IEmployeeWage employeeWage=  new EmployeeArray();
       employeeWage.addCompanyEmployeeWage("Dmart",20,3,10);
       employeeWage.addCompanyEmployeeWage("Reliance",10,4,10);
        EmployeeWage.computeEmployeeWage();
        System.out.println("Total Wage for Dmart "+EmployeeWage.getTotalEmployeeWage("Damrt"));
    }


}
