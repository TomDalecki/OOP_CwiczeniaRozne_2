package AbstractClass;

abstract class Animal {
    public String color;

    public Animal(String color) {
        this.color = color;

    }

    abstract void GiveMeVoice();

    public String getColor() {
        return color;
    }

    public void SomeMethod(){

        System.out.println("Im Animal SomeMethod");

    }


}
