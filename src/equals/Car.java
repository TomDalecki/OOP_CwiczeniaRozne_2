package equals;

import java.util.Objects;

public class Car {
private String company;
private String model;
private int age;
private int iD;

    public Car(String company, String model, int age){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return age == car.age && Objects.equals(company, car.company) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, model, age);
    }
}
