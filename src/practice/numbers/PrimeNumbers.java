package practice.numbers;

public class PrimeNumbers {

    private int number;

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void listPrimeNumbers(int upperLimitNumber) {
        System.out.println("Prime numbers between 1 and " + upperLimitNumber + " are:");
        for (int i = 2; i < upperLimitNumber; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
        System.out.println();
    }
}
