package practice.numbers;

public class PrimeGenerator extends PrimeNumbers {
    public int generateNextPrime(int lastKnownPrime) {
        int nextPrime = lastKnownPrime + 1;
        while (!isPrime(nextPrime)) {
            nextPrime++;
        }
        return nextPrime;
//        System.out.println("The next prime number after " + lastKnownPrime + " is " + nextPrime);
    }
}
