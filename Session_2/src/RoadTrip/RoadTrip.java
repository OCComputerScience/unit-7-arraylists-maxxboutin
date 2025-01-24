package RoadTrip;

import java.util.ArrayList;

public class RoadTrip
{

    ArrayList<GeoLocation> geoLocations = new ArrayList<GeoLocation>();

    public RoadTrip (ArrayList<GeoLocation> locationsList)
    {

        this.geoLocations = locationsList;

    }

    public GeoLocation addStop (String stopName, double lat, double lon)
    {

        return new GeoLocation(stopName, lat, lon);

    }

    public int getNumberOfStops () {return geoLocations.size();}

    public void getTripLength (ArrayList<GeoLocation> locationsList)
    {

        double totalDistance = 0;

        for (int i = 0; i < locationsList.size(); i++)
        {

            GeoLocation location = locationsList.get(i);

            GeoLocation first = location;

            totalDistance += first.distanceFrom(location);

            System.out.println(totalDistance);

        }

    }

}