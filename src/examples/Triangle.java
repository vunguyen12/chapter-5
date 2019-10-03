package examples;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
//       Triangle program
//        Solving for right, isosceles, equilateral
//        solve triangle sides, perimeter, area
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("what are you solving for? \n 1 - for right triangle \n " + "2 -for isosceles \n 3- for Equilateral \n choice >>>");
        choice = input.nextInt();

        if (choice == 1) {
            rightTrangle();
        } else if (choice == 2) ;
        {
            iso();
        }
        if (choice == 3) {

        }
    }

    public static void rightTrangle() {
        Scanner input = new Scanner(System.in);
        String choice;
        double side1;
        double side2;
        System.out.println("Which side do you want to solve for? \n" +
                "A- side\nB- Side\nC- side");
        choice = input.next();
        if (choice.equalsIgnoreCase("A") || choice.equalsIgnoreCase("B")) {
            System.out.println("please enter for side A >>>");
            side1 = input.nextDouble();
            System.out.println("please enter for side C >>>");
            side2 = input.nextDouble();
            rightTriangleMathAB(side1, side2, choice);
        } else if (choice.equalsIgnoreCase("B")) {
            System.out.println("please enter for side A >>>");
            side1 = input.nextDouble();
            System.out.println("please enter for side C >>>");
            side2 = input.nextDouble();
            rightTriangleMathAB(side1, side2, choice);
        } else {
            System.out.println("please enter for side A >>>");
            side1 = input.nextDouble();
            System.out.println("please enter for side C >>>");
            side2 = input.nextDouble();
            rightTriangleMathC(side1, side2, choice);
        }

    }

    public static void rightTriangleMathAB(double side1, double side2, String choice) {
        double notC;
        notC = Math.sqrt((side2 * side2) - (side1 * side1));
        System.out.println("the side " + choice + " is " + notC);
        System.out.println("Which side do you want to solve for? \n" +
                "A- side\nB- Side\nC- side");
        choice = input.next();
        if (choice.equalsIgnoreCase("A") || choice.equalsIgnoreCase("B")) {
            System.out.println("please enter for side A >>>");
            side1 = input.nextDouble();
            System.out.println("please enter for side C >>>");
            side2 = input.nextDouble();
            rightTriangleMathAB(side1, side2, choice);
        } else if (choice.equalsIgnoreCase("B")) {
            System.out.println("please enter for side A >>>");
            side1 = input.nextDouble();
            System.out.println("please enter for side C >>>");
            side2 = input.nextDouble();
            rightTriangleMathAB(side1, side2, choice);
        } else {
            System.out.println("please enter for side A >>>");
            side1 = input.nextDouble();
            System.out.println("please enter for side C >>>");
            side2 = input.nextDouble();
            rightTriangleMathC(side1, side2, choice);

        }

    }


    public static void rightTriangleMathAB(double side1, double side2, String choice) {
        double notC;
        notC = Math.sqrt((side2 * side2) - (side1 * side1));
        System.out.println("the side " + choice + " is " + notC);
    }

    public static void rightTriangleMathC(double side1, double side2, String choice) {
        double notC;
        notC = Math.sqrt((side2 * side2) + (side1 * side1));
        System.out.println("the side " + choice + " is " + notC);

    }

    public static void iosMath1(double side1, double side2, String choice) {
        Double perimeter;
        perimeter = 2 * side1 + side2;
        System.out.println(perimeter);
    }

    public static void iso() {
        Scanner input = new Scanner(System.in);
        String choice;
        double side1;
        double side2;
        System.out.println("Which side do you want to solve for? \n" +
                "A for Perimeter side\nB for Base- Side\n C for Height- side");
        choice = input.next();
        if (choice.equalsIgnoreCase("A") || choice.equalsIgnoreCase("B")) {
            System.out.println("please enter for side A >>>");
            side1 = input.nextDouble();
            System.out.println("please enter for side C >>>");
            side2 = input.nextDouble();
            iosMath1(side1, side2, choice);
        } else if (choice.equalsIgnoreCase("B")) {
            System.out.println("please enter for side A >>>");
            side1 = input.nextDouble();
            System.out.println("please enter for side C >>>");
            side2 = input.nextDouble();
            rightTriangleMathAB(side1, side2, choice);
        } else {
            System.out.println("please enter for side A >>>");
            side1 = input.nextDouble();
            System.out.println("please enter for side C >>>");
            side2 = input.nextDouble();

        }
    }

    public static void solvePerimeter(double side1, double side2, double notC) {


    }

    public static void solveArea() {


    }
}