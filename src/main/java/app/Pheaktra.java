package app;
import java.util.Scanner;
public class
Pheaktra {

    public static void practise()
    {
        //p14
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter names separated by commas   : ");
        String input = scanner.nextLine();
        String[] names = input.split(",\\s*");
        for (String name : names) {
            System.out.println(name);
        }
        scanner.close();

    }
}
