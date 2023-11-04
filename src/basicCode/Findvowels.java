package basicCode;

import java.util.Scanner;

public class Findvowels {
    public static void main(String[]args){
        String str ;
        String vowels = "aeoiuAEIOU";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        str = scan.nextLine();
        for(char c : str.toCharArray()){
            if(vowels.indexOf(c)==-1){
                System.out.print(c);

            }
        }
    }
}
