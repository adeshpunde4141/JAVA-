import java.util.*;

public class practice8 {

    public static int calculator(int num1,int num2){
        int sum=num1+num2;
        return sum;
    }

    public static int product(int num1,int num2){
        int product=num1*num2;
        return product;
    }

    public static int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static int binomial(int n,int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int n_r_fact=factorial(n-r);
        int bino=n_fact/(r_fact*n_r_fact);
        return bino;
    }

    public static boolean prime(int num){
        if(num==2){
            return true;
        }

        for(int i=2;i<=num-1;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void printprime(int num){
        for(int i=2;i<=num;i++){
            if(prime(i)){
                System.err.print(i+" ");
            }
        }
    }


    public static void binarytodec(int binum){
        int mynum=binum;
        int pow=0;
        int decnum=0;

        while(mynum>0){
            int last=mynum % 10;
            decnum=decnum+last * (int) Math.pow(2, pow);
            pow++;
            mynum=mynum/10;

        }
        System.out.println(decnum);
    }

    public static void dectobinary(int decnum){
        int mynum=decnum;
        int pow=0;
        int binum=0;

        while(mynum>0){
            int last=mynum % 2;
            binum=binum+last * (int) Math.pow(10, pow);
            pow++;
            mynum=mynum/2;

        }
        System.out.println(binum);
    }


    public static float avg(int a,int b,int c){
        int sum=a+b+c;

        float avg=sum/3;

        return avg;
    }

    public static boolean Even(int num){
        if(num%2!=0){
            return false;
        }
        return true;
    }

    public static void palidrome(int mynum){
        int num=mynum;
        int palidrome=0;
        while (mynum>0) {
            int last=mynum%10;
            palidrome=palidrome*10+last;
            mynum=mynum/10;
        }

        if(palidrome==num){
            System.out.println("num is palidrome");
        }
        else{
            System.out.println("no is not palindrome");
        }
    }

    public static int sumofdigits(int mynum){
        int sum=0;

        while(mynum>0){
            int last=mynum%10;
            sum=sum+last;

            mynum=mynum/10;
        }

        return sum;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int r= sc.nextInt();
        int c= sc.nextInt();
        
       binarytodec(n);
       dectobinary(r);
       System.out.println(avg(n, r, c));

       System.out.println(Even(n));
       palidrome(n);
       System.out.println(sumofdigits(n));
    }

      
    
}
