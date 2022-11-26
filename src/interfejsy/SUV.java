package interfejsy;

public class SUV implements Drivable, Breakable{
    @Override
    public void startBreaking() {

    }

    @Override
    public void letsDrive() {

    }

    @Override
    public String startDriving(String firstDrive) {
        return null;
    }

    @Override
    public void emergencyBreaking() {
        //Breakable.super.emergencyBreaking();
    }

    //    @Override
//    public void letsDrive() {
//        System.out.println("I want to drive, SUV letsDrive");
//    }
//
//    @Override
//    public String startDriving(String firstDrive) {
//        return  "I'm starting to drive, it's my firstDrive of SUV. " + firstDrive;
//    }
//
//    @Override
//    public void startBreaking() {
//        System.out.println("Ive started to break - startBreaking");
//    }
//
//    @Override
//    public void emergencyBreaking() {
//        System.out.println("Im override emergencyBreaking method from SUV");
//    }
}
