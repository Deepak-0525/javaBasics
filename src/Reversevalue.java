import java.util.Scanner;

public class Reversevalue {
    public static void main(String[] args) {

                Scanner sc=new Scanner(System.in);
                int rev=0, t=0,no=0;
                System.out.println("Enter the no ");
                no=sc.nextInt();
                while(no>0){
                    t=no%10;
                    rev=(rev*10)+t;
                    no=no/10;
                }
                System.out.println("The Reverse value is "+rev);

    }
}
