package app;

import java.util.Scanner;

public class Theafy {
    public static void practise(){
    //Exercise1();
//    Exercise2();
//    Exercise3();
//        Exercise4();
        //Exercise5();
        //Exercise6();
        //Exercise7();
        //Exercise8();
        //Exercise9();
        //Exercise10();
        //Exercise11();
        //Exercise12();
        //Exercise13();
        Exercise14();
    }
    public static void Exercise1(){
        //Data type
        //Primitive data type
        int pInt= 10;
        float pFloat= 3.14f;
        char pChar='A';
        boolean pBool= true;
        double pDouble= 9.8765;
        long pLong= 1000000000;
        byte pByte= 20;
        short pShort= 300;

        System.out.println("Primitive Types:\n");
        System.out.printf("\tint : "+pInt+"\n");
        System.out.printf("\tfloat : "+pFloat+"\n");
        System.out.printf("\tchar : "+pChar+"\n");
        System.out.printf("\tboolean : "+pBool+"\n");
        System.out.printf("\tdouble : "+pDouble+"\n");
        System.out.printf("\tlong : "+pLong+"\n");
        System.out.printf("\tbyte : "+pByte+"\n");
        System.out.println("\tshort : "+pShort+"\n");

        //Reference data type

        Integer rInt = 15;
        Float rFloat = 2.71f;
        Character rChar = 'A';
        Boolean rBool = false;
        Double rDouble = 1.2345;
        Long rLong = 2000000000L;
        Byte rByte = 30;
        Short rShort = 400;

        System.out.println("Reference data type:\n");
        System.out.print("\tInteger : ");
        System.out.printf(rInt+"\n");
        System.out.print("\tFloat : ");
        System.out.printf(rFloat+"\n");
        System.out.print("\tBoolean : ");
        System.out.printf(rBool+"\n");
        System.out.print("\tCharacter : ");
        System.out.printf(rChar+"\n");
        System.out.print("\tDouble : ");
        System.out.printf(rDouble+"\n");
        System.out.print("\tLong : ");
        System.out.printf(rLong+"\n");
        System.out.print("\tByte : ");
        System.out.printf(rByte+"\n");
        System.out.print("\tShort : ");
        System.out.printf(rShort+"\n");
    }
    public static void Exercise2(){
        //Declare a double and cast it to int.
        double dou=9.99;
        int castToInt=(int)dou;
        System.out.println(castToInt);
        //Declare a float and cast it to long.
        float flo=5.75f;
        long lo=(long)flo;
        System.out.println(lo);
    }
    public static void Exercise3(){
        //Assign an int primitive to an Integer wrapper class (autoboxing)
        int a=10;
        Integer b = a;
        System.out.println(b);
        //Assign a double primitive to a Double wrapper class (autoboxing)
        double c=12.34;
        Double d=c;
        System.out.println(d);
    }
    public static void Exercise4(){
        //Assign an Integer wrapper class to an int primitive (unboxing)
        Integer a=25;
        int b=a;
        System.out.println(b);
        //Assign a Double wrapper class to a double primitive (unboxing)
        Double c=12.34;
        double d=c;
        System.out.println(d);
    }
    public static void Exercise5(){
//        Declare two integer variables, a = 15 and b = 4
        int a=15,b=4;
        int addition=a+b;
        int subtraction=a-b;
        int multiplication=a*b;
        int division=a / b;
        int modulus=a % b;
        System.out.println("Addition (a + b):"+addition);
        System.out.println("Subtraction (a - b):"+subtraction);
        System.out.println("Multiplication (a * b):"+multiplication);
        System.out.println("Division (a / b):"+division);
        System.out.println("Modulus (a % b):"+modulus);

    }
    public static void Exercise6(){
        //Compare two numbers, a = 10 and b = 15,
        //using relational operators (>, <, >=, <=, ==, !=)
        int a=10,b=15;
        boolean c=a > b;
        boolean d=a < b;
        boolean e=a >= b;
        boolean f=a <= b;
        boolean g=a == b;
        boolean h=a != b;
        System.out.println("a > b:"+c);
        System.out.println("a < b:"+d);
        System.out.println("a >= b:"+e);
        System.out.println("a <= b:"+f);
        System.out.println("a == b:"+g);
        System.out.println("a != b:"+h);
    }
    public static void Exercise7(){
        //Use logical operators to combine conditions on
        // x = 5 and y = 10.
        int x=5,y=10;
        boolean a=x > 0 && y < 15;
        boolean b=x < 0 || y > 15;
        boolean c=!(x == y);
        System.out.println("x > 0 && y < 15:"+a);
        System.out.println("x < 0 || y > 15:"+b);
        System.out.println("!(x == y):"+c);

    }
    public static void Exercise8(){
        //Use assignment operators to modify the value of a variable a = 5.
        int a=5;
        System.out.println("a += 2:"+ (a += 2));
        System.out.println("a -= 1:"+(a -= 1));
        System.out.println("a *= 3:"+(a *= 3));
        System.out.println("a /= 2:"+(a /= 2));
        System.out.println("a %= 2:"+(a %= 2));
    }
    public static void Exercise9(){
        //Use unary operators (++, --, +, -) on a variable x = 7
        int x=7;
        System.out.println("x before increment: "+x);
        System.out.println("++x:" + ++x);
        System.out.println("x++:" + x++);

        System.out.println("x after increment: "+x);
        System.out.println("--x:" + --x);
        System.out.println("x--:" + x--);

        System.out.println("x after increment: "+x);

    }
    public static void Exercise10(){
        //Use bitwise operators (&, |, ^, ~, <<, >>) on integers a = 6 and b = 3
        int a=6,b=3;
        System.out.println("a & b:"+(a & b));
        System.out.println("a | b:"+(a | b));
        System.out.println("a ^ b:"+(a ^ b));
        System.out.println("~a:"+(~a));
        System.out.println("a << 1:"+(a << 1));
        System.out.println("a >> 1:"+(a >> 1));
    }
    public static void Exercise11(){
        //Use a ternary operator to find the greater
        // of two numbers x = 8 and y = 10.
        int x=8,y=10;
        int max = Math.max(x, y);
        System.out.println("Greater value:"+max);


    }
    public static void Exercise12(){
        //Write a program that concatenates first name
        // and last name, then prints the full name
        String firstName = "John";
        String lastName = "Doe";
        System.out.println("Full name : "+ firstName+" "+lastName);


    }
    public static void Exercise13(){
        //Write a program that reads a user's name and age using the Scanner
        // class.
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=cin.nextLine();
        System.out.print("Enter your age: ");
        int age=cin.nextInt();
        System.out.print("Hello, "+name+"! You are "+age+" years old");
    }
    public static void Exercise14(){
        //Write a program that reads a list of names separated
        // by commas and prints each name on a new line.
        System.out.print("Enter names separated by commas : ");

        Scanner cin = new Scanner(System.in);
        String name=cin.nextLine();
        cin=new Scanner(name);
        cin.useDelimiter(",");
        while(cin.hasNext()){
            System.out.println(cin.next());
        }

    }
}
