package demos.extra;

public class Location {

    final double latitude;
    final double longitude;
    
    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
    
    public Location(Location rhs) {
        this.latitude = rhs.latitude;
        this.longitude = rhs.longitude;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj!= null && obj.getClass()==Location.class) {
            Location rhs = (Location)obj;
            return latitude==rhs.latitude && longitude==rhs.longitude;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (int)Double.doubleToLongBits(latitude*360.0+longitude);
    }
}
