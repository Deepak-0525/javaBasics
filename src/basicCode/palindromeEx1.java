package basicCode;

import java.io.DataInputStream;

public class palindromeEx1 {
    public static void main(String[] args) {
        DataInputStream in=new DataInputStream(System.in);
        try
        {
            int pal=0,no=0,t=0,temp=0;
            System.out.println("Enter the no: ");
            no=Integer.parseInt(in.readLine());
            temp=no;
            while(no>0)
            {
                t=no%10;
                pal=(pal*10)+t;
                no=no/10;
            }
            if(temp==pal)
                System.out.println("The Number is Palindrome ");
            else
                System.out.println("The Number is not Palindrome ");
        }catch(Exception e)
        {
            System.out.println("Error ");
        }

    }
}
