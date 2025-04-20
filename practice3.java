import java.util.*;

public class practice3 {
      public static int product(int a,int b){
        int mult=a*b;
        return mult;
      }

      public static int factorial(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
        return fact;
      }

      public static int binomial(int n,int r){
        int r_fact=factorial(r);
        int n_fact=factorial(n);
        int n_r_fact=factorial(n-r);
        int bino=n_fact/(r_fact*n_r_fact);
        return bino;
      }


      public static boolean isprime(int a){
        if(a==2){
            return true;
        }
        for(int i=2;i<=a-1;i++){
            if(a%2==0){
                return false;
            }
        }

        return true;

      }

      public static void printprime(int n){
        for(int i=2;i<=n;i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }  
        }
        System.out.println();
      }

      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 =sc.nextInt();
        int num2=sc.nextInt();
        //System.out.println(product(num1, num2));
        //System.out.println(factorial(num1));
        //System.out.println(binomial(num1, num2));
        System.out.println(isprime(num2));
        printprime(num2);

      }
}
