import java.util.*;

public class accenture2 {
    public static int sum(int arr[]){
        HashSet <Integer> uniueelement=new HashSet<>();

        int sum=0;

        for(int i=0;i<arr.length;i++){
            uniueelement.add(arr[i]);
        }

        for(int nums : uniueelement){
            sum+=nums;
        }

        return sum;

    }

    public static void main(String args[]){
        int arr[]={1,2,1,3,4,3,5,6};
        System.out.println(sum(arr));
    }
}
