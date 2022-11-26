package generics.theShip;

public class Merchant extends Sailor{
    private String  name;
    private Integer age;
    private Integer ernAbility;

    public Merchant(String name, Integer age, Integer ernAbility) {
        super(name, age);
        this.name = name;
        this.age = age;
        this.ernAbility = ernAbility;
    }

    @Override
    public String toString() {
        return "Merchant{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ernAbility=" + ernAbility +
                '}';
    }
}
