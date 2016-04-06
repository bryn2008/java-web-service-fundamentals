package solutions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SolarSystem {
    List<Planet> planets = new ArrayList<>();

    public SolarSystem() {
        planets.add(new Planet("Mercury", 0.39, 4879));
        planets.add(new Planet("Neptune", 30.06, 49528));
        planets.add(new Planet("Jupiter", 5.2, 142984));
        planets.add(new Planet("Uranus", 19.18, 51118));
        planets.add(new Planet("Mars", 1.52, 6792));
        planets.add(new Planet("Earth", 1, 12756));
        planets.add(new Planet("Venus", 0.72, 12104));
        planets.add(new Planet("Saturn", 9.54, 120536));
    }

    @Override
    public String toString() {
        return planets.toString();
    }

    private static class ByDistance implements Comparator<Planet> {
        @Override
        public int compare(Planet lhs, Planet rhs) {
            return (int)(lhs.getDistance() - rhs.getDistance());
        }
    }

    public List<Planet> list() {
        return new ArrayList<Planet>(planets);
     }

}
