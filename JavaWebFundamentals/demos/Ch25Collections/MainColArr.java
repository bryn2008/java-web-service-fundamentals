package training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainColArr {
    public static void main(String[] args) {
        String[] periodicTable = new String[]{
            "Hydrogen", "Helium", "Lithium"
        };

        List<String> elements = Arrays.asList("Hydrogen", "Helium", "Lithium");

        List<String> table = new ArrayList<String>(Arrays.asList(
                "Hydrogen", "Helium", "Lithium"
        ));

        String[] array = elements.toArray(new String[elements.size()]);

        List<String> list = Arrays.asList(array);


        System.out.println(Arrays.toString(array));
        System.out.println(list);

//        // Java 8 Streams
//        List<Double> numbers = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);
//        double[] vector = numbers.stream().mapToDouble(Double::doubleValue).toArray();
//        double sum = Arrays.stream(vector).sum();
    }
}
