package hexlet.code;
import hexlet.code.games.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "3 - Calc\n" +
                "4 - GCD\n" +
                "5 - Progression\n" +
                "6 - Prime\n" +
                "0 - Exit\n" +
                "Your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Cli.beggining();
                break;
            case 2:
                Even.run();
                break;
            case 3:
                Calc.run();
                break;
            case 4:
                GCD.run();
                break;
            case 5:
                Progression.run();
                break;
            case 6:
                Prime.run();
                break;
            case 0:
                System.out.println("Good bye!");
                break;
            default:
                System.out.println("Unknown game!");
        }
    }
}