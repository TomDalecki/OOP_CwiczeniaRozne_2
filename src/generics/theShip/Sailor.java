package generics.theShip;

public class Sailor {
    private String name;
    private Integer age;

    public Sailor(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String canSail(){
        return "I can sail";
    }


    @Override
    public String toString() {
        return "Sailor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

