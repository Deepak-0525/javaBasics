package busReserveProject;

import java.io.DataInputStream;
import java.util.ArrayList;


public class BusDemo {
    public static void main(String[]args){
        DataInputStream inp = new DataInputStream(System.in);
        try{
            ArrayList<Bus> buses = new ArrayList<Bus>();
            ArrayList<Booking> bookings = new ArrayList<Booking>();

            buses.add(new Bus(1,true,2));
            buses.add(new Bus(2,false,50));
            buses.add(new Bus(3,true,48));

            int userInp = 1;

            for(Bus b:buses) {
                b.displayBusInfo();
            }

            while(userInp==1) {
                System.out.println("Enter 1 to Booking a Ticket & 2 to Exit the Booking");
                userInp = Integer.parseInt(inp.readLine());
                if(userInp == 1) {
                    Booking booking = new Booking();
                    if(booking.isAvailable(bookings,buses)) {
                        bookings.add(booking);
                        System.out.println("<<<<< Your booking is confirmed >>>>>");
                    }
                    else {
                        System.out.println("Sorry...Bus is full...!");
                        System.out.println("Try another BUS or DATE...?");
                        System.out.println("Thank you for your Booking. Safe & Enjoy your Jounery");
                    }
                }else if (userInp==2) {
                    System.out.println("Thanks for Booking....!");
                }
            }

        }catch(Exception e){
            System.err.println("Plz... Enter the  valid Data");
        }
    }
}
