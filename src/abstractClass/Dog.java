package abstractClass;

public class Dog extends Animal{

    @Override
    public void eatAnimalClass() {
        System.out.println("Dog is eating - method from main");


    }

    @Override
    public void runAnimalClass(int numberOfLegs) {
        System.out.println("Dog is running - method from main");
        System.out.println("Dog is running of " + numberOfLegs + " legs");

    }
}
