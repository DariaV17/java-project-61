package hexlet.code;

import java.util.List;
import java.util.Scanner;

public class Greet {//delete
    public static void beggining() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        List<String> list;

        scanner.close();
    }
}