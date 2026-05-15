package ro.ase.cts.a15.implementation;

public class Medic {
    private String nume;
    public Medic(String nume) { this.nume = nume; }

    public void interneaza(String pacient) {
        System.out.println("Dr." + nume + ": interneaza pacientul " + pacient);
    }
    public void trateaza(String pacient) {
        System.out.println("Dr." + nume + ": trateaza imediat pacientul " + pacient);
    }

    public void externeaza(String pacient){
        System.out.println("Dr." + nume + ": externeaza pacientul " + pacient);
    }
}
