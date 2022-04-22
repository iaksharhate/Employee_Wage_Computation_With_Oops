package com.bridgelabz;
import java.util.Random;

public class EmpWageOops {
    public static final int empAbsent = 0;
    public static final int empFullTime = 1;
    public static final int empPartTime = 2;
    public static final int empRatePerHour = 20;
    public static final int totalMonthDays = 20;
    public static final int totalWorkingHours = 100;

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
            empHours = 16;
            empWage = empHours * empRatePerHour;
            System.out.println(empWage);
        }else{
            empHours = 0;
            empWage = 0;
            System.out.println(empWage);
        }
        return true;
    }
    public static void partTimeEmpWage(){
        Random random = new Random();

        int empCheck = random.nextInt(3);

        switch (empCheck){

            case 0: empHours = 0;
                    break;

            case 1: empHours = 16;
                    break;

            case 2: empHours = 8;
                    break;
        }
        empWage = (empHours * empRatePerHour);
    }

    public static void monthlyWage(){
        int salary = 0;

        for (int i = 0; i <= totalMonthDays; i++){
            partTimeEmpWage();
            salary = salary + empWage;
        }
        System.out.println("Monthly wage of employee: "+salary);
    }
    public static void conditionOfDaysAndHours(){
        int hours = 0;
        int days = 0;
        int salary = 0;

        while (hours <= totalWorkingHours && days <= totalMonthDays){
            days++;
            Random random = new Random();

            int empCheck = random.nextInt(3);

            switch (empCheck){

                case 0: empHours = 0;
                    break;

                case 1: empHours = 16;
                    break;

                case 2: empHours = 8;
                    break;
            }
            empWage = (empHours * empRatePerHour);
            hours = hours + empHours;
            salary = salary + empWage;
        }
        System.out.println("Monthly wage of employee: "+salary);
    }
}
