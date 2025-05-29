package in.sp.railwaybookingapp;

import java.util.Scanner;

import logicalQuestions.Passenger;

public class MainAppRailwayBooking
{
    final int SINGLE_TICKET_PRICE = 250;

    public void askUserDetails(Passenger passenger)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = scanner.next();
        passenger.setName(name);

        System.out.print("Enter your age : ");
        passenger.setAge(scanner.nextInt());

        if(passenger.getAge() < 5)
        {
            System.err.println("Booking denied");
            passenger.setTicketStatus(false);
        }
        else if(passenger.getAge() > 60)
        {
            int discount = 40;

            int discounted_price = SINGLE_TICKET_PRICE - (SINGLE_TICKET_PRICE * discount / 100);

            System.out.println("Booking successful - Rs. "+discounted_price+" paid");
            passenger.setTicketStatus(true);
        }
        else
        {
            System.out.println("Booking successful - Rs. "+SINGLE_TICKET_PRICE+" Paid");
            passenger.setTicketStatus(true);
        }
    }
    public static void main(String[] args)
    {

        Passenger passenger = new Passenger();

        MainAppRailwayBooking obj = new MainAppRailwayBooking();
        obj.askUserDetails(passenger);
    }
}
