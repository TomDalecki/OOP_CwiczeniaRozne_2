package interfejsy.Exercises;

public interface TestInterface {

    public String name = "Jacek";//public static final


    public abstract String someInterface();//public abstract

    public default void someDefaultMethod() {
        System.out.println("someInterfaceMethod/defaultMethodPartOne " + name);
        defaultMethodPartTwo();
    }



    private void defaultMethodPartTwo() {
        String name2 = name;
        System.out.println("defaultMethodPartTwo " + name2);
    }

}
