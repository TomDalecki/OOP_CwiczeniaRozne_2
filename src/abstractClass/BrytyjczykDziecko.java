package abstractClass;

public class BrytyjczykDziecko extends Brytyjczyk {

    //Pomimo że klasa Brytyjczyk nie implementowała metod z Animal,
    //to BrytyjczykDziecko musi implementować te metody (chyba że też bedzie klasą abstrakcyjną)

    @Override
    public void eatAnimalClass() {
        System.out.println("BrytyjczykDziecko is eating - Override method from Animal class");

    }

    @Override
    public void runAnimalClass(int numberOfLegs) {
        System.out.println("BrytyjczykDziecko is running - Override method from Animal class");
        System.out.println("BrytyjczykDziecko is running of " + numberOfLegs + " legs");

    }
}
