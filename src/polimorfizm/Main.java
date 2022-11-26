package polimorfizm;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
// Przykład z Car jest z wykładu Karola
        Cabriolet cabriolet1 = new Cabriolet("Red", true);
        Car cabriolet2 = new Cabriolet("Blue", false);
        Object cabriolet3 = new Cabriolet("White", true);

        SUV suv1 = new SUV("Yellow", 1.8);
        Car suv2 = new SUV("Brown", 1.9);
        Object suv3 = new SUV("Black", 2.0);

        //Zachowanie polimorficzne
        cabriolet1.describe();
        System.out.println("-------------");
        cabriolet2.describe();
        System.out.println("-------------");
        //cabriolet3.describe();
        //chodzi o ten bląd
        // metodę wywołuję na zmiennej, ale zmienna może wywołać tylko takie metody jakie ma zapisane w swojej klasie
        // w Object nie ma metody "describe
        System.out.println("-------------");
        System.out.println("-------------");
        cabriolet2.describe();
        suv2.describe();

        // typowe zachowanie poliformiczne:
        // wywołujemy obiekt/zachowanie na zmiennej z klasy Car, ale otrzymujemy obiekt/zachowanie z klasy Cabriolet/SUV
        // ponieważ metoda z klasy Car została nadpisana


// Przykład z Animal jest z podsumowania

//        Animal[] animals = new Animal[3];
//
//        for (int i = 0; i < animals.length; i++) {
//            if(i % 2 == 0){
//                animals[i] = new Ostrich();
//            } else {
//                animals[i] = new Mouse();
//            }
//        }
//        for (Animal animal: animals) {
//            animal.swim();
//        }
//
//        System.out.println(Arrays.toString(animals));
//
//
 }
}
