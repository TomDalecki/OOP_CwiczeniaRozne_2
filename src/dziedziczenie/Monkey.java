package dziedziczenie;

public class Monkey extends Animal{

    private String name;
    private int age;

    public Monkey(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String eating() {
        super.eating(); //tutaj wywołuję nadpisywaną metodę z upperClassy
        String eating = "I like to eat BANANAS";
        return eating;
    }

// Brak metody toString i jeden wiersz się drukuje inaczej niż dla pozostałych "legs"

}
