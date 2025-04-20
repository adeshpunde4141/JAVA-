import java.util.*;

public class prac15 {
    public static void printchar(String name){
        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }
    }

    public static boolean palindrome(String name){
        for(int i=0;i<name.length()/2;i++){
            if(name.charAt(i)!=name.charAt(name.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static float getshortestpath(String path){
        int x=0,y=0;

        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);

            if(dir == 'S'){
                y--;
            }
            else if(dir =='N'){
                y++;
            }
            else if(dir =='W'){
                x--;
            }
            else{
                x++;
            }
        }

        int x2=x*x;
        int y2=y*y;

        return (float)Math.sqrt(x2+y2);
    }

    public static void main(String args[]){
    String str="abcd";

    String str1=new String("xyz");

    Scanner sc = new Scanner(System.in);
    String name=sc.nextLine();

    System.out.println(name.length());

    System.out.println(palindrome(name));

    String path ="WNEENESENNN";

    System.out.println(getshortestpath(path));

    


    }

}
