package enumerator;
import java.util.Arrays;
// enum (typ wyliczeniowy) - zbiór mozliwych do wykorzystania wartości - przechowywanych w tablicy
// enum może implementować interfejsy; enum nie może dziedziczyć
// w enum można zdefiniować metodę abstrakcyjną (ale to wymaga zabawy - każda wartość enuma musi ro implementować oddzielnie)
// enum typowe metody - values, valurOf, name, ordinal
public class Enum {
    public static void main(String[] args) {
        Volkswagen volkswagen = Volkswagen.GOLF; //pod zmienną volkswagen zawsze będzie trzymane GOLF
        System.out.println(volkswagen);

//typowe zastosowania:
        // #1
        if (Volkswagen.ARTEON.equals(volkswagen)){
            System.out.println("My car is Arteon");
        } else {
            System.out.println("My car is not Arteon");
        }
        // #2
        switch (volkswagen){
            case PASSAT:
            case ARTEON:
                System.out.println("case Passat or Arteon");
                break;
            case TIGUAN:
                System.out.println("case Tiguan");
                break;
            case GOLF:
                System.out.println("case Golf");
                break;
        }

//typowe metody:
        //values
        System.out.println("Volkswagen.values: " + Arrays.toString(Volkswagen.values()));

        int resolvedEnumIndex = 3; //gdy chcemy wiedzieć jaki enum w tablicy pod konkretną pozycją
        VolkswagenWithVariable resolvedValue2 = VolkswagenWithVariable.values()[resolvedEnumIndex];
        System.out.println(resolvedValue2);


        //valueOf
        String resolvedEnum = "GOLF"; //przychodzi nam z zewnątrz jakaś wartość
        VolkswagenWithVariable resolvedValue = VolkswagenWithVariable.valueOf(resolvedEnum);
        System.out.println(resolvedValue);
        System.out.println(resolvedValue.getMessage()); //ta metoda jest niedokończona w VolksWithVar..
        // ctrl + shift + U   - zmienia wielkość zaznaczonych liter

        //ordinal
        int someOrdinale = VolkswagenWithVariable.ARTEON.ordinal();
        System.out.println(someOrdinale);


    }

}
