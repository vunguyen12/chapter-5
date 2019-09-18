package Assignment;

import java.util.Scanner;

public class AscendingAndDecending {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int entry1, entry2, entry3;
        System.out.println("enter a number>>");
        entry1 = input.nextInt();
        System.out.println("enter second number>>");
        entry2 = input.nextInt();
        System.out.println("enter third number>>");
        entry3 = input.nextInt();

        String result = null;
        String result2 = null;
        if (entry1 > entry2 && entry1 > entry3){
            if(entry2 > entry3)
            {
                result = "Ascending order " +entry1 + " " + entry2 +" " + entry3;
            result2 = "decending order"  +entry3 + " " + entry2 +" " + entry1;
            }
            else
                {
                result = "Ascending order " + entry1 + " " + entry3 + " " + entry2;
                result2 =  "decending order "  +entry3 + " " + entry1 +" " + entry2;
            }

        }
        else if (entry2 > entry1 &&  entry2 > entry3){
            if (entry1 > entry3)
            {
            result = "Ascending order " +entry1 + " " + entry2 +" " + entry3;
            result2 = "decending order "  +entry3 + " " + entry2 +" " + entry1;
        }
        else
            {
                result = "Ascending order " + entry1 + " " + entry3 + " " + entry2;
                result2 =  "decending order "  +entry3 + " " + entry1 +" " + entry2;
            }
        }

        System.out.println(result+ "\n" + result2);
}
}
