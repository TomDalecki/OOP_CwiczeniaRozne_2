package abstractClass;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void eatAnimalClass() {
                System.out.println("animal is eating - method from main");
            }

            @Override
            public void runAnimalClass(int numberOfLegs) {
                System.out.println("animal is running - method from main");
                System.out.println("animal is running of " + numberOfLegs + " legs");
            }
        };

        Cat cat = new MaineCoon("Zoya");
        Dog dog = new Dog();
        MaineCoon maineCoon = new MaineCoon("Frida");

        System.out.println("Animal:");
        animal.playAnimalClass("jumping");
        animal.eatAnimalClass();
        animal.runAnimalClass(4);
        System.out.println("_______________");
        System.out.println("Dog:");
        dog.playAnimalClass("hiding");
        dog.eatAnimalClass();
        dog.runAnimalClass(2);
        System.out.println("_______________");
        System.out.println("Cat:");
        cat.runAnimalClass(6);
        cat.eatAnimalClass();
        cat.playAnimalClass("jumping");
        cat.lickingFurCatClass();
        cat.sleepCatClass();
        System.out.println("_______________");
        System.out.println("MaineCoon:");
        System.out.println(maineCoon.getName());
        maineCoon.runAnimalClass(4);
        maineCoon.eatAnimalClass();
        maineCoon.playAnimalClass("turling");
        maineCoon.lickingFurCatClass();
        maineCoon.sleepCatClass();
        maineCoon.huntMaineCoonClass();
        System.out.println("_______________");

    }
}
