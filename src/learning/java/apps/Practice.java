package learning.java.apps;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) throws IOException {

//        System.out.println("Welcome to Breakfasttown! We have the following");
//        Breakfast.readItems();
//        System.out.println("Type the combo number you want, or type MMO to make your own");
//        Scanner scanner = new Scanner(System.in);
//        String order = scanner.nextLine();
//        boolean MMO = order.equals("MMO");
//
//        Breakfast myBreakfast = new Breakfast( MMO);
//
//        if (MMO) {
//            System.out.println("Make your own order by typing each item you want followed by a comma!");
//            String mmoOrder = scanner.nextLine();
//            myBreakfast.setOrder(mmoOrder);
//        } else {
//            myBreakfast.setOrder(order);
//        }
//        scanner.close();
//        System.out.println("Great, lets confirm your order...");
//        myBreakfast.confirmOrder();

        Path file = FileSystems.getDefault().getPath("./src/", "test.txt");
        List<String> lines = Files.readAllLines(file);
//        for (String line: lines) {
//            System.out.println(line);
//        }
        lines.forEach((str) -> System.out.println(str));

        try {
            loadFile("wrong/file.txt");
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    static void loadFile(String fileName) throws IOException {
        Path file = FileSystems.getDefault().getPath("./src/", fileName);
        List<String> lines = Files.readAllLines(file);
//        for (String line: lines) {
//            System.out.println(line);
//        }
        lines.forEach((str) -> System.out.println(str));
    }
}
