package examples;

import java.util.Scanner;

public class overTime {
    public static void main(String[] args){
        double employeeHours;
        double pay =10.50;
        double total;
        double otHours;
        Scanner input = new Scanner(System.in);
        System.out.println("How many hours did you work?");
        employeeHours= input.nextDouble();

        if (employeeHours > 40){
            otHours = employeeHours - 40;
            total = (pay *40)  + (otHours * (pay * 1.5));
            System.out.println("Gross pay equal " + total);
        }
        else if (employeeHours <= 40) {
            total = (pay * employeeHours);
            System.out.println("Gross pay equals " + total);
        }
    }
}
