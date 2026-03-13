package ro.ase.cts.program;

import ro.ase.cts.prototype.Reteta;

public class Program {
    static void main(String[] args) {
        Reteta reteta = new Reteta("Aspirina", "analgezic", 24);
        Reteta reteta2 = (Reteta) reteta.copiere();

        System.out.println(reteta);
        System.out.println(reteta2);
    }
}
