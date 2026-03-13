package ro.ase.cts.builder;

public class PacientBuilder implements BuilderAbstract{
    private String nume;
    private int varsta;
    private boolean cuPatRabatabil;
    private boolean cuMicDejunInclus;
    private boolean cuPapuciCamera;
    private boolean cuHalatInterior;

    public PacientBuilder() {
        this.nume = "Joe Doe";
        this.cuPatRabatabil = false;
        this.cuMicDejunInclus = false;
        this.cuPapuciCamera = false;
        this.cuHalatInterior = false;
    }

    @Override
    public BuilderAbstract setNume(String nume) {
        this.nume = nume;
        return this;
    }

    @Override
    public BuilderAbstract setVarsta(int varsta) {
        this.varsta = varsta;
        return this;
    }

    public BuilderAbstract setCuPatRabatabil(boolean cuPatRabatabil) {
        this.cuPatRabatabil = true;
        return this;
    }

    public BuilderAbstract setCuMicDejunInclus(boolean cuMicDejunInclus) {
        this.cuMicDejunInclus = true;
        return this;
    }

    public BuilderAbstract setCuPapuciCamera(boolean cuPapuciCamera) {
        this.cuPapuciCamera = true;
        return this;
    }

    public BuilderAbstract setCuHalatInterior(boolean cuHalatInterior) {
        this.cuHalatInterior = true;
        return this;
    }

    public Pacient build(){
        return new Pacient(nume, varsta,  cuMicDejunInclus, cuPatRabatabil, cuPapuciCamera, cuHalatInterior);
    }
}
