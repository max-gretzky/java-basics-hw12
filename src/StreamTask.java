import java.util.Arrays;

public class StreamTask {

    public static int getSumSquareEven(int[] numbers) {
        // TODO replace return with your code
        return Arrays.stream(numbers)
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .sum();
    }

    public static int[] getSortedOddsArray(int[] numbers) {
        // TODO replace return with your code
        return Arrays.stream(numbers)
                .filter(x -> x % 2 == 1 || x % 2 == -1)
                .sorted()
                .toArray();
    }
}
