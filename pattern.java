import java.util.*;

public class pattern {
    public static void main(String[] args) {
        /* 
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of lines:");
        int lines=sc.nextInt();

        for(int i=1;i<=lines;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        */

       /*  Scanner sc=new Scanner(System.in);
        System.out.println("enter the lines:");
        int lines=sc.nextInt();
        for(int i=1;i<=lines;i++){
            for(int j=1;j<=lines-i+1;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of lines:");
        int lines=sc.nextInt();

        for(int i=1;i<=lines;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }


    }
}
