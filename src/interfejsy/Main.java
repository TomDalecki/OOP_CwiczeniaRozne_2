package interfejsy;

public class Main {

    public static void main(String[] args) {
        Van van = new Van();
        Cabriolet cabriolet = new Cabriolet();
        SUV suv = new SUV();
        driveByCar(van);
        driveByCar(cabriolet);

//        System.out.println(suv.startDriving("GGGGGGGGGGG"));
//        van.letsDrive();
//        cabriolet.letsDrive();
//        System.out.println(van.startDriving("Hurrra"));
//        String drive = van.startDriving("Hurraaaaaaaaa");
////        System.out.println(drive);
//        van.gearUp();

//        Main main = new Main();
//        main.driveByCar(cabriolet);
//        main.driveByCar(van);
//        main.driveByCar(suv);

        suv.startBreaking();
        suv.emergencyBreaking();



    }

    public static void driveByCar(Drivable drive){
        drive.letsDrive();
    }




}
