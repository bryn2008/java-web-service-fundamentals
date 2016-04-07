package uk.gov.metoffice.training.exceptions;

/**
 * Created by bryn.lloyd on 07/04/2016.
 */
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainException {
    private final static File FILE = new File("jabberwocky.txt");

    public static void main(String[] args){
        List<String> lines = readFileTry(FILE);

    }

    private static List<String> readFileTry(File file) {
        try (BufferedReader reader = Files.newBufferedReader(file.toPath())) {
            List<String> lines = new ArrayList<>();
            String line = null;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            return lines;
        }
        catch (IOException x) {
            System.err.format("Error: %s%n", x);
        }
        return null;
    }
}

//    public static void main(String[] args) {
//        System.out.println("Start");
//        int n = parseInteger("42£", 99);
//        System.out.println(n);
//        System.out.println("end");
//    }
//
//    private static int parseInteger(String text, int defaultValue) {
//        try {
//            return Integer.parseInt(text);
//        }
//        catch (NumberFormatException ex) {
//            System.out.println("Error exception caught");
//            return defaultValue;
//        }
//    }
//}

//    public static void main(String[] args) {
//        List<String> text1 = readFileTry(FILE);
//        try {
//            List<String> text2 = readFileThrow(FILE);
//        }
//        catch (IOException x) {
//            System.err.format("Error: %s%n", x);
//            System.exit(1);
//        }
//        String[] names = parseName("James Arthur Gosling");
//        System.out.println(Arrays.toString(names));
//    }
//
//    private static int parseInteger(String text, int defaultValue) {
//        try {
//            return Integer.parseInt(text);
//        }
//        catch (NumberFormatException ex) {
//            return defaultValue;
//        }
//    }
//
//    private static List<String> readFileTry(File file) {
//        try (BufferedReader reader = Files.newBufferedReader(file.toPath())) {
//            List<String> lines = new ArrayList<>();
//            String line = null;
//            while ((line = reader.readLine()) != null) {
//                lines.add(line);
//            }
//            return lines;
//        }
//        catch (IOException x) {
//            System.err.format("Error: %s%n", x);
//        }
//        return null;
//    }
//
//    private static void readXmlJava6(String filename) {
//        FileReader reader = null;
//        try {
//            reader = new FileReader(filename);
//            XMLInputFactory factory = XMLInputFactory.newInstance();
//            XMLStreamReader xml = factory.createXMLStreamReader(reader);
//            // process XML data
//        }
//        catch (IOException ex) {
//            // handle error
//        }
//        catch (XMLStreamException ex) {
//            // same handle error
//        }
//        finally {
//            if (reader != null) {
//                try { reader.close(); } catch (IOException ex) {}
//            }
//
//        }
//    }
//
//    private static void readXml(String filename) {
//        try (FileReader reader = new FileReader(filename)) {
//            XMLInputFactory factory = XMLInputFactory.newInstance();
//            XMLStreamReader xml = factory.createXMLStreamReader(reader);
//            // process XML data
//        }
//        catch (IOException | XMLStreamException ex) {
//            // handle error
//        }
//    }
//
//    private static List<String> readFileThrow(File file) throws IOException {
//        try (BufferedReader reader = Files.newBufferedReader(file.toPath())) {
//            List<String> lines = new ArrayList<>();
//            String line = null;
//            while ((line = reader.readLine()) != null) {
//                lines.add(line);
//            }
//            return lines;
//        }
//    }
//
//    /**
//     * @param fullname space separated name
//     * @return array of individual names
//     * @exception IllegalArgumentException on empty string
//     */
//    private static String[] parseName(String fullname) {
//        if (fullname == null || "".equals(fullname)) {
//            throw new IllegalArgumentException("Cannot parse a null or empty name");
//        }
//        return fullname.split(" ");
//    }
//}