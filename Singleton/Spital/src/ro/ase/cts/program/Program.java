package ro.ase.cts.program;

import ro.ase.cts.spitale.Spital;

public class Program {
    static void main(String[] args) {
        Spital spital1 = Spital.getInstance();

        System.out.println(spital1);
    }
}
