package ro.ase.cts.program;

import ro.ase.cts.builder.BuilderAbstract;
import ro.ase.cts.builder.ContBancar;
import ro.ase.cts.builder.ContBancarBuilder;

public class Program {
    static void main(String[] args) {
        BuilderAbstract builder = new ContBancarBuilder();

        ContBancar bcr = builder.setNumeBanca("BCR").setContSalariu(true).build();
        System.out.println(bcr);
    }
}
