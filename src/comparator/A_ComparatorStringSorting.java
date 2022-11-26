package comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class A_ComparatorStringSorting {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("1", "aA", "Z", "z", "Yy", "WW", "wW", "Ww", "W", "w");
        System.out.println(strings);

        Comparator<String> comparator = Comparator.naturalOrder();
        strings.sort(comparator);
        System.out.println(comparator); //tu nie może być wpisany comparator
        System.out.println(strings);

        //Comparator jest interfejsem funkcyjnym - 3 metody implementacji:
        // 1) klasa, implementacja interfejsu - nie bedzie omówione
        // 2) klasa anonimowa - zrealizowana w klasie ComparatorInterfaceImpl...
        // 3) Lambda - zrealizowana w klasie ComparatorLambda...



    }

}
