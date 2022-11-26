package AbstractClass;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Red") {
            @Override
            void GiveMeVoice() {

                System.out.println("Im animal with color: " + getColor());

            }
        };
        animal.color = "GREEN";
        animal.GiveMeVoice();
        animal.SomeMethod();

       Animal dog = new Dog("YELLOW");
       dog.color = "BLUE";
       dog.GiveMeVoice();
       dog.SomeMethod();

       Cat cat = new Cat();
        String someString = cat.MyOwnCatMethod();
        System.out.println(cat.MyOwnCatMethod());
        System.out.println(someString);


    }
}
