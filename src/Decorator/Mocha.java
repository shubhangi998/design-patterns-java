package Decorator;

public class Mocha implements Bevarage{
    Bevarage cb;
    public Mocha(Bevarage cb){
        this.cb = cb;
    }
    @Override
    public double getCost() {
        return 25 + cb.getCost();
    }
}
