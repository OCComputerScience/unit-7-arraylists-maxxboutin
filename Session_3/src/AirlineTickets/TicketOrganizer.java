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

    public String printPassengersByBoardingGroup ()
    {



        for (int i = 0; i < tickets.size(); i++)
        {

            AirlineTicket ticket = tickets.get(i);

            for (int j = 0; j < tickets.size(); j++)
            {
                if (ticket.getBoardingGroup() > )
                {

                }
            }
        }

        return null;
    }

}
