package practice.animal;

public class Dog extends Animal {

    public void wagTail() {
        System.out.println("Tail wagging");
    }
 @Override
 public void emitAnimalSound() {
     System.out.println("Woof!");
 }
}
