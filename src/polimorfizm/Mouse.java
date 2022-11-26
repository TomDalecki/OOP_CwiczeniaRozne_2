package polimorfizm;

public class Mouse implements Animal{
    @Override
    public void run() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {
        System.out.println("Mouse - Im swimming");
    }
}
