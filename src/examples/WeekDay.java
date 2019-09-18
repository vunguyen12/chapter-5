package examples;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String day;

        String result;
        System.out.println("Enter the day of the week>>>");
        day=input.next();

        switch(day){
            case "monday":
                result = "reserve room for friday meeting";
                break;
            case " tuesday":
                result = "Prepare PowerPoint slides";
                break;
            case "Wednesday":
                result = "Send out meeting reminders";
                break;
            case "Thursday":
                result = "Getting ready fot football Friday";
                break;
            case "Friday":
                result = " Wear spirit wear for game Space Theme";
                break;
                default:
                    result = "invalid";


        }
System.out.println(result);

    }
}
