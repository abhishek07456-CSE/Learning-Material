package JAVA.Thread;

import java.io.Serial;

class BookingSystem{
    public static int totalSeat = 10;
    public static void bookSeat(int seat){
        System.out.println("Hi @ " + Thread.currentThread().getName());
        System.out.println("please wait seat booking in process");
        if(seat <= totalSeat){
            System.out.println("seat booked successfully - " + seat);
            totalSeat -= seat;
            System.out.println("Total seat remaining in the system - "  + totalSeat);
        }else{
            System.out.println("No seat Available");
        }
    }

    public static synchronized void bookSeatThreadSafe(int seat){
        System.out.println("-------------------------------------------");
        System.out.println("Hi @ " + Thread.currentThread().getName());
        System.out.println("please wait seat booking in process");
        if(seat <= totalSeat){
            System.out.println("seat booked successfully - " + seat);
            totalSeat -= seat;
            System.out.println("Total seat remaining in the system - "  + totalSeat);
        }else{
            System.out.println("No Sufficient Seat Available");
            System.out.println("Only " + totalSeat + " Seat is available");

        }
    }
}
public class SeatBookApp  {
    public static void main(String[] args) {
        Thread user1 = new Thread(()->{
            // BookingSystem.bookSeat(7);
            BookingSystem.bookSeatThreadSafe(7);
        },"user1");

        Thread user2 = new Thread(()->{
            // BookingSystem.bookSeat(8);
            BookingSystem.bookSeatThreadSafe(8);

        },"user2");

        user1.start();
        user2.start();
    }

}
