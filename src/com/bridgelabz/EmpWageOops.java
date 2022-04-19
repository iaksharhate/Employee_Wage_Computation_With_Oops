package com.bridgelabz;
import java.util.Random;

public class EmpWageOops {
    public static final int empAbsent = 0;
    public static final int empFullTime = 1;
    public static final int empPartTime = 2;

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
}
