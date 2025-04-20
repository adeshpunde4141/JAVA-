import java.util.*;

public class conditionalstatement {
    public static void main(String args[]){
        
        /*Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        if(a>b){
            System.out.println(a +"is greater tha"+ b);
        }
        else{
            System.out.println(b+ "is greater than"+a);
        }

        if(a%2==0){
            System.out.println(a+ " is even");
        }
        else{
            System.out.println(a+ "is odd");
        }
            */



        /* 
        Scanner sc = new Scanner(System.in);
        int income=sc.nextInt();
        float tax;

        if(income < 500000){
            tax=0;
        }
        else if(income>=500000 && income<1000000){
            tax = (float)(income * 0.20);
        }
        else{
            tax = (float)(income * 0.30);
        }

        System.out.println(tax);


        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>b && a>c){
            System.out.println(a +"is largest");
        }
        else if(b>=c){
            System.out.println(b + "is largest");
        }
        else{
            System.out.println(c +"is largest");
        }

        int marks=45;

        String type=marks>=33? "pass" : "fail"; 
        */


        //SWITCH

        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        char operator=sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
            System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
            System.out.println(a/b);
            break;
            case '%':
            System.out.println(a%b);
            break; 
        
            default:
                break;
        }
    }
}
