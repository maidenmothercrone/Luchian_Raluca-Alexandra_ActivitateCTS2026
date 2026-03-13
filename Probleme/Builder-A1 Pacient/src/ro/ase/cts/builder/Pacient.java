package ro.ase.cts.builder;

public class Pacient{
    private String nume;
    private int varsta;

    private boolean cuPatRabatabil;
    private boolean cuMicDejunInclus;
    private boolean cuPapuciCamera;
    private boolean cuHalatInterior;

    public Pacient(String nume, int varsta, boolean cuPatRabatabil, boolean cuMicDejunInclus, boolean cuPapuciCamera, boolean cuHalatInterior) {
        this.nume = nume;
        this.varsta = varsta;
        this.cuPatRabatabil = cuPatRabatabil;
        this.cuMicDejunInclus = cuMicDejunInclus;
        this.cuPapuciCamera = cuPapuciCamera;
        this.cuHalatInterior = cuHalatInterior;
    }

    public Pacient(){
        this.cuPatRabatabil = false;
        this.cuMicDejunInclus = false;
        this.cuPapuciCamera = false;
        this.cuHalatInterior = false;
    }

    public Pacient(boolean cuPatRabatabil, boolean cuPapuciCamera, boolean cuHalatInterior, boolean cuMicDejunInclus) {
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setCuPatRabatabil(boolean cuPatRabatabil) {
        this.cuPatRabatabil = cuPatRabatabil;
    }

    public void setCuMicDejunInclus(boolean cuMicDejunInclus) {
        this.cuMicDejunInclus = cuMicDejunInclus;
    }

    public void setCuPapuciCamera(boolean cuPapuciCamera) {
        this.cuPapuciCamera = cuPapuciCamera;
    }

    public void setCuHalatInterior(boolean cuHalatInterior) {
        this.cuHalatInterior = cuHalatInterior;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", cuPatRabatabil=").append(cuPatRabatabil);
        sb.append(", cuMicDejunInclus=").append(cuMicDejunInclus);
        sb.append(", cuPapuciCamera=").append(cuPapuciCamera);
        sb.append(", cuHalatInterior=").append(cuHalatInterior);
        sb.append('}');
        return sb.toString();
    }
}
