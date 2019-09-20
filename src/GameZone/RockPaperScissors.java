package GameZone;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){
        String userchoice = null ;
        int userchoicenum;
        String comIA = null;
        int computerIA;

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
        if (userchoicenum == 1)
        }
    }

