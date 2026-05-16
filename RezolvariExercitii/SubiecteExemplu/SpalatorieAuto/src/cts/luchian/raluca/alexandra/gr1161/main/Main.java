package cts.luchian.raluca.alexandra.gr1161.main;

import cts.luchian.raluca.alexandra.gr1161.chain.*;
import cts.luchian.raluca.alexandra.gr1161.common.AbstractAutoWashOptions;
import cts.luchian.raluca.alexandra.gr1161.decorator.SpalareApaDedurizata;
import cts.luchian.raluca.alexandra.gr1161.decorator.SpalarePeriFine;
import cts.luchian.raluca.alexandra.gr1161.decorator.SpalareSasiu;

public class Main {

    static void main(String[] args) {
        FazaPrespalare prespalare  = new FazaPrespalare();
        FazaPerii perii  = new FazaPerii();
        FazaCeruire ceruire = new FazaCeruire();
        FazaUscare uscare = new FazaUscare();

        prespalare.setUrmator(perii);
        perii.setUrmator(ceruire);
        ceruire.setUrmator(uscare);

        System.out.println("Program complet:");
        prespalare.aplica(new ProgramSpalare(true, true, true, true));

        System.out.println("Program fara ceruire:");
        prespalare.aplica(new ProgramSpalare(true, true, false, true));

        System.out.println("Program minimal:");
        prespalare.aplica(new ProgramSpalare(true, false, false, true));


        AbstractAutoWashOptions program = new ProgramSpalare(true, true, false, true);
        SpalarePeriFine cuPeriFine = new SpalarePeriFine(program);
        SpalareSasiu cuSasiu = new SpalareSasiu(cuPeriFine);
        SpalareApaDedurizata complet = new SpalareApaDedurizata(cuSasiu);

        System.out.println("Perii fine: " + cuPeriFine.isPeriFineSelected());
        System.out.println("Sasiu: " + cuSasiu.isSpalareSasiu());
        System.out.println("Apa dedurizata: " + complet.isSpalareApaDedurizata());

        System.out.println("--- Spalare cu optiuni aditionale ---");
        prespalare.aplica(complet);
    }
}
