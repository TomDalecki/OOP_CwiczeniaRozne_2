package interfejsy;

public class Cabriolet implements Drivable{
    @Override
    public void letsDrive() {
        System.out.println("I want to drive, Cabriolet letsDrive");

    }

    @Override
    public String startDriving(String firstDrive) {
        return "I'm starting to drive, it's my firstDrive of Cabriolet. " + firstDrive;
    }
}
