import java.util.*;

public class prac{
    public static void update(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]+=1;
        }
    }

    public static int linerasearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
            
        }

        return -1;
    }

    public static int lagest(int arr[]){
        int lagest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>lagest){
                lagest=arr[i];
            }
        }

        return lagest;
    }

    public static int binary(int arr[],int key){
        int start=0,end=arr.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(arr[mid]==key){
                return mid;
            }

            if(arr[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

        return -1;
    }


    public static void reserve(int arr[]){
        int start=0;int end=arr.length-1;

        while(start<=end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        start++;
        end--;
    }
    }

    public static void pairs(int arr[]){
        int curr=0;

        for(int i=0;i<arr.length;i++){
            curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.println("( "+curr+","+arr[j]+" )");
            }
        }
    }

    public static void subarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
           
        }
        
    }


    public static int maxsubarray(int arr[]){
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if(maxsum<sum){
                    maxsum=sum;
                }
               
            }
        }
        return maxsum;
        
    }

    public static void prifixsum(int arr[]){
        int sum=0;
        int maxsum=Integer.MIN_VALUE;

        int prefix[] = new int[arr.length];

        prefix[0]=arr[0];

        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                

                sum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                if(sum>maxsum){
                    maxsum=sum;
                }
            }
        }

        System.out.println(maxsum);
    }


    public static void kadane(int arr[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            cs+=arr[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs, ms);

        }

        System.out.println(ms);

    }



    

    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();
        // int arr[] = new int [n];
        

        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }

        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");

        // }

        int arr[]={2,4,6,8,10};
        System.out.println(maxsubarray(arr));
        prifixsum(arr);
        kadane(arr);

        //subarray(arr);
        //pairs(arr);

        // reserve(arr);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");

        // }


        //System.out.println(lagest(arr));

        // int key=sc.nextInt();
        
        // int index=binary(arr, key);

        // if(index ==-1){
        //     System.out.println("mot found");
        // }else{
        //     System.out.println("");
        // }


        // update(arr);

        // System.out.println("updeted array");

        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]+" ");
        // }

    }
}