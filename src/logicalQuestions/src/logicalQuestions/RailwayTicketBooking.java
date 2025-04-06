package logicalQuestions;

import java.util.Scanner;
import java.util.InputMismatchException;

class Passenger {
    String name;
    int age;
    String ticketStatus;

    Passenger(String name, int age) {
        this.name = name;
        this.age = age;
        this.ticketStatus = "Not Booked"; // default status
    }

    void bookTicket() {
        if (age < 5) {
            System.out.println("Sorry, booking is not allowed for children under 5 years.");
        } else {
            if (age > 60) {
                System.out.println("You are eligible for a senior citizen discount!");
            }
            ticketStatus = "Booked";
            System.out.println("Ticket successfully booked for " + name + ".");
        }
    }

    void displayInfo() {
        System.out.println("\n--- Passenger Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ticket Status: " + ticketStatus);
    }
}

public class RailwayTicketBooking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input from user
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            if (age <= 0) {
                System.out.println("Invalid age entered.");
                return;
            }

            // Create passenger and try to book ticket
            Passenger passenger = new Passenger(name, age);
            passenger.bookTicket();
            passenger.displayInfo();

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Age must be a number.");
        } finally {
            scanner.close();
        }
    }
}