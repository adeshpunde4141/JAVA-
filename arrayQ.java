import java.util.*;

public class arrayQ {
    public static void bubblesort(int series[]){
        for(int i=0;i<series.length-1;i++){
            for(int j=0;j<series.length-1-i;j++){
                if(series[j]<series[j+1]){
                int temp=series[j];
                series[j]=series[j+1];
                series[j+1]=temp;
                }
            }
        }
    }

    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr2[]={3,6,2,1,8,7,4,5,3,1};
        //bubblesort(arr2);
        //selectionsort(arr2);
        //insertionsort(arr2);
        countingsort(arr2);
        printarray(arr2);
    }



    public static void selectionsort(int series1[]){
        for(int i=0;i<series1.length-1;i++){
            int mini=i;
            for(int j=i+1;j<series1.length;j++){
                if(series1[mini]<series1[j]){
                    mini=j;
                }
            }

            int temp=series1[mini];
            series1[mini]=series1[i];
            series1[i]=temp;

        }
    }

    public static void insertionsort(int series2[]){
        for(int i=1;i<series2.length;i++){
            int curr=series2[i];
            int prev=i-1;
            while(prev>=0 && series2[prev]<curr){
                series2[prev+1]=series2[prev];
                prev--;
            }
            series2[prev+1]=curr;
        }
    }

    public static void countingsort(int series3[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<series3.length;i++){
            largest=Math.max(largest, series3[i]);
        }

        int count[]=new int[largest+1];
        for(int i=0;i<series3.length;i++){
            count[series3[i]]++;
        }
   
        int j=0;
        for(int i=count.length-1;i>=0;i--){
            while (count[i]>0) {
                series3[j]=i;
                j++;
                count[i]--;

            }
        }
    }
}
