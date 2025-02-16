package AirlineTickets;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        //makes ticket array
        ArrayList<AirlineTicket> tickets = new ArrayList<>();

        //This inputs the passengers information into the array
        addPassengers(tickets);
        for(AirlineTicket loop: tickets)
        {
            System.out.println(loop);
        }

        // Create the TicketOrganizer object
        TicketOrganizer orderedList = new TicketOrganizer(tickets);

        // Print the methods
        System.out.println("\nPassengers Ordered by Boarding Group:" + orderedList.printPassengersByBoardingGroup());

        System.out.println("\nPassengers in line who can board together:");

    }

    //Do not touch this method! It is adding random passengers to the AirlineTicket array
    public static void addPassengers(ArrayList<AirlineTicket> tickets)
    {
        String[] names = {"Xander", "Siena", "Ella-Louise", "Dawn", "Sharon", "Ayla", "Delores", "Adrian", "Candice", "Everly", "Nevaeh", "Patricia", "Saba", "Austin", "Deanna"};
        String[] seats = {"A","B","C","D","E","F"};
        for(int index = 0; index< 15; index++)
        {
            int random = (int)(Math.random() * 5);
            AirlineTicket ticket = new AirlineTicket(names[index], seats[random], ((int)(Math.random()*5)+1), ((int)(Math.random()*8)+1));
            tickets.add(ticket);
        }
    }
}
