package factorial;

public class FactorialCalculator {
    public static void main(String[] args) {
        int number = 5;
        int expected = 120; // 5! = 5 * 4 * 3 * 2 * 1 = 120

        long result = calculateFactorialRecursively(number);
        assert result == expected;

        result = calculateFactorialIteratively(number);
        assert result == 120;
    }

    /**
     * Calculate factorial of number recursively.
     *
     * @param number any positive integer number greater than 0
     * @return factorial of number
     */
    public static long calculateFactorialRecursively(int number) {
        if (number == 1) {
            return 1;
        }
        return number * calculateFactorialRecursively(number - 1);
    }

    /**
     * Calculate factorial of number iteratively.
     *
     * @param number any positive integer number greater than 0
     * @return factorial of number
     */
    public static long calculateFactorialIteratively(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

}
