package basicCode;

public class Swapping2numbers {
    public static void main(String[]args){
        int a=10, b=20;
        System.out.println("Before swapping this two numbers a="+a+ ",b="+b );

        int t=a;
        a=b;
        b=t;
        System.out.println("After swapping this two numbers a="+a +",b="+b);
    }
}
