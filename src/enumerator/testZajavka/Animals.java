package enumerator.testZajavka;

public enum Animals implements CanSwim{
    DOG(true),
    CAT(false);
    private boolean canSwim;
    Animals(boolean canSwim){
        this.canSwim = canSwim;
    }
    public boolean canSwim(){
        return canSwim;
    }

}
