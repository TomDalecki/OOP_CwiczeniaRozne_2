package polimorfizm;

public class Car {
    protected String color;

    public Car (final String color){
        this.color = color;
    }

    public void describe(){
        System.out.println("Car color: " + color);
    }

}
