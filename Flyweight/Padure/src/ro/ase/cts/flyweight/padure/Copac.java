package ro.ase.cts.flyweight.padure;

public class Copac{
    private TipCopac tip;
    private int x, y;

    public Copac(TipCopac tip, int x, int y) {
        this.tip = tip;
        this.x=x;
        this.y=y;
    }

    public void deseneaza(){
        tip.deseneaza(x,y);
    }





}
