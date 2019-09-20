package Assignment;

import java.util.Scanner;

public class CellPhoneService {
    public static void main(String[] args) {
        int minUsed;
        int textSent;
        int textUsed;
        int gbUsed;
        String result = null;

        Scanner input = new Scanner(System.in);
        System.out.println("how many minute are you going to use");
        minUsed = input.nextInt();

        System.out.println("how many text messeges are you going to send?");
        textUsed = input.nextInt();

        System.out.println("how many gigabytes are you going to use?");
        gbUsed = input.nextInt();

        if (minUsed < 500 && textUsed == 0 && gbUsed == 0) {
            result = "plan A";
        } else if (minUsed < 500 && textUsed >= 1 && textUsed <= 99 && gbUsed == 0) {
            result = "plan B";
        } else if (minUsed > 500 && textUsed >= 100 && textUsed <= 99 && gbUsed == 0) {
            result = "plan C";
        } else if (minUsed > 500 && textUsed >= 100 && gbUsed == 0) {
            result = "plan D";
        } else if (minUsed > 500 && textUsed >= 100 && gbUsed >= 1) {
            if (gbUsed <2)
                result = "plan E";
        }
        else if (gbUsed >=2){
            result = "plan F";
        }
        System.out.println("the plan you need is " + result);

    }

}