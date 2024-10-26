package app;
import java.util.Scanner;
public class
Pheaktra {

    public static void practise()
    {
        //p13
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name   : ");
        String name     = scanner.nextLine();
        System.out.print("Enter your age    : ");
        int age         = scanner.nextInt();
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        scanner.close();

    }
}
