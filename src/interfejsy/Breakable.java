package interfejsy;
// jest taka konwencja w Java że interfejsy powinny być "-able"
public interface Breakable {
    void startBreaking();



// metoda defoultowa uruchomi się gdy nie zostanie nadpisana w klasie implementującej
// ale musi zostać wywołana np. w main
// może skladć sie z dwóch metod: defoult i metody private w której jest body
// defoult odwołuje się do private
    default void emergencyBreaking(){
        System.out.println("Im emergencyBreaking method");

        startEmergencyBreaking();
    }

    private void startEmergencyBreaking(){
        System.out.println("I started emergency breaking - startEmergencyBreaking");
    };


}
