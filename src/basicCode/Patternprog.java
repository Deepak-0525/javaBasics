package basicCode;

import java.util.Scanner;

public class Patternprog {
    public static void main(String[] args) {
        int n = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        n = s.nextInt();

        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for (int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }



//        Increasing Triangle pattern
//        for (int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//
//        }


//        Print a Square pattern
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                System.out.print("   *  ");
//            }
//            System.out.println();
//
//        }
    }
}
