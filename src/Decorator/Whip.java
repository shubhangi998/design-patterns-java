package Decorator;

public class Whip implements Bevarage{
    Bevarage cb;
    public Whip(Bevarage cb){
        this.cb = cb;
    }
    @Override
    public double getCost() {
        return 10+ cb.getCost();
    }
}
