package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import java.util.Scanner;

public class Soknem {
    public static void practise(){

        System.out.println("hello soknem");

        byte by=10;
        short sh=129;

        Short sh3=sh;
        System.out.println(sh3);

        byte b2=(byte)sh;
//        System.out.println("b2="+b2);


        int number2=200;
        long lo=555555;
        float fl= 556.655f;
        double dou=1665113.555;
        char ch='a';
        boolean bol=true;

        Byte by1=55;
        Short sh1=555;

        short sh4=sh1;
        System.out.println(sh4);

        Long lo1=4511l;

        int number1=10;
        int number3=5;

        int maxNumber = (number3>number1)?number3:number1;

        System.out.println("max = "+maxNumber);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number");
//        int number = scanner.nextInt();
//
//        System.out.println("name  = "+number);

        String firstName = "hi";
        String lastName  ="hello";

        String fullName = firstName.concat(lastName);

        System.out.println( fullName);
    }

    public void slides(){
        int day1 = 2;
        String dayName = switch (day1) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            default -> "Invalid day";
        };

        System.out.println(dayName);  // Output: Monday

        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }


    }
}
