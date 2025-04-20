import java.util.*;

public class function {
    /*public static int multipply(int a,int b){
        int mult=a*b;
        return mult;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int mult1=multipply(a, b);
        System.out.println(mult1);
    }
        */



    /*public static int factorial1(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int fact1=factorial1(a);
        System.out.println(fact1);
    }*/




/* 
    public static int facctorial2(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static int binomialfcat(int n,int r){
        int n_fact=facctorial2(n);
        int r_fact=facctorial2(r);
        int n_r_fact=facctorial2(n-r);
        int bino=n_fact/(r_fact*n_r_fact);
        return bino;
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int binomial=binomialfcat(n, r);
        System.out.println(binomial);
    }
    */



    /*public static boolean prime(int n){
        int i=2;
        boolean isprime=true;
        if(n==2){
            isprime=true;
            
        }
        for( i=2;i<=n-1;i++){
            if(n%i==0){
            isprime=false;
            break;
            } 
        }
        return isprime;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        boolean prime1=prime(n);
        System.out.println(prime1);
    }*/


/* 
    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=n-1;i++){
            if(n%2==0){
            return false;
            }
        }
        return true;
    }

    public static void primeinrange(int n){
        for(int i=2;i<=n;i++){
            if(isprime(i)){
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primeinrange(20);
    }*/



    /*public static void bintodec(int binnum){
        int mynum=binnum;
        int pow=0;
        int decnum=0;
        while(binnum>0){
            int lastdigit=binnum%10;
            decnum=decnum+(lastdigit*(int)Math.pow(2, pow));
            pow++;
            binnum=binnum/10;
        }
        System.out.println("decimal no of"+mynum+"is: "+decnum);
    }

    public static void main(String[] args) {
       bintodec(101);
    }*/


    public static void dectobin(int decnum){
        int pow=0;
        int mynum=decnum;
        int binnum=0;
        while (decnum>0) {
            int remainder=decnum%2;
            binnum=binnum+(remainder*(int)Math.pow(10,pow));
            pow++;
            decnum=decnum/2;   
        }
        System.out.println(binnum);
    }

    public static void main(String[] args) {
        dectobin(3);
    }
}
