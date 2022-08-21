package equals;

public class Main {

    public static void main(String[] args) {
    equalsExample();

//equals.Car first = new equals.Car();
//first.id =1;
//equals.Car second = new equals.Car();
//second.id = 1;
//        System.out.println(first.equals(second) ? "OK" : "NOT OK");

}

private static void equalsExample(){
    String aa = "aa";
    String bb = "aa";
    String cc = aa;

    System.out.println("aa==bb: ");
    System.out.println(aa==bb);
    System.out.println("--------------------");

    System.out.println("aa.equals(bb): ");
    System.out.println(aa.equals(bb));
    System.out.println("--------------------");

    System.out.println("cc==aa: ");
    System.out.println(cc==aa);
    System.out.println("--------------------");

    System.out.println("cc.equals(aa): ");
    System.out.println(cc.equals(aa));
    System.out.println("--------------------");
    System.out.println();

    equals.Car car1 = new equals.Car("Mazda", "CX-30", 1);
    equals.Car car2 = new equals.Car("Mazda", "CX-30", 1);
    equals.Car car3 = car2;


    System.out.println("car1==car2: ");
    System.out.println(car1==car2);
    System.out.println("--------------------");
    System.out.println("car3==car2: ");
    System.out.println(car3==car2);
    System.out.println("--------------------");
    System.out.println("car1.equalss(car2): ");
    System.out.println(car1.equals(car2));

}
}