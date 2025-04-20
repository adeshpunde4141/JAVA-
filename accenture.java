 import java.util.*;

// public class accenture {
//     public static int hour(int arr[]){
//         int count=0;
        
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==60){
//                 count++;
//             }
//         }
        

//         for(int i=0;i<arr.length-1;i++){
//         for(int j=i+1;j<=i+1;j++){
//             if(arr[i]+arr[j]>=60){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }


//     public static boolean prime(int n){
//         if(n==2){
//             return true;
//         }
//         else{
//             for(int i=2;i<=n-1;i++){
//                 if(n%i==0){
//                     return false;
//                 }
//             }
//         }

//         return true;
//     }

//     public static int sum(int n){
//         int sum=0;

//         for(int i=2;i<=n;i++){
//             if(prime(i)){
//                 sum+=i;
//             }
//         }

//         return sum;
//     }

//     public static void main (String args[]){
//         // int arr[]={2,2,55,60,60};
//         // System.out.println(hour(arr));

//         Scanner sc=new Scanner(System.in);
      
//         int n=sc.nextInt();
//         prime(n);
//         System.out.println(sum(n));

//     }

    
//     }



public class accenture{

    public static int largest(int arr[]){
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }

        return largest;
    }

    public static boolean palidrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }

        return true;
    }

    public static void missing(int arr[]){
        int n=arr.length+1;

        int expextedsum=n*(n+1)/2;

        int actualsum=0;
        for(int i=0;i<arr.length;i++){
            actualsum+=arr[i];
        }

        int missing=expextedsum-actualsum;

        System.out.println(missing);

    }

    public static void intersection(int arr1[],int arr2[]){
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i=0,j=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                i++;
            }else if(arr2[j]<arr1[i]){
                j++;
            }else{
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
        }

    }


    public static void removedupliate(int arr[]){
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }

        System.out.println(set);
    }

    public static void occurence(int arr[]){
        Arrays.sort(arr);

        int count=1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }else{
                System.out.println("occursce"+arr[i-1]+"is"+count+"no of times");
                count=1;
            }
        }

        System.out.println(arr[arr.length-1]+"no of time"+count);
    }

    public static int secondlargest(int arr[]){
       if(arr.length<2){
        System.out.println("lenghth is small");
        return -1;
       }

        Arrays.sort(arr);
        int largest=arr[arr.length-1];
        int secondlargest=Integer.MIN_VALUE;

        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]!=largest){
                System.out.println(arr[i]);
                secondlargest=arr[i];
                return secondlargest;
            }
        }
        System.out.println();

        return -1;
    }




    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        // String str=sc.nextLine();

        // if(palidrome(str)==true){
        //     System.out.println("is palidrome");
        // }else{
        //     System.out.println("not palidrome");
        // }



        // String str2=new StringBuilder(str).reverse().toString();

        // System.out.println(str2);

        // int arr[]=new int[6];

        // for(int i=0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();
        // }

        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }

        // int arr[]={1,2,4,5,6};
        // int arr2[]={1,2,4,7};
        // intersection(arr, arr2);

        //missing(arr);


        // System.out.println(largest(arr));


        int arr[]={1,1,1,1,1,2,3};
        secondlargest(arr);
        // occurence(arr);
        // removedupliate(arr);
    }
}
