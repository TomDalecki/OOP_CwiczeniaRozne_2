package generics.unboundedWildcards;

import java.util.ArrayList;
import java.util.List;

public class UnboudedWildcard {
    public static void main(String[] args) {
        List<Fish> fish = new ArrayList<>();
        List<Beard> beard = new ArrayList<>();

        fish.add(new Fish());
        beard.add(new Beard());

        print(fish); // Jak wydrukować w jednej metodzie dwie różne listy?
        print(beard); // wildcard w parametrach metody print

        List<?> cosTamCosTam = new ArrayList<>();
        //cosTamCosTam.add("ABCD");
        //cosTamCosTam.add(true);
        // Ważne - jeżeli stworzymy np. listę z wildcard to do takiej listy nie można dodawać elemetów,
        // taka specyfika Java. Można z wildcard wykonywac na listach różne operacje ale nie można dodawać elemetów.
    }
    public static void print (List<?> elements){
        for (Object element : elements) {
            System.out.println(element);
        }
    }

    public static class Fish{
    }

    public static class Beard{
    }
}
