package ro.ase.cts.flyweight.padure;

public class TipCopac {
    private String nume;
    private String culoare;

    public TipCopac(String nume, String culoare) {
        this.nume = nume;
        this.culoare = culoare;
        System.out.println("Tip copac nou creat: " + nume);
    }

    public void deseneaza(int x, int y){
        System.out.println(nume + " (" + culoare + " ) la pozitia (" + x + "," + y + ")" );
    }
}
