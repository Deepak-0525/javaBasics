package basicCode;

import java.util.Scanner;

public class StringtoCharArray {
    public static void main(String[]args){
        String str ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        str = scan.nextLine();
        char [] chararray = str.toCharArray();
        for(char c : chararray){
            System.out.println(c);
        }
    }
}
