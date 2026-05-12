package ro.ase.cts.c7.implementare;

public class FelicitareDecorator extends BonDecorator{
    public FelicitareDecorator(IBonCasa bon) {
        super(bon);
    }

    @Override
    public void printeaza() {
        bon.printeaza();
        System.out.println("La multi ani!");
    }
}
