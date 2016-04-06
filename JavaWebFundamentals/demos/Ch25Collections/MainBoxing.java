package training;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainBoxing {

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();

        while (numbers.size() < 10) {
            numbers.add(random.nextInt(98)+1);
        }
        double sum = 0.0;
        for (int n: numbers) {
            sum += n;
        }

//        double sum = 0.0;
//        for (int i=0; i< numbers.size(); ++) {
//            sum += numbers.get(i);
//        }

        System.out.println(numbers);
        System.out.println(String.format("The average value is %.2f",
                sum/numbers.size()));
    }
}
