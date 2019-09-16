package examples;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
//       Triangle program
//        Solving for right, isosceles, equilateral
//        solve triangle sides, perimeter, area
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("what are yuo solving for? \n 1 - for right triangle \n " + "2 -for isosceles \n 3- for Equilateral \n choice >>>");
        choice = input.nextInt();

        if(choice ==1){
            rightTrangle();
        }
        else if (choice == 2); {

        }
         if (choice == 3 ) {

         }

    }

    public static void rightTrangle() {

    }
    public static void solvePerimeter () {

    }
    public static void solveArea(){

    }
}
