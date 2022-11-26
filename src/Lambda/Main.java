package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {


        Predicate<String> predicateLambda = a -> a.contains("ABC");
        System.out.println("Predicate Lambda: " + predicateLambda.test("bb"));

        Predicate<Integer> predicateLambda2 = a -> {
            return a > 0;
        };
        System.out.println("Predicate2 Lambda: " + predicateLambda2.test(3));


        Jumpable jumpable = initParam -> initParam.contains("jump");
        System.out.println("Lambda jumpable: " + jumpable.canJump("jumii"));


        SomeFunctionalInterface calculate = (a, b) -> makeCalculation(a, b);
        System.out.println("Lambda calculate: " + calculate.calculateSomething(2, 4));

        SomeFunctionalInterface calculate2 = (int a, int b) -> (a + b);
        System.out.println("Lambda calculate2: " + calculate2.calculateSomething(5, 4));

        SomeFunctionalInterface calculate3 = (int a, int b) -> {
            int c = makeCalculation(a, b);
            return c;
        };
        System.out.println("Lambda calculate3: " + calculate3.calculateSomething(44, 4));

        Writable writable = () -> {
            String someString1 = "Jestem ";
            String someString2 = "Lambda ";
            String someString3 = "i ";
            String someString4 = "jestem ";
            String someString5 = "super.";

            System.out.println("Lambda writable: " + someString1 + someString2 + someString3 + someString4 + someString5);
        };
        writable.doSomethingWithText();
    }

    static Integer makeCalculation(int a, int b) {
        return a + b;
    }

    interface Writable {
        void doSomethingWithText();
    }

}

class ExtraTimeForLambdas {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Wroclaw");
        list.add("");
        list.add("Wroclawwwwy");

        System.out.println(list);


        // Metoda removeIf działa tylko z predykatem i iteruje listę.
        // Jeżeli warunek z predykatu jest true usuwa elementy list zgodnie z testem predykatu

        Predicate<String> removePredicate1 = s -> s.isEmpty();
        Predicate<String> removePredicate2 = s -> s.contains("y");
        Predicate<String> removePredicate3 = s -> {
            char z = 'z';
            return s.charAt(3) != z;
        };

        list.removeIf(removePredicate1);
        System.out.println(list);

        list.removeIf(removePredicate2);
        System.out.println(list);

        list.removeIf(removePredicate3);
        System.out.println(list);
    }
}