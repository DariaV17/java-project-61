package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static void run() {
        var questions = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions, "Find the greatest common divisor of given numbers.");
    }


    public static String[] generateRound() {
        int randomNumber1 = Utils.getRandomNumber(1, 100);
        int randomNumber2 = Utils.getRandomNumber(1, 100);
        int correctAnswer = calculateGCD(randomNumber1, randomNumber2);
        return new String[]{String.valueOf(randomNumber1 + " " + randomNumber2), String.valueOf(correctAnswer)};
    }

    public static int calculateGCD(int randomNumber1, int randomNumber2) {
        int result = 0;
        for (int i = 1; i <= Math.max(randomNumber1, randomNumber2); i++) {
            if (randomNumber1 % i == 0 && randomNumber2 % i == 0) {
                result = Math.max(result, i);
            }

        }
        return result;
    }


    }



