package dziedziczenie;

public class Dog extends Animal{
    private String name;
    private int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override // w tym miejscu sam dopisałem @Override
    public String eating() {
        String eating = "I like to eat BONES";
        return eating;
    }



    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
