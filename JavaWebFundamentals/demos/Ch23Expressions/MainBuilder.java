package training;

public class MainBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i=1; i<=10; ++i) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(i);
        }
        String line = sb.toString();
        System.out.println(line);
    }
}
