package interfejsy;
// interfejsy służą do pokazania określonego zachowania danej klasy która będzie je implementowała

// jest taka konwencja w Java że interfejsy powinny być "-able"
// wszystkie metody (poza wyjątkami) zdefiniowane w interfejsie są zdefiniowane jako "public abstract" więc nie ma potrzeby tak je określać
// tak jak w klasie abstrakcyjnej metody w interfejsie nie mają body
// w interfejsie nie ma konstruktora (również domyślnego)
// interfejsy mogą wzajemnie się dziedziczyć i mogą dziedziczyć z kilku interfejsów
// interfejsy wzajemnie mogą "extends" ale klasa może interfejs "implements"

public interface Drivable {

    void letsDrive();

    String startDriving (String firstDrive);


}
