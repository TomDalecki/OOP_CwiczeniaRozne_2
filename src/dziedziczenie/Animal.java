package dziedziczenie;

public class Animal {
    private int legs = 4;

    public Animal(){
        System.out.println("number of legs: " + legs);
    }

    public String eating(){
    String eating = "I like eating";
        System.out.println("TO SIĘ DRUKUJE TYLKO DLA KOTA i MAŁPY");
        //bo dla Kota nie nadpisałem metody
        //bo dla Małpy w nadpisaniu kazałem wywołać metodę z UpperClass
        return eating;

    }

    @Override
    public String toString() {
        return "Animal{" +
                "legs=" + legs +
                '}';
    }
}
