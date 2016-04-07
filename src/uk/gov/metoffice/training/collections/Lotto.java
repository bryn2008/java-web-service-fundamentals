package uk.gov.metoffice.training.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by bryn.lloyd on 07/04/2016.
 */
public class Lotto {
    private static final int SIZE_ROW = 6;
    private static final int LOW_NUM = 1;
    private static final int HIGH_NUM = 59;
    public static void main(String[] args) {
        System.out.println("Stated");
        List<Integer> list = generateNumbers();
        System.out.println(list);
    }

    private static List<Integer> generateNumbers() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        while (list.size() < SIZE_ROW) {
            int n = random.nextInt(HIGH_NUM)+LOW_NUM;
            if (!list.contains(n)) {
                list.add(n);
            }
        }
        Collections.sort(list);
        return list;
    }
}
