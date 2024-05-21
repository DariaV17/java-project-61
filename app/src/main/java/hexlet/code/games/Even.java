package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final int MINNUMBER = 1;
    public static final int MAXNUMBER = 100;
    public static void run() {
        var questions = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions, "Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    private static String[] generateRound() {
        var number = Utils.getRandomNumber(MINNUMBER, MAXNUMBER);
        var correctAnswer = isEven(number) ? "yes" : "no";
        return new String[]{String.valueOf(number), correctAnswer};
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
