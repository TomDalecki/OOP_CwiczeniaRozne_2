package polimorfizm;

public class SUV extends Car{
    private double height;

    public SUV(final String color, final double height) {
        super(color);
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(final double height){
        this.height = height;
    }

    @Override
    public void describe() {
        System.out.println("SUV description start");
        super.describe();
        System.out.println("SUV height: " + height);
        System.out.println("SUV description end");
    }

    @Override
    public String toString() {
        return "SUV{" +
                "height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
