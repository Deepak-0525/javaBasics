import java.util.Scanner;

public class ArmstrongEx {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int num = 0,temp = 0,arm = 0,t = 0;
        System.out.println("Enter the Number ");
        num = scan.nextInt();
        temp = num;
        while (num>0){
            t = num%10;
            arm = arm+(t*t*t);
            num = num/10;
        }
        if(temp == arm)
            System.out.println("It is a Armstrong Number");
        else
            System.out.println("It is a Not Armstrong Number");
    }
}
