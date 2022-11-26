package enumerator;

public enum VolkswagenWithVariable {
    PASSAT("white", 2020),
    GOLF("red", 1997),
    ARTEON("black", 2022),
    TIGUAN("blue", 2019);

    //private String [] colors;

    private String message;
    VolkswagenWithVariable(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    VolkswagenWithVariable(String white, int i) {

    }
}
