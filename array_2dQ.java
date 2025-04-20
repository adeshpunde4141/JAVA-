import java.util.*;

public class array_2dQ {

    public static void nooftimes(int matrix[][], int key){
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    count++;
                }
            }
        }
        System.out.println(count);

    }

    public static void sumofrow(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               if(i==1){
                sum+=matrix[i][j];
               }
            }
        }
        System.out.println(sum);
    }



    public static void main(String[] args) {
        int row=2 ,col =3;
        int matrix[][]=new int[row][col];

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        int transpose[][] = new int [col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               transpose[j][i]=matrix[i][j];
            }

        }
        System.out.println(transpose[col][row]);


        //nooftimes(matrix, 7);
        //sumofrow(matrix);
       
        
    }
    
}