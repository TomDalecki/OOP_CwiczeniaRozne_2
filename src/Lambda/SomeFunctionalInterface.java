package Lambda;

public interface SomeFunctionalInterface {
    public abstract Integer calculateSomething(int a, int b);

    default void tylkoDlaSprawdzenia(){ //sprawdzenie czy działa Lambda jak są metdy defoult i private
        System.out.println("tylkoDlaSprawdzenia()");//Lambda nie zadziała jeżeli będzie więcej niż jedna metoda abstrakcyjna
        tylkoDlaSprawdzenia2();
    }

    private void tylkoDlaSprawdzenia2(){
        System.out.println("tylkoDlaSprawdzenia2()");
    }
}
