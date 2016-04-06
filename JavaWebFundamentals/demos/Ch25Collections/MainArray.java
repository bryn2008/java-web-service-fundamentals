package training;

public class MainArray {

    public static void main(String[] args) {
        String[] array = new String[] {
            "Hydrogen",
            "Helium",
            "Lithium"
        };

        System.out.println(String.format("There are %d element(s)", array.length));
        System.out.println("First element: "+array[0]);
    }
}

//        String[] array = new String[3];
//        array[0] = "Hydrogen";
//        array[1] = "Helium";
//        array[2] = "Lithium";
