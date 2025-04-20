import java.util.*;


public class array {
    /*public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }

    public static void main(String[] args) {
        int marks[]={98,99,94};
        update(marks);

        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }*/



    /*public static int linearsearch(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
     return -1;            
            
    }

    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14,16};
        int key = 10;

        int index =linearsearch(number, key);
        if(index ==-1){
            System.out.println("not foumd");
        }
        else{
            System.out.println("number is at index"+index);
        }
       
        
    }*/


    /*public static int largest(int numbers []){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 1,2,6,5,3};
        int index=largest(numbers);
        System.out.println(index);
    }*/

    /*public static int binarysearch(int numbers[],int key){
        int start=0,end=numbers.length-1;

        while (start<=end) {
            int mid=(start+end)/2;

            if(numbers[mid]==key){
                return mid;
            }

            if(numbers[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
            
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[]={1,2,4,10,12,14,16};
        int key=10;

        System.out.println(binarysearch(numbers, key));
    }*/

    /*public static void reverse(int numbers[]){
        int start=0,end=numbers.length-1;

        while (start<end) {
            int temp=numbers[end];
            numbers[end]=numbers[start];
            numbers[start]=temp;

            start++;
            end--;
            
        }
    }

    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12};

        reverse(numbers);

        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.err.println();
    }*/

    /*public static void pairsinarray(int number1[]){

        int total=0;
        for(int i=0;i<number1.length;i++){
            int curr=number1[i];
            for(int j=i+1;j<number1.length;j++){
                System.out.print("("+curr+","+number1[j]+")");
                total++;
            }
            System.out.println();
        }

        System.out.println("total pairs: "+total);
    }

    public static void main(String[] args) {
        int number1[]={2,4,6,8,10};

        pairsinarray(number1);
    }*/

    public static void subarray(int number1[]){ 
        for(int i=0;i<number1.length;i++){
            int start=i;
            for(int j=i;j<number1.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(number1[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int number2[]={2,4,6,8,10};
        subarray(number2);
    }

    /*public static void maxsumarray(int num1[]){
        int curr=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<num1.length;i++){
            int start=i;
            for(int j=i;j<num1.length;j++){
                int end=j;
                curr=0;
                for(int k=start;k<=end;k++){
                    curr+=num1[k];
                }
                System.out.println(curr);
                if(maxsum<curr){
                    maxsum=curr;
                }
            }
        }
        System.out.println("maximum sum is: "+maxsum);
    }

    public static void main(String[] args) {
        int num1[]={1,-2,6,-1,3};
        maxsumarray(num1);
    }*/


    /*/public static void kadane(int a[]){
        int ms=Integer.MIN_VALUE;
        int crr=0;

        for(int i=0;i<a.length;i++){
            crr=crr+a[i];
            if(crr<0){
                crr=0;
            }

            ms=Math.max(crr, ms);
        }
        System.out.println(ms);
    }

    public static void main(String[] args) {
        int number3[]={-2,-3,4,-1,-2,1,5,-3};
        kadane(number3);
    }*/


    public static void trappedrainwater(int height[]){
        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++){
            
        }
    }
}
