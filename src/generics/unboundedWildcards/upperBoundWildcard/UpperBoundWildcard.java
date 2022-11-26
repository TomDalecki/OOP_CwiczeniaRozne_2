package generics.unboundedWildcards.upperBoundWildcard;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildcard {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();
        List<Car> cars = new ArrayList<>();
        List<Fish> fishes = new ArrayList<>();

        //print(animals);
        print(dogs);
        print(cats);
        //print(cars);
        //print(fishes);

    }

    public static void print(List<? extends Voiceable> elements){ //to jest UBWildcard, ograniczenie do
                                                                // konkretnych obiektów
        for (Object element : elements) {
            System.out.println(element);
        }
    }
    static class Animal{}
    static class Dog extends Animal implements Voiceable{}
    static class Cat extends Animal implements Voiceable{}
    static class Fish extends Animal{}
    static class Car{}
    static interface Voiceable{}
}
