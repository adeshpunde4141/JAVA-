import java.util.*;

public class adesh_punde {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int number=sc.nextInt();
        System.out.println("given number is "+ number);
        System.out.println("sum of the number is " +sum(number));

        System.out.println();   
 
        String text ="hello world";
        System.out.println("Number of vowels: " + count(text));

        System.out.println();

        int arr[]={1, 2, 3, 4, 3, 2, 5};
        duplicate(arr);

        System.out.println();

        int n= sc.nextInt();
        fizzBuzz(n);
        

    
    }

    //sum of all digits in number

    public static int sum(int number){
        
        int sum=0;
        while(number>0){
            int last=number%10;
            
            sum=sum+last;

            number=number/10;
            
        }

        return sum;

    }

    //count vowels in array

    public static int count(String text) {
        if (text == null) {
            return 0;
        }

        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }

        return count;
    }


    //find duplicates in the array

    public static void duplicate(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+ " ");
                }
            }
        }
    }


    //fixbuzzchallenge

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz"+",");
            } else if (i % 3 == 0) {
                System.out.print("Fizz"+",");
            } else if (i % 5 == 0) {
                System.out.print("Buzz"+",");
            } else {
                System.out.print(i+",");
            }

        }
        System.out.println(); 
    }
}

























