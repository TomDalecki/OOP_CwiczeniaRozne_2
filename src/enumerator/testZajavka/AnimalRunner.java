package enumerator.testZajavka;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal animal = Animal.FISH;
        //System.out.println(animal.canSwim);
        System.out.println(animal.canSwim());

        Animal cat = Animal.CAT;
        cat.learnToSwim();

    }
}
