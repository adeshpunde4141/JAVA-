import java.util.*;

public class loop1 {
    public static void main(String[] args) {
        /*int counter=0;
        while (counter<10) {
            System.out.println("hello world");
            counter++;
    }
            */

        /*int counter=1;
        while (counter<=10) {
            System.out.println(counter);
            counter++;
            
        }
            */
        /*int counter=1;
        int sum=0;
        Scanner sc = new Scanner(System.in);
        int range=sc.nextInt();

        while(counter<=range){
            sum=sum+counter;
            counter++;
        }
        System.out.println(sum);

            */

        /*patterns for loop */

        /*for (int i=1;i<5;i++){
            for(int j=1;j<5;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
            */

        /*int n= 10899;
        while (n>0) {
            int last=n%10;
            n=n/10;
            System.out.print(" "+last);
        }
            */
/* 
        int n=10899;
        int res=0;

        while (n>0) {
            int last=n%10;
            res=(res*10)+last;
            n=n/10; 
        }
        System.out.println(res); 
        */

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("enter the number: ");
            int no = sc.nextInt();

            if(no%10==0){
                break;
            }
            System.out.println(no);

        }while(true);
        
    }
    
}
