package Decorator;
public class Main {
    public static void main(String[] args) {
        Bevarage coffee = new Expresso();
        coffee = new Mocha(coffee);
        coffee = new Whip(coffee);
        System.out.println(coffee.getCost());
    }
}