import java.util.*;

public class practice5 {
    public static void upadte(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }


    public static int linnear(int marks[],int key){

        for(int i=0;i<marks.length;i++){
            if(marks[i]==key){
                return i;
            }
        
        }
        return -1;
    }


    public static int largest(int marks[]){
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<marks.length;i++){
            if(marks[i]>largest){
                largest=marks[i];
            }
        }
        return largest;
    }

    public static int binary_search(int marks[],int key){
        int start=0;
        int end=marks.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(marks[mid]==key){
                return mid;
            }

            if(marks[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        return -1;
    }

    public static void reverse(int marks[]){
        int start=0,end=marks.length-1;
        
        while(start<end){
            int temp=marks[end];
            marks[end]=marks[start];
            marks[start]=temp;

            start++;
            end--;
        }
    }


    public static void pairs(int marks[]){
        for(int i=0;i<marks.length;i++){
            int curr=marks[i];
            
            for(int j=i+1;j<marks.length;j++){
                System.out.println(curr+" "+marks[j]);
            }
            System.out.println();
        }
    }

    public static void subarray(int marks[]){
        for(int i=0;i<=marks.length;i++){
            for(int j=i;j<marks.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(marks[k]+" ");
                }
                System.out.println();
            }
        }
    }


    public static void maxsubarray(int numbers[]){
        int cuursum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                cuursum=0;
                for(int k=i;k<=j;k++){
                    cuursum+=numbers[k];
                }
                System.out.print(" "+ cuursum);
                if(maxsum<cuursum){
                    maxsum=cuursum;
                }
            }
        }
        System.out.println();

        System.out.println("maximum"+maxsum);
    }


    




    public static void main(String[] args) {
        // 
        
        int marks[]={2,4,6,8,10};
        int numbers[]={1,-2,6,-1,3};
        maxsubarray(numbers);

        // pairs(marks);
        // subarray(marks);



        // int large=largest(marks);

        // System.out.println(large );


        
        // int key =sc.nextInt();
        // System.out.println(binary_search(marks, key));

        //int index=linnear(marks, key);
        //upadte(marks);

        //for(int i=0;i<marks.length;i++){
        //    System.out.println(marks[i]+" ");
        //}


    //     if(index==-1){
    //         System.out.println("not found");
    //     }
    //     else{
    //         System.out.println(index+" is the index of the no in array  ");
    //     }
    //     System.out.println();
    }
}
