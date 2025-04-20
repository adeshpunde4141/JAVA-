import java.util.*;

public class functionQ {
    /*public static int average(int a,int b, int c){
        int average=(a+b+c)/3;
        return average;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("average of three numbers:"+average(a, b, c));
    }
        */


/* 
    public static boolean iseven(int num){
        boolean iseven=true;
        if(num%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(iseven(num));
    }
    */

    public static boolean palindrome(int num){
        int mynum=num;
        int palindrome=0;
        while (num!=0) {
            int lastdigit=num%10;
            palindrome=palindrome*10+lastdigit;
            num=num/10;
            
        }
        if(palindrome==mynum){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int num=sc.nextInt();
        System.out.println(palindrome(num));
    }
}
