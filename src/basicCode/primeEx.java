package basicCode;

import java.util.Scanner;

public class primeEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0,no=0;
        System.out.println("Enter the no : ");
        no=sc.nextInt();
        i=2;
        while(i<=no-1) {
            if (no % i == 0) {
                System.out.println("Not Prime ");
                break;
            }
            else
            i++;
        }
        if(i==no){
                System.out.println("It is Prime ");
        }
    }
}

