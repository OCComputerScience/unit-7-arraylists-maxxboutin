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

        GeoLocation first = locationsList.get(0);
        GeoLocation second  = locationsList.get(1);
        GeoLocation third = locationsList.get(2);


        System.out.println(first.distanceFrom(second));

    }

}