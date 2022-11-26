package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog("Azor", 5));
        dogList.add(new Dog("Fred", 7));
        dogList.add(new Dog("Iwan", 22));
        dogList.add(new Dog("Iwan", 16));
        dogList.add(new Dog("Czarek", 1));
        System.out.println(dogList);

        Collections.sort(dogList);
        System.out.println(dogList);
    }


    public static class Dog implements Comparable<Dog> {
        private final String name;
        private final Integer age;

        public Dog(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Dog: " + name + " " + age;
        }

//        @Override
//        public int compareTo(Dog o) {
//            return this.name.compareTo(o.name);
//        }

//        @Override
//        public int compareTo(@NotNull Main.Dog o) {
//            return this.name.compareTo(o.name);
//        }

        @Override
        public int compareTo(Dog o) {
            int result = this.name.compareTo(o.name);
            if (result != 0) {
                return result;
            }

            return this.age.compareTo(o.age); //podwójne sortowanie
        }
    }

}
