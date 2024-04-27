package hexlet.code;

public class Utils {
    public static final int ROUNDS_COUNT = 3;// to Engine
    public static int getRandomNumber(int minNumber, int maxNumber) {
        return minNumber + (int) (Math.random() * (maxNumber - minNumber + 1));
    }

}