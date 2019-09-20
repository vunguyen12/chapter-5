package GameZone;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){
        String userchoice = null ;
        int userchoicenum;
        String comIA = null;
        int computerIA;
        String result = null;


        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("1) for scissor \n 2) for rock \n 3) for paper");
        userchoicenum = input.nextInt();
        computerIA = rand.nextInt(3)+1;


//computer play
        if (computerIA == 1)
            comIA = "Scissor";
        else if (computerIA == 2)
            comIA = "Rock";
        else if( computerIA == 3)
            comIA = " Paper";
//person play
        if (userchoicenum == 1){
            userchoice = " Scissor";
        }
        else if (userchoicenum == 2)
            userchoice = "Rock";
        else if (userchoicenum == 3)
            userchoice = "Paper";
// battle
//        number 1 scissor
        if (userchoicenum == 1 && computerIA == 1){
            System.out.println("your choice is scissor");
            result =  "the game is draw";

    }
        else if (userchoicenum == 1 && computerIA == 2){
            System.out.println("your choice is scissor");
            result = "you lose";
        }
        else if (userchoicenum == 1 && computerIA == 3){
            System.out.println("your choice is scissor");
            result = "you win";
        }
//        number 2 rock
        if (userchoicenum == 2 && computerIA == 1){
            System.out.println("your choice is rock");
            result =  "you win";

        }
        else if (userchoicenum == 2 && computerIA == 2){
            System.out.println("your choice is rock");
            result = "game draw";
        }
        else if (userchoicenum == 2 && computerIA == 3){
            System.out.println("your choice is rock");
            result = "you lose";
        }
//        number 3
        if (userchoicenum == 3 && computerIA == 1){
            System.out.println("your choice ia paper");
            result =  "you lose";
        }
        else if (userchoicenum == 3 && computerIA == 2){
            System.out.println("your choice ia paper");

            result = "you win";
        }
        else if (userchoicenum == 3 && computerIA == 3){
            System.out.println("your choice ia paper");
            result = "the game is draw";
        }
        System.out.println("the computer choice is " +comIA);
        System.out.println(result);
}

}
