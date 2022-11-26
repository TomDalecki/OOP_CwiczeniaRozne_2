package comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterfaceImplementationSorting {
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

        Comparator<Cat> comparator1 = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getIndex() - o2.getIndex();//sortujemy wg indexów
            }
        };
        cats.sort(comparator1);
        System.out.println(cats);

        Comparator<Cat> comparator2 = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getAge() - o2.getAge();//sortujemy wg wieku
            }
        };

        cats.sort(comparator2);
        System.out.println(cats);

        Comparator<Cat> comparator3 = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getName().compareTo(o2.getName());//sortujemy Stringa
            }
        };
        cats.sort(comparator3);
        System.out.println(cats);

        Comparator<Cat> comparator4 = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                int compTemp = o1.getAge().compareTo(o2.getAge());

                return compTemp;
            }
        };
        cats.sort(comparator4.reversed()); //odwrócenie sortowania
        System.out.println(cats);

        Comparator<Cat> comparator5 = new Comparator<Cat>() { //sortowanie po dwóch parametrach
            @Override
            public int compare(Cat o1, Cat o2) {
                int compTemp = o1.getName().compareTo(o2.getName());

                return compTemp;
            }
        }.thenComparing(new Comparator<Cat> (){
            @Override
            public int compare(Cat o1, Cat o2) {
                int compTemp = o1.getAge().compareTo(o2.getAge());

                return compTemp;
            }
        });
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
