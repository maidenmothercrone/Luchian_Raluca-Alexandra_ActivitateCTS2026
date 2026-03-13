package ro.ase.cts.builder;

public interface BuilderAbstract {

    BuilderAbstract setNume(String nume);
    BuilderAbstract setVarsta(int varsta);
    BuilderAbstract setCuPatRabatabil(boolean cuPatRabatabil);
    BuilderAbstract setCuMicDejunInclus(boolean cuMicDejunInclus);
    BuilderAbstract setCuPapuciCamera(boolean cuPapuciCamera);
    BuilderAbstract setCuHalatInterior(boolean cuHalatInterior);

    Pacient build();
}
