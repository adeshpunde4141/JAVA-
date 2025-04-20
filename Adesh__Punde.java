import java.util.*;

public class Adesh__Punde {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;
        targetsum(arr, target);

        int arr1[]={1,2,4,5};
        int n=5;
        System.out.println(missing(arr1,n));
        
    }

    
    // 2. Find the Missing Number in an Array
// Problem:
// Given an array of n-1 integers in the range 1 to n, find the missing number.
// Input: [1, 2, 4, 5] (n = 5)


    public static int missing(int arr1[],int n){
        int expectedsum=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<arr1.length;i++){
            sum=sum+arr1[i];
        }
        
        return expectedsum-sum;
    }

    
    
// 3 Find the Pair with the Target Sum
// Problem:
// Given an array and a target sum, find two numbers in the array that add up to the target.
// Input: [2, 7, 11, 15], target 9


    public static void targetsum(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.print(arr[i]+" "+arr[j]);
                }
            }
        }
        System.out.println();
    }


    // 1. Write a function to replace uppercase characters with lowercase and lowecase with
    // uppercase characters in given text
    // Input -> "HellO WoRlD" Output-> "hELLo wOrLd"


}







