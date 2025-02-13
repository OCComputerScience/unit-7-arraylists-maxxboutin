package RoadTrip;

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        //makes a reference to the methods in the road trips class
        RoadTrip trips = new RoadTrip();

        //adds all the stops on the road trip to the trips list
        trips.addStop("San Francisco", 37.7833, -122.4167);
        trips.addStop("Los Angeles", 34.052235, -118.243683);
        trips.addStop("Las Vegas", 36.114647, -115.172813);

        //prints out the trips that the user added and there coordinates
        System.out.println(trips);

        //gets the number of stops there will be on the trip
        trips.getNumberOfStops();

        //prints out the number of stops the trip has
        System.out.println("Stops: " + trips.getNumberOfStops());

        //prints out the total miles
        System.out.print("Total Miles: ");
        //trips.getTripLength();
    }

}