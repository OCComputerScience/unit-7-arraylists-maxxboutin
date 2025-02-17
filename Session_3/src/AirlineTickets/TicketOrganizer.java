package AirlineTickets;

import java.util.ArrayList;

public class TicketOrganizer
{
    public ArrayList<AirlineTicket> tickets;

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


        //loops through the list
        for (int i = 0; i < tickets.size(); i++)
        {
            //sends index of ticket to class and saves to variable
            AirlineTicket ticket = tickets.get(i);

            //saves the group number to int
            int groupNum = ticket.getBoardingGroup();


            for (int j = 0; j < tickets.size(); j++)
            {
                if (groupNum > t)
                {

                }
            }
        }

        return null;
    }

}
