package ro.ase.cts.a6.implementare;

public class Facade {
    private Medic medic = new Medic();
    private Pacient pacient = new Pacient();
    private Salon salon = new Salon();

    public void gestionareSpital(){
        medic.confirmaInternare();
        pacient.verificaGravitate();
        salon.verificaPatLiber();
    }
}
