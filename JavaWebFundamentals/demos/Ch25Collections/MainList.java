package training;

import java.util.ArrayList;
import java.util.List;

public class MainList {

    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();
        elements.add("Hydrogen");
        elements.add("Helium");
        elements.add("Lithium");
        System.out.println(String.format("There are %d element(s)", elements.size()));
    }
}
