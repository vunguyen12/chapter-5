package Assignment;

import java.util.Scanner;

public class CondoSales2 {
    public static void main(String[] args) {
        int condumchoice;
        int parkview = 150000;
        int golfCourseview = 170000;
        int lakeView = 210000;
        boolean conduselected = false;
        int totalprice;
        Scanner input = new Scanner(System.in);
        System.out.println("please choose your view");
        System.out.println(" enter 1 for park view \n enter 2 for golf view \n enter 3 for lake view");
        condumchoice = input.nextInt();

        switch (condumchoice) {
            case 1:
                conduselected = true;
                System.out.println("the price of park view is " + parkview + "$");
                break;

            case 2:
                conduselected = true;
                System.out.println("the price of golf course view " + golfCourseview + "$");
                break;

            case 3:
                System.out.println("the price of lake view is " + lakeView + "$");
                conduselected = true;

                break;
            default:
                conduselected=false;
                System.out.println("the code you entered is a invalid code");
                break;
        }
        if (conduselected == true) {
            {
                System.out.println("Enter one of these choices \n1)Garage\n2)Parking Space\n");
                condumchoice = input.nextInt();
                if (condumchoice == 1 || condumchoice == 2) {
                    if (condumchoice == 1){
                        System.out.println("you have been charged 5000$ for garage");

                    }
                    else if (condumchoice == 2) {
                        System.out.println("you have been charged 5000$ for parking space");

                    }
                }
            }
        }
    }
}











