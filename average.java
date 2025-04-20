import java.util.*;

public class average {
    public static void main(String args[]){
        /*Scanner Sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int sum=a+b+c;
        float avg=sum/3;
        System.out.println(avg);*/

        /*Scanner sc = new Scanner(System.in);
        int side=sc.nextInt();
        float area=side*side;
        System.out.println(area);*/

        /*Scanner sc=new Scanner(System.in);
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();

        float total= pen+pencil+eraser;

        System.out.println("bill for user:"+total);

        float newtotal=total+(0.18f*total);

        System.out.println("gst bill"+newtotal);
        */


        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        char operator=sc.next().charAt(0);

        switch (operator) {
            case '+':System.out.println(a+b);
                        break;

            case '-':System.out.println(a-b);
                        break;

            case '*':System.out.println(a*b);
                        break;

            case '/':System.out.println(a/b);
                        break;

            case '%': System.out.println(a%b);
                        break;

            default:
            System.out.println("enter valid choice");
                break;
        }

    }
    
}
