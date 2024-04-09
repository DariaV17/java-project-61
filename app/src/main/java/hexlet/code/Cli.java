package hexlet.code;

import java.util.List;
import java.util.Scanner;

public class Cli {
    public static void beggining() {//naming greetings
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        List<String> list;

        scanner.close();
    }
}