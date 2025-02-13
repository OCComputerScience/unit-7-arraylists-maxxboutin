package AirlineTickets;

import java.util.ArrayList;

public class TicketOrganizer
{
    ArrayList<AirlineTicket> tickets;

    public TicketOrganizer (ArrayList<AirlineTicket> tickets)
    {
        this.tickets = tickets;
    }

    public ArrayList<AirlineTicket> getTickets()
    {
        return tickets;
    }

    

}
