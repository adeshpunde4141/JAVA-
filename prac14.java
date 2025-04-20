import java.util.*;

public class prac14 {

    public static boolean keysearch(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(key==matrix[i][j]){
                    System.out.println("key found at cell ("+i+","+j+")");
                    return true;
                }
            }
            
        }
        System.out.println("key not found");
        return false;
    }

    public static int largets(int matrix[][]){
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(largest<matrix[i][j]){
                    largest=matrix[i][j];
                }
            }
        }
       return largest; 
    }

    public static void spiral(int matrix[][]){
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;

        while(startrow<=endrow &&  startcol<=endcol){

            for(int j=startcol;j<=endcol;j++){
                System.out.print(matrix[startrow][j]+" ");
            }

            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }

            for(int j=endcol-1;j>=startcol;j--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
            }

            for(int i=endrow-1;i>=startrow+1;i--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }

            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
    }

    public static void diagonalsum(int matrix[][]){
        int sum=0;

        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i==j){
        //             sum=sum+matrix[i][j];
        //         }
        //         else if(i+j== matrix.length-1){
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }

        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];

            if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];
            }
        }

        System.out.println(sum);  
    }

    public static boolean searchsoarted(int matrix[][],int key){
        int row=0, col=matrix[0].length-1;

        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("key found at index("+row+","+col+")");
                return true;
            }

            else if(key< matrix[row][col]){
                col--;
            }
            else {
                row++;
            }
        }

        System.out.println("key not found");
        return false;
    }
    public static void main(String args[]){

        // Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();
        // int m= sc.nextInt();
        // int matrix[][] = new int[n][m];

        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         matrix[i][j]=sc.nextInt();
        //     }
        // }

        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         System.out.print(matrix[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // int key=sc.nextInt();

        // System.out.println();

        // keysearch(matrix, key);
        // System.out.println(largets(matrix));

        int matrix1[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[0].length;j++){
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }

        //spiral(matrix1);

        int key=10;
        searchsoarted(matrix1, key);

    }
}
