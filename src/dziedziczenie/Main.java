package dziedziczenie;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Burek", 4);
        System.out.println(dog);
        System.out.println("I am a dog and " + dog.eating()); //tu nadpisałem metodę z Animal
        System.out.println("-------------------");

        Cat cat = new Cat("Miałek", 7);
        System.out.println(cat);
        System.out.println("I am a cat and " + cat.eating()); //tu metoda oryginalna z Animal
        System.out.println("-------------------");

        Monkey monkey = new Monkey("Małpka", 14);
        System.out.println(monkey);
        System.out.println("I am a monkey and " + monkey.eating()); //tu wywołuję metodę zarówno z Upper jak i SubClass
        System.out.println("-------------------");

        System.out.println(new Cat("Zoya", 10));
        System.out.println("-------------------");

    }
}
