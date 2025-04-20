import java.util.*;
public class oop {
    public static void main(String[] args) {
        pen p1=new pen();

        p1.setcolor("blue");
        System.out.println(p1.getcolor());
        p1.settip(5);
        System.out.println(p1.gettip());


        Bankaccount myacc=new Bankaccount();
        myacc.name="adesh";
        myacc.setpassword("adesh@123");
        System.out.println(myacc.name);

        Student s1 = new Student("adesh");
        System.out.println(s1.name);
        
        
    }
}

class pen{
    private int tip;
    private String color;

    String getcolor(){
        return this.color;
    }

    int gettip(){
        return this.tip;
    }

    void setcolor(String newcolor){
        this.color=newcolor;
    }

    void settip(int newtip){
        this.tip= newtip;
    }
}

class Bankaccount{
    public String name;
    private String password;

    public void setpassword(String pwd){
        password=pwd;
    }

}

class Student{
    String name;
    int marks;

    Student(String name){
        this.name=name;
        System.out.println("contructor is called...");
    }
}