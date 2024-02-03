package practice.numbers;

public class PrimeVerifier extends PrimeNumbers {

    public void verifyIsPrime(int number) {
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
