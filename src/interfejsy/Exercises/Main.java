package interfejsy.Exercises;

public class Main {
    public static void main(String[] args) {
        String name = TestInterface.name;
        TestInterface testInterface = new KlasaImplementujaca();
        KlasaImplementujaca klasaImpl = new KlasaImplementujaca();

        System.out.println(testInterface.someInterface());
        System.out.println(klasaImpl.someInterface());

        testInterface.someDefaultMethod();
        klasaImpl.someDefaultMethod();
    }
}
