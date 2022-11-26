package generics.theShip;

public class Knight extends Guest {
    private String name;
    private Integer age;
    private Integer fightPower;

    public Knight(String name, Integer age, Integer fightPower) {
        this.name = name;
        this.age = age;
        this.fightPower = fightPower;
    }

    @Override
    public String toString() {
        return "Knight{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", fightPower=" + fightPower +
                '}';
    }
}
