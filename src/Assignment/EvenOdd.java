package Assignment;

import java.util.Scanner;

public class EvenOdd {
    //    the user enter a number and it has to display even or odd as the result
    public static void main(String[] args) {

//        int numEntered = 25;
        System.out.println("enter a number>>");
        Scanner input = new Scanner(System.in);
        int numEntered;
        String result;
        numEntered = input.nextInt();
        if (numEntered % 2 == 0)
            result = "even";
        else
            result = "odd";
        System.out.println(result);
    }
}