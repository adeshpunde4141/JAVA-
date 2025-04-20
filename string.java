import java.util.*;

public class string {

    public static void printletters(String str){
        for(int i=0;i<str.length();i++){
            //System.out.print(str.charAt(i)+" ");

            char ch=str.charAt(i);

       

            if(Character.isDigit(ch)){
                System.out.print(ch+" ");
            }
        }
        System.out.println();
    }


    public static boolean palidrome(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }

        return true;
    }


    public static float getpath(String path){

        int x=0,y=0;
        for(int i=0;i<path.length();i++){
        char dir= path.charAt(i);

        if(dir=='s'){
            y--;
        }
        else if(dir == 'w'){
            x--;
        }
        else if(dir =='e'){
            x++;
        }else{
            y++;
        }
        }

        int x2=x*x;
        int y2=y*y;

        return (float)Math.sqrt(x2 + y2);
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // String fullname=sc.nextLine();

        // printletters(fullname);

        // System.out.println(palidrome("noon"));
        String str="wnswewnsew";

        System.out.println(getpath(str));
    
    }
}
