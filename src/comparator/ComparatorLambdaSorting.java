package comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambdaSorting {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat(1, "Henryk", 7));
        cats.add(new Cat(3, "Zoya", 12));
        cats.add(new Cat(4, "Norek", 4));
        cats.add(new Cat(2, "Frida", 8));
        cats.add(new Cat(6, "Benek", 9));
        cats.add(new Cat(5, "Jeff", 14));
        cats.add(new Cat(7, "Jeff", 3));
        cats.add(new Cat(9, "Zoya", 6));
        cats.add(new Cat(8, "Norek", 10));
        System.out.println(cats);

        Comparator<Cat> comparator1 = (o1, o2) -> o1.getIndex() - o2.getIndex();
        cats.sort(comparator1);
        System.out.println(cats);

        Comparator<Cat> comparator2 = Comparator.comparing((Cat cat) -> cat.getName()).reversed();
        cats.sort(comparator2);
        System.out.println(cats);

        Comparator<Cat> comparator7 = (o1, o2) -> o1.getName().compareTo(o2.getName());
        comparator7 = comparator7.thenComparing(((o1, o2) -> o1.getAge() - o2.getAge()));
        cats.sort(comparator7);
        System.out.println("podwójne sortowanie 1_imię 2_wiek " + cats);



        Comparator<Cat> comparator3 = Comparator.comparingInt(Cat::getIndex).reversed();
        cats.sort(comparator3);
        System.out.println(cats);

        Comparator<Cat> comparator4 = Comparator.comparing(Cat::getName);
        cats.sort(comparator4);
        System.out.println(cats);

        Comparator<Cat> comparator5 = Comparator.comparing(Cat::getName).reversed();
        cats.sort(comparator5);
        System.out.println(cats);
    }

    public static class Cat {
        Integer index;
        String name;
        Integer age;

        public Cat(Integer index, String name, Integer age) {
            this.index = index;
            this.name = name;
            this.age = age;
        }

        public Integer getIndex() {
            return index;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        @Override
        public String toString() {
            return index + " " + name + " " + age;
        }
    }
}
