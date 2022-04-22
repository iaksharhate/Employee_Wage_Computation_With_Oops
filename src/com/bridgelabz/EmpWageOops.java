package com.bridgelabz;
import java.util.Random;

public class EmpWageOops {
    public static final int empAbsent = 0;
    public static final int empFullTime = 1;
    public static final int empPartTime = 2;
    public static final int empRatePerHour = 20;

    public static int empWage = 0;
    public static int empHours = 0;

    public static boolean empAttendance(){

        Random random = new Random();

        int empCheck = random.nextInt(2);

        if (empCheck == empAbsent){
            System.out.println("Employee is absent!");
            return false;
        }else {
            System.out.println("Employee is present!");
            return true;
        }
    }
    public static boolean dailyEmpWage(){

        boolean status;

        status = empAttendance();
        if (status){
            empHours = 8;
            empWage = empHours * empRatePerHour;
            System.out.println(empWage);
        }else{
            empHours = 0;
            empWage = 0;
            System.out.println(empWage);
        }
        return true;
    }
}
