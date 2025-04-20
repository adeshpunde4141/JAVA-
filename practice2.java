import java.util.*;

public class practice2 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        /*
        int num;
        int choice;
        int evensum=0;
        int oddsum=0;

        do{
            num=sc.nextInt();
            if(num%2==0){
                evensum+=num;
            }
            else{
                oddsum+=num;
            }

            choice=sc.nextInt();
        }while (choice==1);

        System.out.println(evensum);
        System.out.println(oddsum);*/


        /* 
        int num=sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println(fact);



        int no=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(no+"*"+i+"="+no*i);
        }

        */
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("new");

        for(int i=1;i<=4;i++){
            for(int j=1;j<=4-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("pyraid");

        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        


    }




}
