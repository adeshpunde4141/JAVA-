import java.util.*;

public class practice4 {
    /*public static void bintodec(int binary){
        int mynum=binary;
        int pow=0;
        int dec=0;

        while(binary>0){
            int last = binary % 10;
            dec=dec+(last*(int)Math.pow(2,pow));
            pow++;
            binary=binary/10;
            
        }

        System.out.println(dec);
    }*/

    public static void main(String args[]){
     

       hollo(4, 5);
       interveted(5);
       half_imverted(5);
       floyds(4);
       binary_trai(5);

       /*if(palidrome(num1)==true){
        System.out.println("its palidrome");
       }
       else{
        System.out.println("not palidrome");
       }*/
       
    }


    /*public static void dectobin(int decimal){
        int mynum=decimal;
        int pow=0;
        int bin=0;

        while(decimal>0){
            int res=decimal%2;

            bin=bin+(res*(int)Math.pow(10,pow ));
            pow++;

            decimal=decimal/2;
            
        }
        System.out.println(bin);
    }*/


    /*public static float average(float a,float b,float c){
        float sum=a+b+c;
        float avg=sum/3;
        return avg;
    }*/


    
    public static boolean palidrome(int mynum){
        int num=mynum;
        int palidromme=0;
        

        while(mynum>0){
            int last=mynum%10;
            palidromme=palidromme*10+last;
            mynum=mynum/10;
        }
        if(palidromme==num){
            return true;
        }
        return false;
    }


    public static int sumoddigit(int num4){
        int number3=num4;
        int sum=0;

        while (num4>0) {
            int last=num4%10;
            sum=sum+last;
            num4=num4/10;
 
        }
        return sum;
    }


    public static void hollo(int n ,int m){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||j==1||i==n||j==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void interveted(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void half_imverted(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floyds(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }

    public static void binary_trai(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
               if((i+j)%2==0){
                System.out.print("1");
               }
               else{
                System.out.print("0");
               }
            }
            System.out.println();
        }
    }
}
