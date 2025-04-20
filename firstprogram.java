/*public class firstprogram {
    public static void main(String []args){
        int age =10;
        char na='a';
        double fl=10.11;
        String name = "adesh";

    }
}*/

import java.util.*;

public class firstprogram{
    public static void main(String args[]){
        /* 
        
        System.out.println("adesh");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");

        int a=10;
        int b=5;
        int sum=a+b;
        System.out.println("sum of two numbers"+sum);

        Scanner sc = new Scanner(System.in);
        int m= sc.nextInt();
        System.out.println(m);

        int num1= sc.nextInt();
        int num2=sc.nextInt();
        int sum2=num1+num2;
        System.out.println(sum2);

        //product
        //area

        int c=99;
        float d=c;
        System.out.println(d);

        float e=99.12F;
        int s=(int)e;
        System.out.println(s);

        char ch='a';
        int num3=ch;
        System.out.println(num3);

        */

        //questions
         
        Scanner sc =new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int number3=sc.nextInt();

        int sum=number1+number2+number3;

        float avg= sum/3;
        System.out.println(avg);

        int rad=sc.nextInt();
        int area=rad*rad;
        System.out.println(area);

        float pencil=sc.nextInt();
        float pen = sc.nextInt();
        float eraser = sc.nextInt();

        float total=pen+pencil+eraser;
        System.out.println(total);

        float bill=total+(total*0.18F);
        System.out.println(bill);
    }
}
