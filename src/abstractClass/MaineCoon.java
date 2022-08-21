package abstractClass;

public class MaineCoon extends Cat{
private String name;

    public MaineCoon(String name) {
        this.name = name;
    }

    public void huntMaineCoonClass(){
        System.out.println("MaineCoon is huntnig  - method from MaineCoon class");
    }

    @Override
    public void eatAnimalClass() {
        System.out.println("MaineCoon is eating  - Override method from Animal class");
    }

    @Override
    public void runAnimalClass(int numberOfLegs) {
        System.out.println("MaineCoon is running - Override method from Animal class");
        System.out.println("MaineCoon is running of " + numberOfLegs + " legs");
    }

    @Override
    public void lickingFurCatClass() {
        System.out.println("MaineCoon is licking the fur - Override method from Cat class");
    }

    public String getName() {
        return name;
    }
}
