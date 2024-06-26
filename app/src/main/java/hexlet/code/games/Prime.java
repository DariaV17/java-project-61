package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final int MINNUMBER = 1;
    public static final int MAXNUMBER = 100;
    public static void run() {

        var questions = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions, "Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public static String[] generateRound() {
        int randomNumber = Utils.getRandomNumber(MINNUMBER, MAXNUMBER);
        var correctAnswer = isPrime(randomNumber) ? "yes" : "no";
        return new String[]{String.valueOf(randomNumber), correctAnswer};
    }

    private static boolean isPrime(int randomNumber) {
        if (randomNumber < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(randomNumber); i++) {
            if (randomNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
