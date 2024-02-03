import practice.animal.Cat;
import practice.animal.Dog;
import practice.banking.BankAccount;
import practice.banking.CheckingAccount;
import practice.numbers.PrimeGenerator;
import practice.vehicle.CarModel;
import practice.numbers.PrimeVerifier;
import practice.numbers.PrimeNumbers;

public class Main {
    public static void main(String[] args) {

        CarModel car = new CarModel();
        car.setCarModelName("Mercedes");
        car.setCarPrices(25000, 35000, 45000);
        car.showCarDetails();
        System.out.println();

        CarModel car2 = new CarModel();
        car2.setCarModelName("Mercedes");
        car2.setCarPrices(25000, 35000, 45000);
        car2.showCarDetails();

        System.out.println("\n####################################\n");

        Dog myDog = new Dog();
        myDog.wagTail();
        myDog.emitAnimalSound();

        Cat myCat = new Cat();
        myCat.scratchFurniture();
        myCat.emitAnimalSound();

        System.out.println("\n####################################\n");

        BankAccount account = new BankAccount();
        account.setAccountHolder("John Doe");
        account.setAccountNumber("123456789");
        account.deposit(5000);
        account.showBalance();

        // Doing some banking operations

        CheckingAccount myCheckingAccount = new CheckingAccount();
        myCheckingAccount.setAccountBalance(1000);
        myCheckingAccount.setPlatinumClient(true);
        myCheckingAccount.chargeMonthlyFee();
        myCheckingAccount.deposit(500);
        myCheckingAccount.showBalance();

        System.out.println("\n####################################\n");

        PrimeVerifier primeVerifier = new PrimeVerifier();
        primeVerifier.verifyIsPrime(7);

        PrimeGenerator primeGenerator = new PrimeGenerator();
        int lastKnownPrimeOf = 999999999;
        int nextPrime = primeGenerator.generateNextPrime(lastKnownPrimeOf);

        System.out.println("The next prime number after " + lastKnownPrimeOf + " is " + nextPrime);

        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.listPrimeNumbers(100);

    }
}
