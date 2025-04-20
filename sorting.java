public class sorting {
    //bubble sort
    /*public static void bubblesort(int arr1[]){
        for(int turns=0;turns<arr1.length-1;turns++){
            for(int j=0;j<arr1.length-1-turns;j++){
                if(arr1[j]>arr1[j+1]){
                    int temp=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
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
        int arr[]={5,4,1,3,2};
        bubblesort(arr);
        printarray(arr);

    }*/


    //selection sort

    /*public static void selectionsort(int arr4[]){
        for(int i=0;i<arr4.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr4.length;j++){
                if(arr4[minpos]>arr4[j]){
                    minpos=j;
                }
            }

            int temp= arr4[minpos];
            arr4[minpos]=arr4[i];
            arr4[i]=temp;
        }
    }


    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        selectionsort(arr);
        printarray(arr);

    }*/

    //insertion sort

    /*public static void insertionsort(int arr5[]){
        for(int i=1;i<arr5.length;i++){
            int curr=arr5[i];
            int prev=i-1;
            while (prev>=0 && arr5[prev]>curr) {
                arr5[prev+1]=arr5[prev];
                prev--;
            }
            arr5[prev+1]=curr;
        }
    }


    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        insertionsort(arr);
        printarray(arr);

    }*/

    public static void countingsort(int arr6[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr6.length;i++){
            largest=Math.max(largest, arr6[i]);
        }
        int count[] =  new int[largest+1];
        for(int i=0;i<arr6.length;i++){
            count[arr6[i]]++;
        }

        int j=0;
        for(int i=0;i<count.length;i++){
            while (count[i]>0) {
                arr6[j]=i;
                j++;
                count[i]--;
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
        int arr[]={1,4,1,3,2,4,3,7};
        countingsort(arr);
        printarray(arr);

    }
}
