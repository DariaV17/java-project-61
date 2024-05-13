package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static void run() {
        var questions = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions, "What is the result of the expression?");
    }

    public static String[] generateRound() {
        int randomNumber1 = Utils.getRandomNumber(1, 100);
        int randomNumber2 = Utils.getRandomNumber(1, 100);
        char[] symbol = {'+', '-', '*'};
        int n = (int) Math.floor(Math.random() * symbol.length);
        char randomSymbol = symbol[n];
        int correctAnswer = sumRandomNumbers(randomNumber1, randomNumber2, randomSymbol);
        return new String[]{String.valueOf(randomNumber1 + " " + randomSymbol + " " + randomNumber2),
                String.valueOf(correctAnswer)};
    }

    public static int sumRandomNumbers(int randomNumber1, int randomNumber2, char randomSymbol) {
        var result = 0;
        switch (randomSymbol) {
            case '+':
                result = randomNumber1 + randomNumber2;
                break;
            case '-':
                result = randomNumber1 - randomNumber2;
                break;
            case '*':
                result = randomNumber1 * randomNumber2;
                break;
            default:
                throw new Error("Unknown symbol!");
        }
        return result;
    }
}
