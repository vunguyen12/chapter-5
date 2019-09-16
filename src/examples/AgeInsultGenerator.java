package examples;

import java.util.Scanner;

public class AgeInsultGenerator {
    public static void main(String[] args) {
//        user enters age and then it spit back an insult
//        school approiate hopefully
        int age;

        Scanner input = new Scanner(System.in);
        System.out.println("enter your age >>>");
        age = input.nextInt();

        if (age < 12) {
            System.out.println("you are just a kid, go away");
        }
        else if (age > 12 && age < 19) {
            System.out.println("you are old enough to know better");

        }
         if (age > 19 && age < 25) {
            System.out.println("get a job you bum");
        }
//        25 - 35
//        35 - 45
//        45 - 55
//        55 +

               if (age >= 35 && age <= 45) {

            System.out.println("GO GET A LIFE");
        }


    }
}