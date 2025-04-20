
import java.util.*;

public class Array_2d {

    /*public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("no are found at index ("+i+","+j+")");
                    return true;
                }
            }
        }
        return false;
    }

    public static int largest(int matrix[][],int key){
        int max=key;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>key){
                    max=matrix[i][j];
                    
                }
            }
        }
        System.out.println(max);
        return max;
    }

    public static int smallest(int matrix[][],int key){
        int small = key;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<small){
                    small=matrix[i][j];
                }
            }
        }
        System.out.println(small);
        return small;
    }
    public static void main(String[] args) {
        int matrix[][]=new int [3][3];

        Scanner sc = new Scanner(System.in);
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

        search(matrix, 5);
        largest(matrix,4);
        smallest(matrix, 6);

    }*/



    /*public static void spiralmatrix(int matrix[][]){
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;

        while (startrow<=endrow && startcol<=endcol) {
            for(int j=startcol;j<=endcol;j++){
                System.out.print(matrix[startrow][j]+" ");
            }

            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }

            for(int j=endcol-1;j>=startcol;j--){
                System.out.print(matrix[endrow][j]+" ");
            }
            for(int i=endrow-1;i>=startrow+1;i--){
                System.out.print(matrix[i][startcol]+" ");
            }

        startcol++;
        endcol--;
        startrow++;
        endrow--;
        }
    }


    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        spiralmatrix(matrix);
    }*/



    /*public static int disagonalsum(int matrix1[][]){
        int sum=0;

        //for(int i=0;i<matrix1.length;i++){
            //for(int j=0;j<matrix1[0].length;j++){
                //if(i==j){
                    //sum+=matrix1[i][j];
                //}
                //else if(i+j==matrix1.length-1){
                   // sum+=matrix1[i][j];
                //}
            //}
        //}

        for(int i=0;i<matrix1.length;i++){
            sum+=matrix1[i][i];
            if(i !=matrix1.length-1-i){
                sum+=matrix1[i][matrix1.length-1-i];
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        disagonalsum(matrix);
    }*/

    public static boolean staircasesearch(int matrix2[][],int key){
        int row=0, col=matrix2.length-1;

        while (row<matrix2.length && col>=0) {
            if(matrix2[row][col]==key){
                System.out.println("key found at index ("+row+","+col+")");
                return true;
            }
            else if(matrix2[row][col]<key){
                row++;
            }
            else{
                col--;
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        staircasesearch(matrix, 15);
    }
}
