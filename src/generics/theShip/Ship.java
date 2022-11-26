package generics.theShip;

import java.util.ArrayList;
import java.util.List;

public class Ship<T extends Sailor, U>{

    private T sailor;
    private U guest;

    private final List<T> shipCrewMemberList = new ArrayList<>();
    private final List<U> shipGuestList = new ArrayList<>();

    public void onBoardCrewMember(T sailor){
        this.sailor = sailor;
        shipCrewMemberList.add(sailor);
    }
    public void onBoardGuest(U guest){
        this.guest = guest;
        shipGuestList.add(guest);
    }

    public void unBoardShip(T sailor, U guest){
        shipCrewMemberList.clear();
        shipGuestList.clear();
    }

    public List<T> getShipCrewMemberList() {
        return shipCrewMemberList;
    }

    public List<U> getShipGuestList() {
        return shipGuestList;
    }
}
