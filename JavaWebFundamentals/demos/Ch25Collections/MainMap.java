package training;

import java.util.HashMap;
import java.util.Map;

public class MainMap {

    public static void main(String[] args) {
        Map<String, String> data = new HashMap<>();
        data.put("UK", "London");
        data.put("France", "Paris");
        data.put("Ireland", "Dublin");
        for (Map.Entry entry : data.entrySet()) {
            System.out.println(String.format("The capital of %s is %s%n",
                                             entry.getKey(), entry.getValue()));
        }
    }
}
