package generics.theShip;

public class Main {
    public static void main(String[] args) {

        Ship<Sailor, Guest> darPomorza = new Ship<>();

        Sailor sailor = new Sailor("Mark", 33);
        Sailor pirate = new Pirate("John", 45, 8);
        Knight knight = new Knight("Arnold", 35, 24);
        Sailor sailor1 = new Merchant("Julka", 25, 67);
        Merchant merchant = new Merchant("Franek", 45, 78);
        Pirate pirate1 = new Pirate("BlackJack", 39, 23);
        Dog dog = new Dog("Burek");


        darPomorza.onBoardCrewMember(sailor);
        darPomorza.onBoardCrewMember(pirate);
        darPomorza.onBoardGuest(knight);
        darPomorza.onBoardCrewMember(sailor1);
        darPomorza.onBoardCrewMember(merchant);

        System.out.println(pirate1.canFight());
        System.out.println(pirate1.canSail());


        for (int i = 0; i < darPomorza.getShipCrewMemberList().size(); i++) {
            System.out.println(darPomorza.getShipCrewMemberList().get(i));
        }
        for (int i = 0; i < darPomorza.getShipGuestList().size(); i++) {
            System.out.println(darPomorza.getShipGuestList().get(i));
        }

        System.out.println("UNBORDING");
        darPomorza.unBoardShip(sailor, knight);

        System.out.println(darPomorza.getShipCrewMemberList().isEmpty());
        System.out.println(darPomorza.getShipGuestList().isEmpty());
        System.out.println(darPomorza.getShipCrewMemberList().size());
        System.out.println(darPomorza.getShipGuestList().size());


    }
}
