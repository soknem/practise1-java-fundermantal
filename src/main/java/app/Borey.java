package app;

public class Borey {
    public static void practise(){

        int a =1;
        float b=10.0f;
        char car ='A';
        boolean bool = false;
        double dou = 100.0;
        long longs = 1000000000;
        byte by = 20;
        short shorts=300;


        System.out.println(a+"\n"+b+"\n"+car+"\n"+bool+"\n"+dou+"\n"+longs+"\n"+by+"\n"+shorts);


        System.out.println("----------------------------------------------------");
        Integer aa = 10;
        Float bb=100.8f;
        Character ca = 'a';
        Boolean boool=true;
        Byte byy = 10;
        Long loggg = 1000000000L;
        Short sh = 400;
        System.out.println(aa+"\n"+bb+"\n"+ca+"\n"+boool+"\n"+byy+"\n"+loggg+"\n"+sh);


        // primitive datatype
        System.out.println("----------------------------------------------------");
        double kaka = 9.90;
        float akak = 5.75f;
        int kakaka = (int)kaka;
        System.out.println(kakaka);
        int akakak =(int)akak;
        System.out.println(akakak);

        // Wrapper class
        System.out.println("----------------------------------------------------");
        System.out.println("Unboxing");
        Integer i=25;
        Double d =56.78;
        int ii = i;
        double dd = d;
        System.out.println(ii);
        System.out.println(dd);
        System.out.println("----------------------------------------------------");
        System.out.println("Addition");
        int aaaaa =15;
        int bbbbb =4;
        System.out.println(aaaaa+bbbbb);
        System.out.println(aaaaa-bbbbb);
        System.out.println(aaaaa*bbbbb);
        System.out.println(aaaaa/bbbbb);
        System.out.println(aaaaa%bbbbb);
        System.out.println("----------------------------------------------------");
        System.out.println("Operator");
        int ao =10;
        int bo=15;
        if(ao>bo){
            System.out.println(false);
        } else if (ao<bo) {
            System.out.println(true);
        } else if (ao>=bo) {
            System.out.println(false);
        } else if (ao<=bo) {
            System.out.println(true);
        } else if (ao==bo) {
            System.out.println(false);
        } else if (ao !=bo) {
            System.out.println(true);
        }else {
            System.out.println("Invalid");
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Unary");

        int x=10;
        ++x;
        System.out.println(x);

        System.out.println("----------------------------------------------------");
        System.out.println("String");
        boolean xx =true ? true:false;
        System.out.println(xx);

        String fisrtName = "RM";
        String lastName = "Borey";
        System.out.println(fisrtName +" "+lastName);




        /*
        a > b: false
        a < b: true
        a >= b: false
        a <= b: true
        a == b: false
        a != b: true

        * */

    }
}
