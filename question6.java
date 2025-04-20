/* In a program, input 3 numbers: A, B andC. Youhave to output the average of
 these 3 numbers.
 (Hint : Average of N numbers is sum of those numbers divided by N */

import java.util.*;

public class question6{
    public static void main(String args[]){
        Scanner number= new Scanner(System.in);
        int number1=number.nextInt();
        int number2=number.nextInt();
        int number3=number.nextInt();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        int sum=number1+number2+number3;
        System.out.println(sum);

        float avg=sum/3;
        System.out.println(avg);

    }
 }