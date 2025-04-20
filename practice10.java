import java.util.*;

public class practice10 {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }

    public static int linear(int number[], int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static int largest(int numbers[]){
        int large=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(large<numbers[i]){
                large=numbers[i];
            }
        }

        return large;
    }

    public static int binarysearch(int numbers[],int key){
        int start=0,end=numbers.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(numbers[mid]==key){
                return mid;
            }

            else if(numbers[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        return -1;
    }

    public static void reverse(int numbers[]){
        int first=0,last=numbers.length-1;

        while(first<last){
        int temp=numbers[first];
        numbers[first]=numbers[last];
        numbers[last]=temp;

        first++;
        last--;

        }
    }
    
    public static void main(String args[]){
       int numbers[]={2,4,6,8,10,12,14,16,9,5,7,3};
        
       Arrays.sort(numbers);
       int key= 16;

       int index=binarysearch(numbers, key);
 
       if(index==-1){
        System.out.println("elemnet not found");
       }
       else{
        System.out.println("key is at index  " +index);
       }

       reverse(numbers);

       for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
       }

       System.out.println();

       System.out.println(largest(numbers));
    }
}
