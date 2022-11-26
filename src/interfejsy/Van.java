package interfejsy;

import java.io.Serializable;

public class Van implements Drivable, GearUpDownAble, Serializable {
    //nie muszę implementować "Breakable" bo "GearUp..." go rozszerza
    @Override
    public void startBreaking() {
        System.out.println("I'm starting to break, Van startBreaking");
    }

    @Override
    public void letsDrive() {
        System.out.println("I want to drive, Van letsDrive");
    }

    @Override
    public String startDriving(String firstDrive) {
        return "I'm starting to drive, it's my firstDrive of Van. " + firstDrive;
    }

    @Override
    public void gearUp() {
        System.out.println("I've put the gearUp in Van");
    }

    @Override
    public void gearDown() {
        System.out.println("I've made gearDown in Van");
    }
}
