package abstractClass;
public abstract class Animal {

    private int numberOfLegs;
    private String typeOfPlay;

    public abstract void eatAnimalClass();
    public abstract void runAnimalClass(int numberOfLegs);

    public void playAnimalClass(String typeOfPlay){
        this.typeOfPlay = typeOfPlay;
        System.out.println("Animal is playing - method from Animal class");
        System.out.println("Animal is playing - " + typeOfPlay);


    }


}
