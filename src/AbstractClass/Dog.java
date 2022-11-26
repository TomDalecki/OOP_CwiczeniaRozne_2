package AbstractClass;

public class Dog extends Animal{
    public Dog(String color) {
        super(color);
    }

    @Override
    void GiveMeVoice() {
        color = "GREY";
        System.out.println("Im a Dog and my color is:" + color);
    }
}
