package app;

public class Rany {
    public static void practise(){
//        1
        System.out.println("1______________________________");
        int primitiveint=10;
        float primitivefloat =3.14f;
        char primitivechar ='A';
        boolean primitiveboolean =true;
        double primitivedouble = 9.8165;
        long primitivelong =1000000000;
        byte primitivebyte = 20;
        short primitiveshort = 300;
        System.out.println("primitive Type:");
        System.out.println("int="+primitiveint);
        System.out.println("float="+primitivefloat);
        System.out.println("char="+primitivechar);
        System.out.println("boolean="+primitiveboolean);
        System.out.println("double="+primitivedouble);
        System.out.println("long="+primitivelong);
        System.out.println("byte="+primitivebyte);
        System.out.println("short="+primitiveshort);
        Integer warpperclassesinteger =15;
        Float warpperclassesfloat =2.71f;
        Character warpperclassescharacter ='B';
        Boolean warpperclasessboolean=false;
        Double warpperclasessdouble=1.2345;
        Long warpperclasessLong=2000000000L;
        Byte wapperclasessbyte=30;
        Short wapperclasessshort=400;
        System.out.println("Wapperclasess Clasess:");
        System.out.println("Integer="+warpperclassesinteger);
        System.out.println("Float="+warpperclassesfloat);
        System.out.println("Character="+warpperclassescharacter);
        System.out.println("Boolean="+warpperclasessboolean);
        System.out.println("Double="+warpperclasessdouble);
        System.out.println("Long="+warpperclasessLong);
        System.out.println("Byte="+wapperclasessbyte);
        System.out.println("Short="+wapperclasessshort);

//        2
        System.out.println("2.Ty Casing");
        double doublecast   =9.99;
        int intcast=(int )doublecast;
        System.out.println("doublecast (9.99) cast to int"+intcast);
        float floatvalue=5.75f;
        long longvalue=(long)floatvalue;
        System.out.println("floatvalue(5.75) cast to long:"+longvalue);
        System.out.println("3.Autoboxing");
        int PInt=10;
        Integer wrapperInt=PInt;
        System.out.println("primitiveInt (10) autobpxed to Integer:"+PInt);
        double PDouble=12.34;
        Double wDouble=PDouble;
        System.out.println("PrimitiveDouble (12.34) autobooxing"+PDouble);
        System.out.println("4.Unboxing:");
        Integer wrpperInt=25;
        int unboxedInt=wrpperInt;
        System.out.println("wrapperInt (25) unboxed to int:"+unboxedInt);
        Double wrpperDouble=56.78;
        double unboxeddouble=wrpperDouble;
        System.out.println("wrapperDouble (56.78) unboxed to double:"+wrpperDouble);
//        5
        System.out.println("5.Declare two interger variable");
        int a=15;
        int b=4;
        int Addition=a+b;
        System.out.println("Addition (a+b):"+Addition);
        int Sub=a-b;
        System.out.println("Subtraction (a-b):"+Sub);
        int Mul=a*b;
        System.out.println("Multiplication (a*b):"+Mul);
        int Div=a/b;
        System.out.println("Divistion (a/b):"+Div);
        int Mod=a%b;
        System.out.println("Modulus (a%b):"+Mod);
//        6
        System.out.println("6.compare two numbers:");
        int A=10;
        int B=15;
        System.out.println("A>B:"+(A>B));
        System.out.println("A<B:"+(A<B));
        System.out.println("A>=B:"+(A>=B));
        System.out.println("A<=B:"+(A<=B));
        System.out.println("A==B:"+(A==B));
        System.out.println("A!=B:"+(A!=B));
//        7
        int x=5;
        int y=10;
        System.out.println("x>0 && y<15:"+(x>0 && y<15));
        System.out.println("X<0 || y>15:"+(x<0 || y>15));
        System.out.println("!(x==y):"+!(x==y));
//        8
        int s=5;
        System.out.println("s+=2:"+(s+=2));
        System.out.println("s-=1:"+(s-=1));
        System.out.println("s*=3:"+(s*=3));
        System.out.println("s/=2:"+(s/=2));
        System.out.println("s%=2:"+(s%=2));
//        9
        System.out.println("9.c before increment: 7");
        int c=7;
        int o=9;
        System.out.println("++c:"+(++c));
        System.out.println("c++:"+(c++));
        System.out.println("o before increment: 9");
        System.out.println("--o:"+(--o));
        System.out.println("o--:"+(o--));
//        10

        System.out.println("10.use biwise operators:");
        int k=6;
        int l=3;
        System.out.println("k&l:"+(k&l));
        System.out.println("k|l:"+(k|l));
        System.out.println("k^l:"+(k^l));
//        System.out.println("~k:"+(~k));
        System.out.println("k<<1:"+(k<<1));
        System.out.println("k>>1:"+(k>>1));
//    11
        System.out.println("11.use a ternary operator to find the greater of 2 numbers");
        int i=8;
        int j=10;
        int greater=(i>j) ? x: y;
        System.out.println("Greater Value:"+greater);
//        12
        System.out.println("write a program that concatenates first name and name , then prints the full name");
        String firstname="Ny";
        String lastname="bi";
        String fullname=firstname.toUpperCase() +" "+lastname.toLowerCase();
        System.out.println("firstname="+firstname);
        System.out.println("firstname="+lastname);
        System.out.println("firstname="+fullname);
//        13
        String name="Alice";
        int age=30;
        System.out.println("enter your name:"+name);
        System.out.println("enter your age:"+age);
        System.out.println("Hello,"+name+"! You are"+age+"years old.");
//        14
    }


}
