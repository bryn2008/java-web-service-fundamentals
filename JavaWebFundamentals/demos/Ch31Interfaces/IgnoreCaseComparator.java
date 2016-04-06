package training;


import java.util.Comparator;

public class IgnoreCaseComparator implements Comparator<String> {
    @Override
    public int compare(String lhs, String rhs) {
        if (lhs == null || rhs == null) {
            throw new IllegalArgumentException("IgnoreCaseComparator cannot compare against null");
        }
        return lhs.toLowerCase().compareTo(rhs.toLowerCase());
    }
}
