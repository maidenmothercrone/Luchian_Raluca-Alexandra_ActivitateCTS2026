package ro.ase.cts.a12.program;

import ro.ase.cts.a12.implementare.Pacient;
import ro.ase.cts.a12.implementare.Spital;

public class Main {
    static void main(String[] args) {
        Spital spital = new Spital();
        spital.abonareObserver(new Pacient("Gigel"));
        spital.abonareObserver(new Pacient("Ionel"));
        spital.abonareObserver(new Pacient("Andreea"));
        spital.setStare("Hantavirus");


    }
}
