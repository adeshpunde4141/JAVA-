import java.util.*;

public class prac3 {


    public static void spiral(int arr[][]){
        int startrow=0;
        int endrow=arr.length-1;
        int startcol=0;
        int endcol=arr[0].length-1;

        while(startrow<=endrow && startcol<=endcol){
            for(int j=startcol;j<=endcol;j++){
                System.out.print(arr[startrow][j]+" ");
            }
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(arr[i][endcol]+",");
            }
            for(int j=endcol-1;j>=startcol;j--){
                System.out.print(arr[endrow][j]+" ");
            }
            for(int i=endrow-1;i>=startcol+1;i--){
                System.out.print(arr[i][startcol]+" ");
            }


            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
    }
    public static void main (String args[]){

        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int matrix[][]=new int [n][m];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }

        }
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
        }


        spiral(matrix);




        int key=sc.nextInt();
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("key found");
                }
                if(largest<matrix[i][j]){
                    largest=matrix[i][j];
                }
            }
            System.out.println(largest);
        }
    }
}
