package app;
import java.util.Scanner;
public class
Pheaktra {

    public static void practise()
    {
        //p1
        int a     = 10;
        float b   = 3.14f;
        char c    = 'A';
        boolean d = true;
        double e  = 9.876;
        long f    = 1000000000L;
        byte g    = 20;
        short h   = 300;
        Integer a1   = 15;
        Float b1     = 2.71f;
        Character c1 = 'B';
        Boolean e1   = false;
        Double f1    = 1.2345;
        Long g1      = 2000000000L;
        Byte h1      = 30;
        Short i1     = 400;
        System.out.println("Primitive Types:");
        System.out.println("int    : " + a);
        System.out.println("float  : " + b);
        System.out.println("char   : " + c);
        System.out.println("boolean: " + d);
        System.out.println("double : " + e);
        System.out.println("long   : " + f);
        System.out.println("byte   : " + g);
        System.out.println("short  : " + h);
        System.out.println("\nWrapper Classes:");
        System.out.println("Integer  : " + a1);
        System.out.println("Float    : " + b1);
        System.out.println("Character: " + c1);
        System.out.println("Boolean  : " + e1);
        System.out.println("Double   : " + f1);
        System.out.println("Long     : " + g1);
        System.out.println("Byte     : " + h1);
        System.out.println("Short    : " + i1);

        //p2
        double a2 = 9.99;
        int b2    = (int) a2;
        System.out.println("a2 (9.99) cast to int : " + b2);
        float c2 = 5.75f;
        long d2  = (long) c2;
        System.out.println("c2 (5.75) cast to long: " + d2);

        //p3
        int a3     = 10;
        Integer b3 = a3;
        System.out.println("a3 (10) autoboxed to Integer  : " + b3);
        double c3 = 12.34;
        Double d3 = c3;
        System.out.println("c3 (12.34) autoboxed to Double: " + d3);

        //p4
        Integer a4 = 25;
        int b4 = a4;
        System.out.println("a4 (25) unboxed to int      : " + b4);
        Double c4 = 56.78;
        double d4 = c4;
        System.out.println("c4 (56.78) unboxed to double: " + d4);
        //p5
        int a5 = 15;
        int b5 = 4;
        int addition       = a5 + b5;
        int subtraction    = a5- b5;
        int multiplication = a5 * b5;
        int division       = a5 / b5;
        int modulus        = a5 % b5;
        System.out.println("Addition (a + b)      : " + addition);
        System.out.println("Subtraction (a - b)   : " + subtraction);
        System.out.println("Multiplication (a * b): " + multiplication);
        System.out.println("Division (a / b)      : " + division);
        System.out.println("Modulus (a % b)       : " + modulus);
        //p6
        int a6 = 10;
        int b6 = 15;
        System.out.println("a > b  : " + (a6 > b6));
        System.out.println("a < b  : " + (a6 < b6));
        System.out.println("a >= b : " + (a6 >= b6));
        System.out.println("a <= b : " + (a6 <= b6));
        System.out.println("a == b : " + (a6 == b6));
        System.out.println("a != b : " + (a6 != b6));

        //p7
        int x = 5;
        int y = 10;
        System.out.println("x > 0 && y < 15  : " + (x > 0 && y < 15));
        System.out.println("x < 0 || y > 15  : " + (x < 0 || y > 15));
        System.out.println("!(x == y)        : " + !(x == y));

        //p8
        int a8  = 5;
        a8 += 2;
        System.out.println("a8 += 2 : " + a8);
        a8 -= 1;
        System.out.println("a8 -= 1 : " + a8);
        a8 *= 3;
        System.out.println("a8 *= 3 : " + a8);
        a8 /= 2;
        System.out.println("a9 /= 2 : " + a8);
        a8 %= 2;
        System.out.println("a9 %= 2 : " + a8);

        //p9
        int x3 = 7;
        System.out.println("x before increment: " + x3);
        System.out.println("++x  : " + (++x3));
        System.out.println("x++  : " + (x3++));
        System.out.println("x after increment: " + x3);
        System.out.println("--x: " + (--x3));
        System.out.println("x--: " + (x3--));
        System.out.println("x after decrement: " + x3);

        //p10
        int a7 = 6;
        int b7 = 3;
        int and = a7 & b7;
        System.out.println("a & b   : " + and);
        int or = a7 | b7;
        System.out.println("a | b   : " + or);
        int xor = a7 ^ b7;
        System.out.println("a ^ b   : " + xor);
        int not = ~a7;
        System.out.println("~a      : " + not);
        int leftShift = a7 << 1;
        System.out.println("a << 1  : " + leftShift);
        int rightShift = a7 >> 1;
        System.out.println("a >> 1  : " + rightShift);

        //p11
        int x1 = 8;
        int y1 = 10;
        int greater = (x1 > y1) ? x1 : y1;
        System.out.println("Greater value   : " + greater);

        //p12
        String firstName = "John";
        String lastName  = "Doe";
        String fullName  = firstName + " " + lastName;
        System.out.println("Full Name   : " + fullName);

        //p13
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name   : ");
        String name     = scanner.nextLine();
        System.out.print("Enter your age    : ");
        int age         = scanner.nextInt();
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        scanner.close();


        //p14
//        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter names separated by commas   : ");
        String input = scanner.nextLine();
        String[] names = input.split(",\\s*");
        for (String name1 : names) {
            System.out.println(name1);
        }
        scanner.close();

    }
}
