package enumerator.testZajavka;

public enum Animal {
    DOG(true),
    CAT(false),
    BIRD(false),
    FISH(true);

    private boolean canSwim;

    Animal(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public boolean canSwim(){
        return canSwim;
    }

    public void learnToSwim(){
        this.canSwim = true;
    }
}
