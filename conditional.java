/*WriteaJavaprogramtogetanumberfromtheuserandprintwhether it is
 positive or negative.*/

 import java.util.*;

 public class conditional{
    public static void main(String args[]){


        /*WriteaJavaprogramtogetanumberfromtheuserandprintwhether it is
 positive or negative.*/

        /*Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();

        if(num>0){
            System.out.println("num is positive: "+num);
        }

        else{
            System.out.println("num is negative: "+num);
        }*/

        /* FinishthefollowingcodesothatitprintsYouhaveafeverifyourtemperature
 is above 100 and otherwise prints You don't have a fever.
 public class Solution {
 public static void main(String[] args) {
 double temp = 103.5;
 }
 } */

        /*double temp = 103.5;

        if(temp > 100){
            System.out.println("you have fever");
        }

        else{
            System.out.println("you dont have fever");
        }
*/

/*Writea Javaprogramtoinputweeknumber(1-7)andprintdayofweekname
 using switch case */
        
        /*Scanner sc= new Scanner(System.in);
        int week = sc.nextInt();

        switch (week) {
            case 1:
                System.out.println("monday");
                    break;
            case 2:
                System.out.println("tuesday");
                    break;
            case 3:
                System.out.println("wednesday");
                    break;
            case 4:
                System.out.println("thursday");
                    break;
            case 5:
                System.out.println("friday");
                    break;
            case 6:
                System.out.println("saturday");
                    break;
            case 7:
                System.out.println("sunday");
                    break;
        
            default:
                break;
        }*/

 /*WriteaJavaprogramthattakesayearfromtheuserandprintwhetherthat
 year is a leap year or not. */      
 
        /*Scanner sc = new Scanner(System.in);
        int year=sc.nextInt();

        if(year%4==0){
            if(year%100==0||year%400==0){
                System.out.println("it is leap year: "+year);
            }
            else{
                System.out.println("it is not leap year:"+year);
            }
        }
        else{
            System.out.println("it is not leap year: "+year);
        }*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Input the year: ");
        int year = sc.nextInt();
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));
        if (x && (y || z)) {
        System.out.println(year + " is a leap year");
        } else {
        System.out.println(year + " is not a leap year");
        }

    }
 }