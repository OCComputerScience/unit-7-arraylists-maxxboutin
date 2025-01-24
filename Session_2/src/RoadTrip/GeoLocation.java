package RoadTrip;

public class GeoLocation
{
    // Earth radius in miles
    public static final double RADIUS = 3963.1676;

    private double latitude;
    private double longitude;
    private String locName;


    /**
     * Constructs a geolocation object with given latitude and longitude
     */
    public GeoLocation(String location, double theLatitude, double theLongitude)
    {
        locName = location;
        latitude = theLatitude;
        longitude = theLongitude;
    }

    /**
     * Returns the latitude of this geolocation
     */
    public double getLatitude()
    {
        return latitude;
    }

    /**
     * returns the longitude of this geolocation
     */
    public double getLongitude()
    {
        return longitude;
    }

    // returns location name
    public String getLocName() {return locName;}

    // returns a string representation of this geolocation
    @Override
    public String toString()
    {
        return getLocName()  + " (" + getLatitude() + ", " + getLongitude() + ")";
    }

    // returns the distance in miles between this geolocation and the given
    // other geolocation
    public double distanceFrom(GeoLocation other)
    {
        double lat1 = Math.toRadians(latitude);
        double long1 = Math.toRadians(longitude);
        double lat2 = Math.toRadians(other.latitude);
        double long2 = Math.toRadians(other.longitude);
        // apply the spherical law of cosines with a triangle composed of the
        // two locations and the North Pole
        double theCos = Math.sin(lat1) * Math.sin(lat2) +
                Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2);
        double arcLength = Math.acos(theCos);
        return arcLength * RADIUS;
    }

    //gets the name of the location
    public String getName() {return locName;}
}
