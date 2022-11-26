package generics.unboundedWildcards.lowerBoundWildcard;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildcard {
    public static void main(String[] args) {
        List<Mammal> mammals = new ArrayList<>();
        mammals.add(new Mammal());
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        List<Puppy> puppies = new ArrayList<>();
        puppies.add(new Puppy());

        printAnimals(mammals);
        printAnimals(animals);
//        printAnimals(dogs);
//        printAnimals(puppies);

        List<? super Dog> list1 = dogs;
//        list1.add(new Mammal());
//        list1.add(new Animal());
        list1.add(new Dog());
        list1.add(new Puppy());
    }

    public static void printAnimals(List<? super Animal>  element){
        for (Object elements : element) {
            System.out.println(elements);
        }
    }
    public static class Mammal {}
    public static class Animal extends Mammal{}
    public static class Dog extends Animal{}
    public static class Puppy extends Dog{}
}
