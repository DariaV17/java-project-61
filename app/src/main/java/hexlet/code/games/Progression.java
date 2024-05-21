package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final int MINNUMBER = 1;
    public static final int MAXNUMBER = 10;
    public static final int MINPROGLENGTH = 5;
    public static void run() {
        var questions = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions, "What number is missing in the progression?.");
    }

    public static String[] generateRound() {
        int firstValue = Utils.getRandomNumber(MINNUMBER, MAXNUMBER);
        int step = Utils.getRandomNumber(MINNUMBER, MAXNUMBER);
        int progressionLength = Utils.getRandomNumber(MINPROGLENGTH, MAXNUMBER);
        int hiddenSymbol = Utils.getRandomNumber(0, progressionLength - 1);
        var progression = generateProgression(firstValue, step, progressionLength);

        var correctAnswer = progression[hiddenSymbol];
        progression[hiddenSymbol] = "..";
        String finalProgression = String.join(" ", progression);
        return new String[]{finalProgression, String.valueOf(correctAnswer)};
    }

    public static String[] generateProgression(int firstValue, int step, int progressionLength) {
        String[] result = new String[progressionLength];
        for (var i = 0; i < progressionLength; i++) {
            firstValue = firstValue + step;
            result[i] = Integer.toString(firstValue);
        }
        return result;
    }
}
