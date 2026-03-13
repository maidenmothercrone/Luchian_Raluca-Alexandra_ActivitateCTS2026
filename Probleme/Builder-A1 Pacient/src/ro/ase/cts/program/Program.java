package ro.ase.cts.program;

import ro.ase.cts.builder.BuilderAbstract;
import ro.ase.cts.builder.Pacient;
import ro.ase.cts.builder.PacientBuilder;

public class Program {
    static void main(String[] args) {
        BuilderAbstract builder = new PacientBuilder();

        Pacient pacient1 = builder.setNume("ION").setCuPapuciCamera(true).build();

        System.out.println(pacient1);
    }
}
