package RoadTrip;

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {

        GeoLocation antarctica = new GeoLocation("Antarctica", -72.429993, 21.698866);
        GeoLocation russia = new GeoLocation("Moscow", 55.7558, 37.6173);
        GeoLocation newyork = new GeoLocation("New York", 40.7128, 74.0060);

        ArrayList<GeoLocation> locations = new ArrayList<GeoLocation>();
        locations.add(antarctica);
        locations.add(russia);
        locations.add(newyork);

        RoadTrip Trip1 = new RoadTrip(locations);

        Trip1.getTripLength(locations);

    }

}