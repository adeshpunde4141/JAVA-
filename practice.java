import java.util.*;
public class practice {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        /* int input=sc.nextInt();

        if(input==0){
            System.out.println("its nor positive nor negative");
        }

        if(input%2==0){
            System.out.println("its a positive");
        }
        else{
            System.out.println("its a negative");
        }

        int input1=sc.nextInt();

        switch(input1){
            case 1: System.out.println("monday");
            break;
            case 2: System.out.println("tuesday");
            break; 
            case 3: System.out.println("wednesday");
            break; 
            case 4: System.out.println("thursday");
            break; 
            case 5: System.out.println("friday");
            break; 
            case 6: System.out.println("saturday");
            break; 
            case 7: System.out.println("sunday");
            break; 
           default:
           System.out.println("get valid input");
        }



        int year=sc.nextInt();

        boolean x=(year%4)==0;
        boolean y=(year%100)!=0;
        boolean z=(year%100==0 && year%400==0);

        if(x && (y||z)){
            System.out.println("its a leap year");
        }
        else{
            System.out.println("its not a leap year");
        }*/


        /*
        int input=sc.nextInt();
        int k=1;
        int sum=0;
        while(k<=input){
            sum=sum+k;
            k++;
        }
        System.out.println(sum);


        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==1 || i==5 || j==1 || j==5){
                    System.out.print(" * ");
                }
                else{
                    System.out.print(" "+" "+" ");
                } 
            }
            System.out.println();
        }


        int n=1012;
        int res=0;
        while (n>0) {
            int last=n%10;
            res=(res*10)+last;
            n=n/10;  
        }
        System.out.println(res);


        
        do{
            int input2=sc.nextInt();
            if(input2%10==0){
                continue;
            }
            System.out.println(input2);
        }while(true);*/



        int number2=sc.nextInt();
        if(number2==2){
            System.out.println("prime");
            
        }else{

        
        boolean prime=true;
    
        for(int i=2;i<=number2-1;i++){
            if(number2%i==0){
                prime=false;
            }
        }

        if(prime==true){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }



    int evensum=0;
    int oddsum=0;
    for(int i=1;i<=20;i++){
        if(i%2==0){
            evensum+=i;
        }
        else{
            oddsum+=i;
        }
    }
    System.out.println(evensum);
    System.out.println(oddsum);


    
           
    }




}
