import java.io.DataInputStream;

public class multiplicationTable {
    public static void main(String[] args) {

        DataInputStream in=new DataInputStream(System.in);
        try
        {
            int i=0,no=0;
            System.out.println("Enter the table no : ");
            no=Integer.parseInt(in.readLine());
            while(i++<10)
            {
                System.out.println(i+"*"+no+"="+(i*no));
            }
        }catch(Exception e)
        {
            System.out.println("Error");
        }

    }
}
