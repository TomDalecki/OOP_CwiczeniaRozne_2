package generics.theShip;

import java.util.Random;

public class Pirate extends Sailor {
    private String name;
    private Integer age;
    private Integer fightPower;

    public Pirate(String name, Integer age, Integer fightPower) {
        super(name, age);
        this.name = name;
        this.age = age;
        this.fightPower = fightPower;
    }

    public double canFight() {
        Random damageValue = new Random();
        return damageValue.nextDouble();
    }


    @Override
    public String toString() {
        return "Pirate{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", fightPower=" + fightPower +
                '}';
    }
}
