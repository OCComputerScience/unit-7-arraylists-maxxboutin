package RoadTrip;

import java.util.ArrayList;

public class RoadTrip
{
    //makes list for the locations
    ArrayList<GeoLocation> geoLocations;

    //initializes the list
    public RoadTrip ()
    {

        this.geoLocations = new ArrayList<GeoLocation>();

    }

    //makes a stop for a location using the name with the lat and lon
    public void addStop (String name, double lat, double lon)
    {
        //makes stop with location
        GeoLocation newStop = new GeoLocation(name, lat, lon);

        geoLocations.add(newStop);
    }

    //this will return how many stops there are
    public int getNumberOfStops ()
    {
        return geoLocations.size();
    }

    //this will take in the info of the locations and will return the number of miles total
    public void getTripLength ()
    {
        double total = 0;

        //loops through the locations size
        for (int i = 0; i < geoLocations.size() - 1; i++)
        {
            //gets the miles between both locations
            GeoLocation currentLocation = geoLocations.get(i);
            GeoLocation nextLocation = geoLocations.get(i + 1);

            //gets the number of miles from the two locations
            double miles = currentLocation.distanceFrom(nextLocation);

            //adds the number of miles between all stops to the total
            total += miles;
        }

        //prints out the total number of miles between all stops
        System.out.println(total);
    }

    //prints out all the geolocations
    @Override
    public String toString()
    {
        String endString = "";

        //loops through the list and will print out in a list in number order all the locations
        for (int i = 0; i < geoLocations.size(); i++)
        {

            String location = i + 1 + ". " + geoLocations.get(i);
            endString += location + "\n";

        }

        return endString;
    }
}