package com.bridgelabz;
import java.util.Random;

public class EmpWageOops {
    public static final int empAbsent = 0;
    public static final int empFullTime = 1;
    public static final int empPartTime = 2;
    public static final int empRatePerHour = 20;
    public static final int totalMonthDays = 20;
    public static final int totalWorkingHours = 100;

    public static int computeEmployeeWage(){

        int empHours = 0;
        int totalEmpHours = 0;
        int totalWorkingDays = 0;
        int salary = 0;

        while (totalEmpHours <= totalWorkingHours && totalWorkingDays < totalMonthDays){
            totalWorkingDays ++;

            Random random = new Random();
            int empCheck = random.nextInt(3);

            if (empCheck == empAbsent){
                empHours = 0;
            }else if (empCheck == empFullTime){
                empHours = 16;
            }else {
                empHours = 8;
            }
            totalEmpHours = totalEmpHours + empHours;
        }
        salary = (totalEmpHours * empRatePerHour);
        System.out.println("Total employee wage: "+salary);
        return salary;
    }
}
