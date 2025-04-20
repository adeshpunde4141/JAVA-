import java .util.*;

public class practice11 {
  public static void pairsinarray(int numbers[]){
    for(int i=0;i<numbers.length;i++){
        int curr=numbers[i];
        for(int j=i+1;j<numbers.length;j++){
            System.out.print("("+curr+","+numbers[j]+")");
        }
        System.out.println();
    }
  }

  public static void subarrays(int numbers[]){
    int ts=0;
    for(int i=0;i<numbers.length;i++){
        for(int j=i;j<numbers.length;j++){
            for(int k=i;k<=j;k++){
                System.out.print(numbers[k]+" ");
            }
            ts++;
            System.out.println();
        }
        System.out.println();
    }
    System.out.println(ts);
    
  }

  public static void maxsum(int numbers[]){
    int currsum=0;
    int maxsum=Integer.MIN_VALUE;

    for(int i=0;i<numbers.length;i++){
        for(int j=i;j<numbers.length;j++){
            currsum=0;
            for(int k=i;k<=j;k++){
                currsum+=numbers[k];
            }
            System.out.println(currsum);
            if(maxsum<currsum){
                maxsum=currsum;
            }
        }
    }
    System.out.println(maxsum);
  }

  public static void maxsumprefix(int numbers[]){
    int maxsum=Integer.MIN_VALUE;
    int cursum=0;
    int prefixsum[]=new int[numbers.length];

    prefixsum[0]=numbers[0];

    for(int i=1;i<numbers.length;i++){
      prefixsum[i]=prefixsum[i-1]+numbers[i];
    }

    for(int i=0;i<numbers.length;i++){
      for(int j=i;j<numbers.length;j++){
        cursum =i==0?prefixsum[j]:prefixsum[j]-prefixsum[i-1];

        if(maxsum<cursum){
          maxsum=cursum;
        }
      }
    }

    System.out.println(maxsum);
  }

  public static void kadanes(int numbers[]){
    int curr=0;
    int maxsum=Integer.MIN_VALUE;

    for(int i=0;i<numbers.length;i++){
      curr=curr+numbers[i];

      if(curr<0){
        curr=0;
      }

      maxsum=Math.max(maxsum, curr);
    }

    System.out.println(maxsum);

  }

  public static int trapping(int height[]){
    int n=height.length;
    int leftmax[]= new int[height.length];
    leftmax[0]=height[0];
    for(int i=1;i<n;i++){
      leftmax[i]=Math.max(height[i], leftmax[i-1]);
    }

    int rightmax[]=new int[height.length];
    rightmax[n-1]=height[n-1];
    for(int i=n-2;i>=0;i--){
      rightmax[i]=Math.max(height[i], rightmax[i+1]);
    }

    int trapped=0;
    for(int i=0;i<n;i++){

      int waterlevel=Math.min(leftmax[i],rightmax[i]);

      trapped+=waterlevel-height[i];
    }

    return trapped;
  }

  public static int buyandsell(int prices[]){
    int buyprice=Integer.MAX_VALUE;
    int maxprice= 0;

    for(int i=0;i<prices.length;i++){
      if(buyprice<prices[i]){
        int profit=prices[i]-buyprice;
        maxprice=Math.max(maxprice, profit);
      }
      else{
        buyprice=prices[i];
      }
    }

    return maxprice;
  }








  
  public static void main (String args[]){
    int numbers[]={-2,-3,4,-1,-2,1,5,-3};
    int height[]={4,2,0,6,3,2,5};
    int prices[]={7,1,5,3,6,4};

    //pairsinarray(numbers);
    //subarrays(numbers);
    //maxsum(numbers);
    kadanes(numbers);

    System.out.println(trapping(height));

    System.out.println(buyandsell(prices));

    
  }
}
