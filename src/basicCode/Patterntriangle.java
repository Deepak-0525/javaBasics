package basicCode;

import java.util.Scanner;

public class Patterntriangle {
    public static void main(String[]args){
        int n=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        n = scan.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("This is your triangle pattern");
    }
}
